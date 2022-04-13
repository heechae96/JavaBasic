package ch13;

import java.util.ArrayList;

public class Ch13_34_35 {

	public static void main(String[] args) throws Exception {

		// wait()과 notify()
		//	-> 동기화의 효율을 높이기 위해 wait(), notify()를 사용
		//	-> Object클래스에 정의되어 있으며, 동기화 블록 내에서만 사용할 수 있다
		//	wait()
		//	-> 객체의 lock을 풀고 쓰레드를 해당 객체의 waiting pool에 넣는다
		//										-> 대기실 개념
		//	notify()
		//	-> waiting pool에서 대기중인 쓰레드 중의 하나를 깨운다
		//	notifyAll()
		//	-> waiting pool에서 대기중인 모든 쓰레드를 깨운다
		
		// 동기화를 안 한 경우
		//	-> 예외가 발생함
		//	-> 1. 요리사가 Table에 요리를 추가하는 과정에 손님이 요리를 먹음
		//		-> 읽기수행중 추가나 삭제가 일어난 경우
		//	-> 2. 하나 남은 요리를 손님2가 먹으려 하는데, 손님1이 먹음

		
		// 동기화를 한 경우
		// 	여전히 문제!
		//	-> 음식이 없을 때, 손님이 Table의 lock을 쥐고 안놓는다
		//	-> 요리가사 lock을 얻지못해서 Table에 음식을 추가할 수 없다
		Table table = new Table(); // 여러 쓰레드가 공유하는 객체

		new Thread(new Cook(table), "COOK").start();
		new Thread(new Customer(table, "donut"),  "CUST1").start();
		new Thread(new Customer(table, "burger"), "CUST2").start();

		Thread.sleep(5000);
		System.exit(0);
	}

}

class Customer implements Runnable {
	private Table  table;
	private String food;

	Customer(Table table, String food) {
		this.table = table;  
		this.food  = food;
	}

	public void run() {
		while(true) {
			try { Thread.sleep(10);} catch(InterruptedException e) {}
			String name = Thread.currentThread().getName();

			if(eatFood())
				System.out.println(name + " ate a " + food);
			else 
				System.out.println(name + " failed to eat. :(");
		} // while
	}

	boolean eatFood() { return table.remove(food); }
}

class Cook implements Runnable {
	private Table table;

	Cook(Table table) {	this.table = table; }

	public void run() {
		while(true) {
			int idx = (int)(Math.random()*table.dishNum());
			table.add(table.dishNames[idx]);
			try { Thread.sleep(100);} catch(InterruptedException e) {}
		} // while
	}
}

class Table {
	String[] dishNames = { "donut","donut","burger" };
	
	final int MAX_FOOD = 6;
	
	private ArrayList<String> dishes = new ArrayList<>();
	
	// 동기화
	public synchronized void add(String dish) { // synchronized를 추가
		if(dishes.size() >= MAX_FOOD)	
			return;
		dishes.add(dish);
		System.out.println("Dishes:" + dishes.toString());
	}

	public boolean remove(String dishName) {
		// 동기화
		synchronized(this) {	
			while(dishes.size()==0) {
				String name = Thread.currentThread().getName();
				System.out.println(name+" is waiting.");
				try { Thread.sleep(500);} catch(InterruptedException e) {}	
			}

			for(int i=0; i<dishes.size();i++)
				if(dishName.equals(dishes.get(i))) {
					dishes.remove(i);
					return true;
				}
		} // synchronized

		return false;
	}

	public int dishNum() { return dishNames.length; }
}

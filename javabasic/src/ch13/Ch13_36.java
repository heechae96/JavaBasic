package ch13;

import java.util.ArrayList;

public class Ch13_36 {

	public static void main(String[] args) throws Exception {

		// 동기화를 한 경우
		// 	여전히 문제!
		//	-> 음식이 없을 때, 손님이 Table의 lock을 쥐고 안놓는다
		//	-> 요리가사 lock을 얻지못해서 Table에 음식을 추가할 수 없다
		
		// 해결책
		//	-> 음식이 없을 때, wait()으로 손님이 lock을 풀고 기다리게 하자
		//	-> 요리사가 음식을 추가하면, notify()로 손님에게 알리자.(손님이 lock을 재획득)
		
		// 요리사는 테이블이 가득 차면 대기(wait)하고, 
		// 음식을 추가하고 나면 손님에게 통보(notify)한다
		
		// 손님은 음식이 없으면 대기(wait)하고,
		// 음식을 먹고나면 요리사에게 통보(notify)한다
		
		// 원하는 음식이 없는 경우 손님은 대기(wait)한다
		
		// 여전히 문제!
		//	ex) 요리사가 아닌 손님이 통지를 받고, 원하는 음식이 없어서 다시 기다려야함!
		//	-> 누구를 기다리라고 할지, 누구에게 통보할지 불분명
		//		-> 대기실에는 손님과 요리사가 존재
		//			-> 한 사람을 깨우거나 전체를 다 깨워야 함...
		//				-> lock & condition 이 나옴!
		//					-> 자바의 정석 3판!
	
		Table2 table = new Table2();

		new Thread(new Cook2(table), "COOK").start();
		new Thread(new Customer2(table, "donut"),  "CUST1").start();
		new Thread(new Customer2(table, "burger"), "CUST2").start();
		Thread.sleep(2000);
		System.exit(0);
	}

}

class Customer2 implements Runnable {
	private Table2  table;
	private String food;

	Customer2(Table2 table, String food) {
		this.table = table;  
		this.food  = food;
	}

	public void run() {
		while(true) {
			try { Thread.sleep(100);} catch(InterruptedException e) {}
			String name = Thread.currentThread().getName();
			
			table.remove(food);
			System.out.println(name + " ate a " + food);
		} // while
	}
}

class Cook2 implements Runnable {
	private Table2 table;
	
	Cook2(Table2 table) { this.table = table; }

	public void run() {
		while(true) {
			int idx = (int)(Math.random()*table.dishNum());
			table.add(table.dishNames[idx]);
			try { Thread.sleep(10);} catch(InterruptedException e) {}
		} // while
	}
}

class Table2 {
	String[] dishNames = { "donut","donut","burger" }; // donut의 확률을 높인다.
	final int MAX_FOOD = 6;
	private ArrayList<String> dishes = new ArrayList<>();

	public synchronized void add(String dish) {
		while(dishes.size() >= MAX_FOOD) {
				String name = Thread.currentThread().getName();
				System.out.println(name+" is waiting.");
				try {
					wait(); // COOK쓰레드를 기다리게 한다.
					Thread.sleep(500);
				} catch(InterruptedException e) {}	
		}
		dishes.add(dish);
		notify();  // 기다리고 있는 CUST를 깨우기 위함.
		System.out.println("Dishes:" + dishes.toString());
	}

	public void remove(String dishName) {
		synchronized(this) {	
			String name = Thread.currentThread().getName();

			while(dishes.size()==0) {
					System.out.println(name+" is waiting.");
					try {
						wait(); // CUST쓰레드를 기다리게 한다.
						Thread.sleep(500);
					} catch(InterruptedException e) {}	
			}

			while(true) {
				for(int i=0; i<dishes.size();i++) {
					if(dishName.equals(dishes.get(i))) {
						dishes.remove(i);
						notify(); // 잠자고 있는 COOK을 깨우기 위함 
						return;
					}
				} // for문의 끝

				try {
					System.out.println(name+" is waiting.");
					wait(); // 원하는 음식이 없는 CUST쓰레드를 기다리게 한다.
					Thread.sleep(500);
				} catch(InterruptedException e) {}	
			} // while(true)
		} // synchronized
	}
	public int dishNum() { return dishNames.length; }
}

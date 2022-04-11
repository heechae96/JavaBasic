package ch13;

public class Ch13_14_15 {

	public static void main(String[] args) {

		// 쓰레드의 우선순위(priority of thread)
		//	-> 작업의 중요도에 따라 쓰레드의 우선순위를 다르게 하여 특정 쓰레드가
		//		더 많은 작업시간을 갖게 할 수 있다
		//	-> 1부터 10까지 부여 가능. default 5
		
		// 쓰레드의 우선순위는 꼭 절대적이진 않다.
		// 작업의 중요도에 따라 우선순위를 설정했더라도
		// 희망사항일 뿐이고 OS스케쥴러가 알아서 한다
		
		// 쓰레드의 우선순위를 지정한 값으로 변경
		// void setPriority(int newPriority)
		
		// 쓰레드의 우선순위를 반환
		// int getPriority()
		
		ThreadEx6_1 th1 = new ThreadEx6_1();
		ThreadEx6_2 th2 = new ThreadEx6_2();

//		th1.setPriority(1);
		th2.setPriority(7);

		System.out.println("Priority of th1(-) : " + th1.getPriority());
		System.out.println("Priority of th2(|) : " + th2.getPriority());
		th1.start();
		th2.start();
	}

}

class ThreadEx6_1 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print("-");
			for(int x=0; x < 10000000; x++);	// 시간지연을 위해
		}
	}
}

class ThreadEx6_2 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print("|");
			for(int x=0; x < 10000000; x++);
		}
	}
}
package ch13;

public class Ch13_3_6 {

	public static void main(String[] args) {

		// 쓰레드의 구현과 실행
		
		// 1. Thread클래스를 상속
		
		// 2. Runnable인터페이스를 구현
		//	-> 자바는 단일상속만 가능하므로 좀 더 유연함!
		
		// 쓰레드의 실행
		//	-> start()
		
		// 쓰레드를 생성한 후에 start()를 호출해야 쓰레드가 작업을 시작한다
		//	-> 실행 가능한 상태가 된 것. 바로 실행하는것 x
		//	-> 순서는 OS스케줄러가 결정한다
		//		-> 먼저 스타트 했다고, 먼저 실행되는것 x
		
		
		
		ThreadEx1_1 t1 = new ThreadEx1_1();

		Runnable r = new ThreadEx1_2();
		Thread t2 = new Thread(r);	  // 생성자 Thread(Runnable target)

		t1.start();
		t2.start();
		
		// start()와 run()
		//	-> run()을 구현했는데 왜 start()를 실행할까?
		//		-> start()를 호출해야 새로운 스택이 생기고 거기에 run()이 올라간다
		//						-> 서로 독립적인 작업 수행!
		
	}

}

class ThreadEx1_1 extends Thread { // 1번 방법
	public void run() {
		for(int i=0; i < 50; i++) {
			System.out.println(getName()); // 조상인 Thread의 getName()을 호출
		}
	}
}

class ThreadEx1_2 implements Runnable { // 2번 방법
	public void run() {
		for(int i=0; i < 50; i++) {
			// Thread.currentThread() - 현재 실행중인 Thread를 반환한다.
			System.out.println(Thread.currentThread().getName());
		}
	}
}
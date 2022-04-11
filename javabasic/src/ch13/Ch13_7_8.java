package ch13;

public class Ch13_7_8 {

	static long startTime = 0;

	public static void main(String[] args) {

		// main쓰레드
		//	-> main메서드의 코드를 수행하는 쓰레드
		//	-> 쓰레드는 '사용자 쓰레드'와 '데몬 쓰레드' 두 종류가 있다
		// 	-> 실행중인 사용자 쓰레드가 하나도 없을 때 프로그램은 종료된다
		
		
		ThreadEx11_1 th1 = new ThreadEx11_1();
		ThreadEx11_2 th2 = new ThreadEx11_2();
		th1.start();
		th2.start();
		startTime = System.currentTimeMillis();

		try {
			th1.join();	// main쓰레드가 th1의 작업이 끝날 때까지 기다린다.
			th2.join();	// main쓰레드가 th2의 작업이 끝날 때까지 기다린다.
		} catch(InterruptedException e) {}

		System.out.print("소요시간:" + (System.currentTimeMillis() - Ch13_7_8.startTime));
		
		
	}

}

class ThreadEx11_1 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print(new String("-"));
		}
	} // run()
}

class ThreadEx11_2 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print(new String("|"));
		}
	} // run()
}

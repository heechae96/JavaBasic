package ch13;

public class Ch13_28 {

	static long startTime = 0;
	
	public static void main(String[] args) {

		// join()
		//	-> 지정된 시간동안 특정 쓰레드가 작업하는 것을 기다린다
		
		// 작업이 모두 끝날 때까지
		// void join()
		// 천분의 일초 동
		// void join(long millis)
		// 천분의 일초 + 나노초 동안
		// void join(long millis, int nanos)

		ThreadEx11_11 th1 = new ThreadEx11_11();
		ThreadEx11_22 th2 = new ThreadEx11_22();
		th1.start();
		th2.start();
		
		// 시작시간
		startTime = System.currentTimeMillis();

		try {
			th1.join();	// main쓰레드가 th1의 작업이 끝날 때까지 기다린다.
			th2.join();	// main쓰레드가 th2의 작업이 끝날 때까지 기다린다.
		} catch(InterruptedException e) {}

		System.out.print("소요시간:" + (System.currentTimeMillis() - Ch13_28.startTime));
	}

}

class ThreadEx11_11 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print(new String("-"));
		}
	} // run()
}

class ThreadEx11_22 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print(new String("|"));
		}
	} // run()
}

package ch13;

public class Ch13_26_27 {

	public static void main(String[] args) {

		// suspend(), resume(), stop()
		//	-> 쓰레드의 실행을 일시정지, 재개, 완전정지 시킨다
		
		// 위 메서드는 deprecated되었다
		//	-> 사용권장x, dead-lock 교착상태 빠지기 쉬움
		//	-> 직접 구현하는 방법을 사용하면 해결가능
		
//		RunImplEx10 r = new RunImplEx10();
//		Thread th1 = new Thread(r, "*");
//		Thread th2 = new Thread(r, "**");
//		Thread th3 = new Thread(r, "***");
		MyThread th1 = new MyThread("*");
		MyThread th2 = new MyThread("**");
		MyThread th3 = new MyThread("***");
		th1.start();
		th2.start();
		th3.start();

		try {
			Thread.sleep(2000);
			th1.suspend();	// 쓰레드 th1을 잠시 중단시킨다.
			Thread.sleep(2000);
			th2.suspend();
			Thread.sleep(3000);
			th1.resume();	// 쓰레드 th1이 다시 동작하도록 한다.
			Thread.sleep(3000);
			th1.stop();		// 쓰레드 th1을 강제종료시킨다.
			th2.stop();
			Thread.sleep(2000);
			th3.stop();
		} catch (InterruptedException e) {}	
		
	}

}

//class RunImplEx10 implements Runnable {
//	public void run() {
//		while(true) {
//			System.out.println(Thread.currentThread().getName());
//			try {
//				Thread.sleep(1000);
//			} catch(InterruptedException e) {}
//		}
//	} // run()
//}

class MyThread implements Runnable {
	volatile boolean suspended = false;	// volatile : 쉽게 바뀌는 변수
	volatile boolean stopped = false;	//	-> 복사본을 사용하지 않고 원본을 사용!
	
	Thread th;
	
	MyThread(String name){
		th = new Thread(this, name);	// Thread(Runnable r, String name)
	}
	
	void start() {
		th.start();
	}
	
	void stop() {
		stopped = true;
	}
	
	void suspend() {
		suspended = true;
	}
	
	void resume() {
		suspended = false;
	}
	
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
		}
	} // run()
}

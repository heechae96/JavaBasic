package ch13;

public class Ch13_22_23 {

	public static void main(String[] args) {

		// sleep()
		//	-> 현재 쓰레드를 지정된 시간동안 멈추게 한다(잠자게 한다)
		// cf. static 메소드. yield()와 마찬가지로 자기자신에게만 적용
		//	-> 특정 쓰레드를 지정해서 멈추게 하는 것은 불가능
		
		// 천분의 일초 단위
		// static void sleep(long millis)
		// 천분의 일초 + 나노초
		// static void sleep(long millis, int nanos)
		
		//	-> 예외처리를 해야한다.
		//		-> InterruptedException이 발생하면 깨어남)
//		try {
//			// 쓰레드를 0.0015초 동안 멈추게 한다
//			Thread.sleep(1, 500000);
//		}catch (InterruptedException e) {}
		
		ThreadEx8_1 th1 = new ThreadEx8_1();
		ThreadEx8_2 th2 = new ThreadEx8_2();
		th1.start(); 
		th2.start();

//		try {
//			// main이 잠들게된다..
//			//	-> th1이 잠드는거로 오해가능성..
//			// th1.sleep(2000);	
//			// static메소드 이므로 클래스.메소드가 맞다!
//			Thread.sleep(2000);	
//		} catch(InterruptedException e) {}

		delay(2000);
		System.out.print("<<main 종료>>");
		
	}	
	
	// 재울때마다 try-catch하는게 불편해서 메소드를 만듦
	static void delay(long millis) {
		try {
			Thread.sleep(2000);
			// 필수처리 예외라 안쓰면 에러!
		} catch(InterruptedException e) {}
	}
}

class ThreadEx8_1 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) System.out.print("-");
		System.out.print("<<th1 종료>>");
	} // run()
}

class ThreadEx8_2 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) System.out.print("|");
		System.out.print("<<th2 종료>>");
	} // run()
}
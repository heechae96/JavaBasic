package ch13;

import javax.swing.JOptionPane;

public class Ch13_24_25 {

	public static void main(String[] args) {

		// interrupt()
		//	-> 대기상태(WAITING)인 쓰레드를 실행대기 상태(RUNNABLE)로 만든다
		//		-> 작업중지 상태(sleep(), join(), wait())
		
		// 쓰레드의 interrupted상태를 false에서 true로 변경
		//	-> ★Thread에서 처음에는 false★
		//	-> void interrupt()
		// 쓰레드의 interrupted상태를 반환
		//	-> boolean isInterrupted()
		// ★현재 쓰레드의 interrupted상태를 알려주고, false로 초기화★
		//	-> static boolean interrupted()
		
		ThreadEx9_1 th1 = new ThreadEx9_1();
		th1.start();

		System.out.println("isInterrupted():"+ th1.isInterrupted()); // false
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요."); 
		System.out.println("입력하신 값은 " + input + "입니다.");
		th1.interrupt();  // interrupt()를 호출하면, interrupted상태가 true가 된다.
		System.out.println("isInterrupted():"+ th1.isInterrupted()); // true
		System.out.println("isInterrupted():"+ th1.isInterrupted()); // true
		// main쓰레드가 interrupt되었는지 확인
		//	-> th1이 interrupt된 것. main은 x
		System.out.println("Interrupted():"+ Thread.interrupted()); // false
	}

}

class ThreadEx9_1 extends Thread {
	public void run() {
		int i = 10;

		while(i!=0 && !isInterrupted()) {
			System.out.println(i--);
			for(long x=0;x<2500000000L;x++); // 시간 지연
		}
		System.out.println("카운트가 종료되었습니다.");
		System.out.println("Interrupted():"+ this.isInterrupted()); // true
		System.out.println("Interrupted():"+ isInterrupted()); // true
		System.out.println("Interrupted():"+ Thread.interrupted()); // true
		// interrupted()가 false로 초기화 시키기때문
		System.out.println("Interrupted():"+ interrupted()); // false
	} 
}
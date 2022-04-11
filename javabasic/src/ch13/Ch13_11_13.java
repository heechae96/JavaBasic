package ch13;

import javax.swing.JOptionPane;

public class Ch13_11_13 {

	public static void main(String[] args) {

		// 쓰레드의 I/O 블락킹(blocking)
		//		-> 입/출력
		//	-> 블락킹 구간이 있을 경우, 멀티스레드가 싱글스레드보다 빠를 수 있다
		
		System.out.println("싱글스레드");
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요."); 
		System.out.println("입력하신 값은 " + input + "입니다.");

		for(int i=10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);  // 1초간 시간을 지연한다.
			} catch(Exception e ) {}
		}
		
		
		System.out.println("멀티스레드");
		ThreadEx5_1 th1 = new ThreadEx5_1();
		th1.start();

		String input2 = JOptionPane.showInputDialog("아무 값이나 입력하세요."); 
		System.out.println("입력하신 값은 " + input2 + "입니다.");
	}

}

class ThreadEx5_1 extends Thread {
	public void run() {
		for(int i=10; i > 0; i--) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch(Exception e ) {}
		}
	} // run()
}
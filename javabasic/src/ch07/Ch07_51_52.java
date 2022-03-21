package ch07;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Ex7_17 {
	Object iv = new Object(){ void method(){} };         // 익명 클래스
	static Object cv = new Object(){ void method(){} };  // 익명 클래스

	void myMethod() {
		Object lv = new Object(){ void method(){} };     // 익명 클래스
	}
}

public class Ch07_51_52 {

	public static void main(String[] args) {
		
		// 익명클래스(anonymous class)
		// 이름이 없는 일회용 클래스
		// 	-> 정의와 생성을 동시에
		
		/*
		new 조상클래스이름() {
			// 멤버선언
		}
		
		// 또는
		
		new 구현인터페이스이름() {
			// 멤버 선언
		}
		*/
		
		
		/*
		class Ex7_18 {
			public static void main(String[] args) {
				Button b = new Button("Start");
				b.addActionListener(new EventHandler());
			}
		}
		
		class EventHandler implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred!!!");
			}
		
		}
		*/
		
		// 익명클래스로 바꾸기
		Button b = new Button("Start");
		b.addActionListener(new ActionListener() {	// 클래스의 정의와 객체 생성을 동시에
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred!!!");
			}
		});

	}
}

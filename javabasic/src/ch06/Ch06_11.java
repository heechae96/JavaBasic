package ch06;

public class Ch06_11 {

	public static void main(String[] args) {

		// 선언 위치에 따른 변수의 종류	
		
		// 1. 클래스 영역(iv: instance varibale) 	/ 인스턴스 변수
		//		-> 생성시기
		//			: ★인스턴스가 생성되었을때★ 
		
		//		      (cv:  iv에 static추가)			/ 클래스변수(공유변수)(스태틱변수)
		//		-> 생성시기
		//			: 클래스가 메모리에 올라갈때
		//				-> iv와 다르게 객체가 생성되기 전에 존재
		//					-> 아무때나 쓸 수 있다!!
		
		// 2. 메서드 영역(lv: local variable)		/ 지역변수
		//		-> 생성시기
		//			: 변수 선언문이 수행되었을때
		//				-> 메서드 종료시 자동제거!
		
		/*
		 * class Variables{
		 * 	int iv;
		 * 	static int cv;
		 * 
		 *  void method(){
		 *   int lv = 0;
		 *  }
		 * }
		 */
		
		// 객체 
		// 프로그래밍 관점에서 쉽게 "iv를 묶어둔것"이라 생각하자
		
	}

}


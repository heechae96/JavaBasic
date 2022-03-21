package ch07;

class AAA{		// AAA는 BBB의 외부 클래스
	int i = 100;
	BBB b = new BBB();
	
	class BBB{	// BBB는 AAA의 내부 클래스
		void method() {
//			AAA a = new AAA();
//			System.out.println(a.i);
			System.out.println(i);	// 객체 생성없이 외부 클래스의 멤버 접근가능
		}
	}
}


//class CCC{
//	BBB b = new BBB();
//}

public class Ch07_42_44 {

	public static void main(String[] args) {

		// 내부클래스
		// 	-> 클래스 안의 클래스
		/*
		class A{
			class B{
				
			}
		}
		*/
		// 내부 클래스의 장점
		//	-> 1. 내부 클래스에서 외부 클래스의 멤버들을 쉽게 접근할 수 있다
		// 	-> 2. 코드의 복잡성을 줄일 수 있다(캡슐화)
		
//		BBB b = new BBB();
//		b.method();
		
		// 내부 클래스의 종류와 유효범위(scope)는 변수와 동일
		/*
		class Outer{
			int iv = 0;
			static int cv = 0;
			void myMethod() {
				int lv = 0;
			}
		}
		
		Class Outer{
			class InstanceInner{}
			static class StaticInner{}
			void myMethod() {
				class LocalInner{}
			}
		}
		*/
		
		// 익명클래스
		// annnoymous class
		//	-> 클래스의 선언과 객체의 생성을 동시에 하는 이름없는 클래스(일회용)
		
	}

}

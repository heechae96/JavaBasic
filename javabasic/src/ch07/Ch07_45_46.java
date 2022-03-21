package ch07;

public class Ch07_45_46 {
	class InstanceInner { 
		int iv = 100; 
//		static int cv = 100;            // 에러! static변수를 선언할 수 없다 
		final static int CONST = 100;   // final static은 상수이므로 허용
	} 

   static class StaticInner { 
		int iv = 200; 
		static int cv = 200;    // static클래스만 static멤버를 정의할 수 있다 
	} 

	void myMethod() { 
		class LocalInner { 
			int iv = 300; 
//			static int cv = 300;             // 에러! static변수를 선언할 수 없다
			final static int CONST = 300;    // final static은 상수이므로 허용
		} 
		int i = LocalInner.CONST;	// 지역 내부 클래스의 static상수는 메서드 내에서만!
	} 
 
	public static void main(String[] args) {

		// 내부클래스의 제어자와 접근성
		
		// 내부 클래스의 제어자는 변수에 사용 가능한 제어자와 동일
		//	-> 클래스 앞에는 public이나 (default)만 가능하다
		//	-> 멤버(변수, 메소드)는 4가지 가능(public, protected, default, private)
		/*
		class Outer{
			private int iv = 0;
			protected static int cv = 0;
			
			void myMethod() {
				int lv = 0;
			}
		}
		
		Class Outer{
			private class InstanceInner{}
			protected static class StaticInner{}
			
			void myMethod() {
				class LocalInner{}
			}
		}
		*/
		System.out.println(InstanceInner.CONST); 
		System.out.println(StaticInner.cv); 
//		System.out.println(LocalInner.CONST);	// 지역 내부 클래스는 메서드 내에서만!

		
				
	}
	// outer
	private int outerIv = 0;
	static  int outerCv = 0;

	class InstanceInner2 {
		int iiv  = outerIv;  // ★★★외부 클래스의 private멤버도 접근 가능★★★
		int iiv2 = outerCv;
	}

	static class StaticInner2 {
// static 클래스는 외부 클래스의 인스턴스 멤버에 접근 할 수 없다!
//		int siv = outerIv;
		static int scv = outerCv;
	}

	// 상수는 constant pool로 따로 관리한다.. 뒤에서 배울것
	void myMethod2() {	// ★★★지역 내부 클래스를 감싸고 있는 메서드의 상수만 사용가능!★★★
		int lv = 0;			// 변수인데 값이 변하지 않으면 상수 취급..
		final int LV = 0;  // JDK1.8부터 final 생략가능

		class LocalInner2 {
			int liv  = outerIv;
			int liv2 = outerCv;
			//	외부 클래스의 지역 변수는 final이 붙은 변수(상수)만 접근 가능!
//			int liv3 = lv;	// 에러!!!(JDK1.8부터 에러 아님!)
			int liv4 = LV;	// OK
		}
	}
}

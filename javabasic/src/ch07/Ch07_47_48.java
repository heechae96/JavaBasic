package ch07;

public class Ch07_47_48 {
	
	// outer
	private int outerIv = 0;
	static  int outerCv = 0;
	
	class InstanceInner {
		int iiv  = outerIv;  // ★★★외부 클래스의 private멤버도 접근 가능★★★
		int iiv2 = outerCv;
	}
	
	static class StaticInner {
		// static 클래스는 외부 클래스의 인스턴스 멤버에 접근 할 수 없다!
		// int siv = outerIv;
		static int scv = outerCv;
	}
	
	void myMethod2() {	
		int lv = 0;			// 변수인데 값이 변하지 않으면 상수 취급..
		final int LV = 0;  // JDK1.8부터 final 생략가능
		
		class LocalInner {	// ★★★지역 내부 클래스를 감싸고 있는 메서드의 상수만 사용가능!★★★
			int liv  = outerIv;
			int liv2 = outerCv;
			//	외부 클래스의 지역 변수는 final이 붙은 변수(상수)만 접근 가능!
//			int liv3 = lv;	// 에러!!!(JDK1.8부터 에러 아님!)
			int liv4 = LV;	// OK
		}
	}
 
	public static void main(String[] args) {
		// final이 필요한 이유?
		//	-> 객체가 메소드보다 더 오래 살아있는 경우
		//		-> 객체쪽에서 메소드에 있는 지역 변수를 사용하는 경우 에러 발생
		//			-> final로 계속 남겨두자!
		
		// 상수는 constant pool로 따로 관리한다.. 뒤에서 배울것
	}
		
}

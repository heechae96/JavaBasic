package ch07;

public class Ch07_17_20 {

	public static final int WIDTH = 200;
	
	// 제어자
	// 클래스와 클래스의 멤버(멤버 변수, 메서드)에 부가적인 의미 부여
	
	// 접근제어자
	// -> 접근 제어자는 하나만 가능!
	// -> public, protected, (default), private
	
	// 그 외 제어자
	// 하나의 대상에 여러 제어자를 같이 사용가능
	// -> static, final, abstract, 
	//		native, transient, synchronized, volatile, strictfp 
	
	// 순서는 크게 상관없으나, 관례적으로 접근제어자를 제일 왼쪽에 표기
	
	public static void main(String[] args) {	
		
		System.out.println("WIDTH="+WIDTH);
		
		// static 
		// 클래스의, 공통적인
		// 대상 : 멤버변수, 메서드
		
		
		// final
		// 마지막의, 변경될 수 없는
		// 대상 : 클래스, 메서드, 멤버변수, 지역변수
		
		/*
		final class FinalTest{				// 조상이 될 수 없는 클래스
			final int MAX_SIZE = 10;		// 값을 변경할 수 없는 멤버변수(상수)
			
			final void getMaxSize() {		// 오버라이딩 할 수 없는 메서드(변경불가)
				final int LV = MAX_SIZE;	// 값을 변경 할 수 없는 지역변수(상수)
				return MAX_SIZE;
			}
		}
		*/
			
		
		// abstract
		// 추상의, 미완성의
		// 대상 : 클래스, 메서드
		// 추상메서드가 있으면 무조건 추상메서드이다!!
		//	-> 추상클래스의 인스턴스 생성불가!
		//	-> why? 미완성 설계도인데, 제품 생산이 당연히 불가..
		// 		-> 상속을 통해 몸통을 만들어서 사용해야 한다!
		
		/*
		abstract class AbstractTest{	// 추상클래스(추상메서드를 포함한 클래스)
										//	-> 미완성 클래스...
			abstract void move();		// 추상 메서드(구현부가 없는 메서드)
										//	-> 몸통이 없다!
										// 		-> 미완성 메서드...
		}
		*/
	}

}

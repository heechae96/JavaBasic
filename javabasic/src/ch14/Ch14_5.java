package ch14;

public class Ch14_5 {

	public static void main(String[] args) {

		// 함수형 인터페이스
		//	-> 단 하나의 추상 메서드만 선언된 인터페이스
//		MyFunction f = new MyFunction() {
//			
//			@Override
//			public int max(int a, int b) {
//				// 오버라이딩 - 접근제어자는 좁게 못바꾼다!
//				return a > b ? a : b;
//			}
//		}; 
		
		// 람다식(익명객체)을 다루기 위한 참조변수의 타입은 함수형 인터페이스로 한다
		MyFunction0 f = (a, b) -> a > b ? a : b;	// 람다식. 익명객체
		
		int value = f.max(3,5);
		
		System.out.println("value "+value);
		
		
		// 어디에 사용?
		// 익명 객체를 람다식으로 대체
		// 함수형 인터페이스 타입의 매개변수
		// 함수형 인터페이스 타입의 반환타입
	}

}

// 함수형 인터페이스는 단 하나의 추상 메서드만 가져야 함
@FunctionalInterface	
interface MyFunction0{
	public abstract int max(int a, int b);
}

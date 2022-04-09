package ch12;

public class Ch12_25_26 {
	// 경고억제를 위해!
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		// 표준애너테이션
		
		//	@Override
		//	-> 오버라이딩을 올바르게 했는지 컴파일러가 체크하게 한다
		//	-> 오버라이딩할 때 메서드이름을 잘못적는 실수를 하는 경우가 많다
		//	-> 오버라이딩할 때는 메서드 선언부 앞에 @Override	를 붙이자
		
		//	@Deprecated
		//	-> 앞으로 사용하지 않을 것을 권장하는 필드나 메서드에 붙인다
		//	-> @Deprecated의 사용 예, Date클래스의 getDate()
//		@Deprecated
//		public int getDate() {
//			return normalize().getDayOfMonth();
//		}
		//	-> @Deprecated가 붙은 대상이 사용된 코드를 컴파일하면 나타나는 메세지
		//		-> 에러는 아니다! 경고!
		
		Child c = new Child();
		c.parentMethod();	// deprecated된 메서드 사용
		
		//	@FunctionalInterface
		//	-> 함수형 인터페이스에 붙이면, 컴파일러가 올바르게 작성했는지 체크
		//	-> 함수형 인터페이스에는 하나의 추상메서드만 가져야 하는지 제약이 있음
		
		//	@SuppressWarnings
		//	-> 컴파일러의 경고메시지가 나타나지 않게 억제한다
		//	-> 괄호()안에 억제하고자 하는 경고의 종류를 문자열로 지정
		//		-> 	-> @SuppressWarnings("~")
		//	-> 둘 이상의 경고를 동시에 억제하려면 다음과 같이 한다
		//		-> @SuppressWarnings("~", "~")
		//	-> '-Xlint'옵션으로 컴파일하면, 경고메세지를 확인할 수 있다
		//		괄호[]안이 경고의 종류. 
		
		
		
	}

}

class Parent {
	void parentMethod() { }
}

@FunctionalInterface
interface Testable{	// 함수형 인터페이스는 하나의 추상 메서드만 가능!
	void test();
//	void check();
}

class Child extends Parent {
	@Override
	@Deprecated
	void parentMethod() { } // 조상 메서드의 이름을 잘못 적었음. 
}

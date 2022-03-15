package ch07;

// extends를 생략해도 무관
// 생략해도 자동으로 컴파일러가 추가
class MyPoint2 extends Object{
	int x, y;
}

class Circle2 extends Object{
	MyPoint2 p = new MyPoint2();
	int r;
}

public class Ch07_5_6 {

	public static void main(String[] args) {

		// 단일상속
		// Java는 단일상속만을 허용한다(C++은 다중상속 허용)
		// -> 하나의 부모만 상속
		
		// 다중상속을 쓰고 싶으면?
		// 비슷하게 효과를 낼 수 있다!
		// -> 비중이 높은 클래스 하나만 상속관계로, 나머지는 포함관계로 한다.
		
			
		// Object클래스
		// -> 모든 클래스의 조상!
		// 부모가 없는 클래스는 자동적으로 Object클래스를 상속받게 된다.
		// 모든 클래스는 Objecet클래스에 정의된 11개의 메서드를 상속받는다
		// -> toString(), equals(Object obj), hashCode(), ...
		// 		-> toString() 제외하고 9장에서 자세히..
		
		Circle2 c = new Circle2();
		// 패키지명.클래스명.주소값..
		System.out.println(c.toString());
		// 참조변수만 써도 동일한 결과!
		System.out.println(c);
		
		
	}

}

package ch09;

import java.util.Objects;

public class Ch09_4_6 {

	public static void main(String[] args) {

		// hashCode()
		//	-> 객체의 해시코드(hash code)를 반환하는 메서드
		//	-> 객체마다 다른값을 가져서 '객체의 지문'이라고도 함
		//			-> 정수값: 해싱이라는 알고리즘...
		//					-> 11장 컬렉션 프레임웍에서 자세히 배울것!
		//	-> Object클래스의 hash	Code()는 객체의 주소를 int로 반환해서 반환
		/*
		public class Object{
			// ...
			public native int hashCode();
			//		-> 네이티브 메서드 : OS의 메서드(C언어), JNI
			//			-> 내용이 없음! 이미 작성되어져 있는 메서드를 호출!
		}
		*/
		// equals()를 오버라이딩하면, hashCode()도 오버라이딩 해야한다
		//	-> 둘 의 공통점은 주소를 가지고 작업한다!
		// ★★★equals()의 결과가 true인 두 객체의 해시코드는 같아야 하기 때문★★★
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1.equals(str2)); 	// true
		// 오버라이딩이 잘 되어있어서 값이 같은 것!
		System.out.println(str1.hashCode());	// 96354
		System.out.println(str2.hashCode());	// 96354
		
		// 참고!
		// System.identityHashCode(Object obj)는 Object클래스의 hashCode()와 동일
		//	-> 위는 오버라이딩 해서 같은값이고 아래코드는 오버라이딩 전값이라 값이 다르다! 
		System.out.println(System.identityHashCode(str1)); // 1993134103
		System.out.println(System.identityHashCode(str2)); // 405662939
		
		System.out.println();
		
		// toString(), toString()의 오버라이딩
		//	-> 객체를 문자열(String)으로 변환하기 위한 메서드
		Card c1 = new Card();
		Card c2 = new Card();

		System.out.println(c1.equals(c2));
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());	// hashCode()오버라이딩 안하면 아래와 일치!
		
		System.out.println(System.identityHashCode(c2));
	}

}

class Card {
	String kind;
	int number;

	Card() {
		this("SPADE", 1);
	}

	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	// equals() 오버라이딩
	public boolean equals(Object obj) {
		if(!(obj instanceof Card))
			return false;
		
		Card c = (Card)obj;
		return this.kind.equals(c.kind) && this.number==c.number;
	}
	
	// hashCode() 오버라이딩
	public int hashCode() {
		return Objects.hash(kind, number);
	}
	
	// Object클래스의 toString()을 오버라이딩
	public String toString() {
		return "Card [kind=" + kind + ", number=" + number + "]";
	}
	
	
}

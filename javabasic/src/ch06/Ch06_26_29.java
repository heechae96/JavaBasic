package ch06;

public class Ch06_26_29 {

	public static void main(String[] args) {

		// 인스턴스 메서드(im: 메서드 앞에 static 없는것)
		// 인스턴스 생성 후 "참조변수.메서드이름()"으로 호출
		// 인스턴스 멤버와 관련된 작업을 하는 메서드
		// ★메스드 내에서 인스턴스 변수 사용가능★
				
		
		// static메서드(클래스 메서드)
		// 객체생성없이 "클래스이름.메서드이름()"으로 호
		// ex) Math.random();		
		// 인스턴스 멤버와 관련없는 작업을 하는 메서드
		// ★메서드 내에서 인스턴스 변수 사용불가★
		
		// 클래스 메서드 호출
		System.out.println(Ch06_26_29.add(200L, 100L));
		
		// 인스턴스 생성
		Ch06_26_29 mm = new Ch06_26_29();
		mm.a = 300L;
		mm.b = 200L;
		// 인스턴스 메서드 호출
		System.out.println(mm.add());
		
		// Q. static메서드가 뭐야?
		// A. 객체 생성하지 않고 사용 가능한 메서드
		
		// Q. 언제 인스턴스 메서드를 사용할래?
		// A. 인스턴스 변수를 사용하지 않을때
		
		// Q. 둘 의 가장 큰 차이는?
		// A. ★iv의 사용 여부★
				
	}
	long a, b;	//	iv : 인스턴스 변수
	
	long add() {	// 인스턴스 메서드
		return a+b;	// <- iv
	}
	
	static long add(long a, long b) {	// 클래스메서드(static 메서드)
		return a+b;	// <- lv
	}

}

// 앞에서 객체는 인스턴스 변수(iv)의 묶음이라는게 이어짐..
// iv로 작업하고 인스턴스 메소드 호출까지..

// 멤버변수 중에서 공통 속성에 static을 붙인다
// 인스턴스 멤버를 사용하지 않는 메서드에 static을 붙인다
//						-> 메서드 : 명령문 집합



package ch07;

public class Ch07_24_25 {

	public static void main(String[] args) {

		// 참조변수의 형변환
		// 사용 할 수 있는 멤버의 갯수를 조절 하는 것
		//	-> 기본 형변환처럼 값이 바뀌는게 아님!
		// 조상 자손 관계의 참조변수는 서로 형변환 가능
		// -> 형제(자매) 관계에서는 불가
		
		// class Car{}
		// class FireEngine extends Car{}
		// class Ambulance extends Car{}
		
		/*
		FirteEngine f = new FireEngine();	
		Car c = new (Car)f;					// ok(생략가능)	
		FireEngine f2 = (FireEngine)c;		// ok(생략불가)
		Ambulance a = (Ambulance)f;			// 에러
		*/
		
		// 생략 가능 생략 불가 신경쓰지마!
		// 	-> 전부 형변환 표기하면 문제 없다!
		
		// '멤버 변수 + 메소드'가 감소하면 안전 형변환!(Upcasting)
		// '멤버 변수 + 메소드'가 증가하면 불안전 형변환!(Downcasting)
		//						-> 따라서 형변환 표기를 원칙!
		
		
	}

}

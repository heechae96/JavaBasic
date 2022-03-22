package ch08;

public class Ch08_1_3 {

	public static void main(String[] args) {

		// 프로그램오류
		
		// 컴파일 에러(compile-time error)
		//	-> 컴파일 할 때 발생하는 에러
//		system.out.println("에러");
		
		// 컴파일러의 역할
		// 1. 구문체크
		// 2. 번역
		// 3. 최적화(간단한 연산 가능)
		
		
		
		// 런타임 에러(runtime error)
		//	-> 실행 할 때 발생하는 에러
		//		-> 에러가 뜨는 프로그램이 죽는다..
//		System.out.println(args[0]);
		//	-> 매개변수로 던져준게 없기때문.. Ch05_16_17에서 배웠음
		// Java의 런타임 에러
		// 에러(error) : 프로그램 코드에 의해서 수습될 수 없는 심각한 오류
		// 	-> OutOfMemory Error(메모리부족)
		// 예외(exception) : 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류
		
		// 예외처리(exception handling)
		// 정의 : 프로그램 실행 시 발생할 수 있는 예외의 발생에 대비한 코드를 작성하는 것
		// 목적 : 프로그램의 비정상 종료를 막고, 정상적인 실행상태를 유지하는 것
		
		
		// 논리적 에러(logical error)
		// 	-> 작성 의도와 다르게 동작
		// ex) 재고관리 프로그램을 만들었는데 음수가 나온경우
		// ex) 데스게임을 만들었는데 총을 맞아도 안죽는경우
		

		// 예외클래스의 계층구조
		
		// Exception클래스 + 자손클래스
		//	-> 사용자의 실수와 같은 외적인 요인에 의해 발생하는 예외
		// RuntimeException클래스 + 자손 클래스
		// 	-> 프로그래머의 실수로 발생하는 예외
		//		-> Arithmetic-	 		산술계산 예외 5/0
		//		-> ClassCast-			형변환
		//		-> NullPointer-			str = null;	str.length();
		//		-> indexOutOfBounds-	배열범위초과
		
		
		
	}

}

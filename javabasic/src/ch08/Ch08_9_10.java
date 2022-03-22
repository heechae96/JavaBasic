package ch08;

public class Ch08_9_10 {

	public static void main(String[] args) {

		// 예외 발생시키기
		
		// 1. 연산자 new를 이용해서 발생시키려는 예외 클래스의 객체를 만든 다음
		// 	-> Exception e = new Exception("고의로 발생시킴");
		
		// 2. 키워드 throw를 이용해서 예외를 발생시킴
		//	-> throw e;
		
		// 1번과 2번을 한번에
		// 	-> throw new Exception("고의로 발생시킴");
		
		
		// checked예외, unchecked예외
		// checked예외
		//	-> Exception과 자손들
		//		-> 컴파일러가 예외 처리 여부를 체크(예외 처리 필수)
		
		// unchecked예외
		//	-> RuntimeException과 자손들
		//		-> 컴파일러가 예외 처리 여부를 에크 안함(예외 처리 선택)
		
		// 컴파일 자체가 불가
		// Unhandled exception type Exception
//		throw new Exception();
		
		try {
			throw new Exception();
		}catch(Exception e) {}
		
		// 컴파일 가능
		// Exception in thread "main" java.lang.RuntimeException
		//	at ch08.Ch08_9_10.main(Ch08_9_10.java:39)
		throw new RuntimeException();
		
		
		// unchecked예외가 없었으면 거의 모든 코드에 try-catch를 했어야함..
		//	배열..형변환..널포인트..등
		
	}

}

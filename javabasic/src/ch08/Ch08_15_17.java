package ch08;

public class Ch08_15_17 {

	public static void main(String[] args) {

		// 사용자정의 예외 만들기
		//	-> 우리가 직접 예외 클래스를 정의할 수 있다
		//	-> 조상은 Exception과 RuntimeException중에서 선택
		//		-> Exception : 예외 필수 처리
		//		-> RuntimeException : 예외 선택 처리
		//	-> 가능하면, RuntimeException을 조상으로!
		//		-> 꼭 필요한 경우는 Exception을 조상으로!
		
		/*
		class MyException extends Exception{
			MyException(String msg){	// 문자열을 매개변수로 받는 생성자
				super(msg);	// 조상인 Exception클래스의 생성자를 호출한다
			}
		}
		*/
		
		// 예외 되던지기(exception re-throwing)
		//	-> 예외를 처리한 후에 다시 예외를 발생시키는 것
		//	-> 호출한 메서드와 호출된 메서드 양쪽 모두에서 예외처리하는 것
		// ex) 아버지가 딸에게 돈을 주고 물건 구매 심부름을 시킴
		//	-> 예외 상황 : 받은 돈에 비해 물건 가격이 비싼 경우
		//	-> 처리 방법: 1. 딸의 돈을 추가 해서 구매(직접 처리)
		//	-> 			2. 그대로 돌아와서 아버지에게 알림(떠넘기기) 
		//					-> 그러면 돈을 더 줘서 딸을 다시 보내든, 아버지가 직접 가든 처리
		//	-> 			3. 딸이 조금 처리 / 나머지는 아버지가 처리 (되넘기기)
		//								ex) 외상해서 외상값은 아버지가!
		
		// 1번(직접처리): 부탁 받은 쪽에서 처리
		// 2번(떠넘기기): 요청측에서 처리
		// 3번(되넘기기): 부탁 받은 쪽에서 처리 and 요청측에서 처리 [분담]
		
	}

}

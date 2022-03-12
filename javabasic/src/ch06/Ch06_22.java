package ch06;

public class Ch06_22 {

	public static void main(String[] args) {

		// 스택?
		// -> 밑이 막힌 상자. 위에 차곡차곡 쌓인다
		
		// 호출 스택
		// -> 메서드 수행에 필요한 메모리가 제공되는 공간
		// 메서드가 호출되면 호출스택에 메모리 할당, 종료되면 해제
		
		// 하나의 스택에서는 하나의 메서드만 실행중
		// 나머지는 모두 대기상태
		
		// 뒤에서 쓰레드 배우면 달라짐..
		
		System.out.println("Hello");
		
		// Ch06_22의 메모리 상태
		// 1. 빈공간
		// 2. main할당
		// 3. println할당
		//	-> println 실행
		//	-> main 대기
		// 4. println종료
		//	-> printl사라짐
		//	-> main실행
		// 5. main종료
		// 	-> main사라지고 빈 공간
		
		/*
		 * 1		2			3			4			5
		 *ㅣ   ㅣ		ㅣ   ㅣ		ㅣㅡㅡㅣ		ㅣ   ㅣ		ㅣ   ㅣ
		 *ㅣ   ㅣ		ㅣ   ㅣ		println		ㅣ   ㅣ		ㅣ   ㅣ 
		 *ㅣ   ㅣ		ㅣㅡㅡㅣ		ㅣㅡㅡㅣ		ㅣㅡㅡㅣ		ㅣ   ㅣ 	
		 *ㅣ   ㅣ		 main		 main		 main		ㅣ   ㅣ
		 *ㅣㅡㅡㅣ		ㅣㅡㅡㅣ		ㅣㅡㅡㅣ		ㅣㅡㅡㅣ		ㅣㅡㅡㅣ  
		 */
		
		
	}

}

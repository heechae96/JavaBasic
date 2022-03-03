package ch04;

public class Ch04_1_4 {

	public static void main(String[] args) {

		// 조건문과 반복문을 통해 실행의 흐름을 바꿀 수 있다
		// 제어문(flow control statement)이라 부름 
		
		// 조건문
		// -> 조건을 만족할때만 {}를 수행 (0~1번)
		// 반복문
		// 조건을 만족하는 동안 {}를 수행 (0~n번)
		
		// if문에 한문장만 들어갈 경우 블럭({ })생략가능
		// 들여쓰기가 기본은 아님, 가독성을 위해 생활화하
		/*
		if(score > 60)
			System.out.println("합격입니다");
		*/
		
		// 주의
		// 합격입니다는 if문에 종속된 출력이지만
		// 축하합니다는 if문에 종속되지 않은 출력문이다
		
		int score = 61;
		if(score > 60)
			System.out.println("합격입니다");
			System.out.println("축하합니다");
		
		
		// if-else문
		// 둘 중의 하나 - 조건식이 참일때와 거짓일때로 나눠서 처리
		// 조건식을 한번만 판단하기 때문에 효율적.
		
			
	}

}

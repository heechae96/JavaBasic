package ch02;

public class Ch02_5 {

	public static void main(String[] args) {
		
		// 변수(variable)?
		// 하나의 값을 저장하기 위한 공간
		// 지역 변수는 반드시 초기화하는 과정이 필요!
		// 변수의 개념은 객체쪽에서 자세히 다룰 예정!
		// ex) int max = 100
		int score = 100;
		System.out.println(score);
		score = 200;
		System.out.println(score);
	
		// 상수(constant)?
		// 한 번만 값을 저장 가능한 변수 
		// ex) final int max = 100
		final int max = 100;
		System.out.println(max);
		// 변경하면 에러!
//		max = 200;
		
		// 리터럴(literal)?
		// 그 자체로 값을 의미하는 것
		// 기존의 상수와 같은 개념
		
		
	}

}

package ch05;

public class Ch05_1_3 {

	public static void main(String[] args) {

		// 배열?
		// 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
		
		// 배열의 선언과 생성
		// 배열의 선언
		// -> 배열을 다루기 위한 참조변수의 선언
		// 1) int[] score;
		// 2) int score[];
		// 자바는 보통 1번을 선호한다
		
		// 배열을 생성
		// score = new int[5];
		
		// 배열의 인덱스
		// 각 요소에 자동으로 붙는 번호
		// 주의!
		// 인덱스의 범위는 0부터 배열의 길이-1까지
		
		// 배열 score 4번째 요소에 100을 저장
		// score[3] = 100;
		
		// 배열 score 4번째 요소의 값을 읽어서 value에 저장
		// int value = score[3];
		
//		int[] score;	// 참조변수 선언
//		
//		score = new int[5];	// 배열의 생성
		
		// 배열의 선언(참조변수)과 생성을 동시에
		int[] score = new int[5];
		
		score[3] = 100;
		
		// 값을 안 넣어주면 0으로 기본 세팅
		System.out.println("score[0]= "+score[0]);
		System.out.println("score[1]= "+score[1]);
		System.out.println("score[2]= "+score[2]);
		System.out.println("score[3]= "+score[3]);
		System.out.println("score[4]= "+score[4]);
		
		int value = score[3];
		System.out.println("value "+value);
		
		
	}

}

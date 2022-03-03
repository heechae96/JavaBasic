package ch04;

import java.util.Scanner;

public class Ch04_9_11 {

	public static void main(String[] args) {

		// switch문
		// 처리해야 하는 경우의 수가 많을 때 유용한 조건문
		
		// break문을 빼먹지 않도록 주의
		// break를 빼면 빠져나오지 않고 끝까지 내려가서 실행
		
		// default는 생략 가능
		// 단, 조건식의 결과와 일치하는 case문이 없을 때
		// 수행될 문장이 필요하면 작성
		
		// 제약조건이 존재
		// 제약조건에 걸리면 if - else if문 사용 
		// -> switch문은 if문으로 바꿀 수 있으나
		// if문은 switch문으로 못 바꿀 수 있다.
		
		// switch문의 조건식 결과는 정수여야 한다.
		// 버전에 따라 문자열도 가능
		
		// case문의 값은 정수 상수(문자포함), 문자열만 가능하며, 중복되지 않아야한다.
		// 변수는 불가!
		// 실수도 불가!
		
		System.out.print("현재 월을 입력하세요 >");
		
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		
		switch (month) {
			case 3:
			case 4:
			case 5:
				System.out.println("현재의 계절은 봄입니다");
				break;
			case 6: case 7: case 8:
				System.out.println("현재의 계절은 여름입니다");
				break;
			case 9: case 10: case 11:
				System.out.println("현재의 계절은 가을입니다");
				break;
			default:
				System.out.println("현재의 계절은 겨울입니다");
		}
		
		
		
	}

}

package ch04;

import java.util.Scanner;

public class Ch04_5_8 {

	public static void main(String[] args) {
		
		// if-else if문 
		// 여러개의 조건식을 포함한 조건식
		int score = 0;
		char grade = 'd';
		
		System.out.println("점수를 입력하세요"); 
		Scanner scan = new Scanner(System.in);
		score = scan.nextInt();
		
		// else문은 생략이 가능하다.
		// 초기값을 else의 값으로 지정해둠 
		if(score >= 90) {
			grade = 'a';
		}else if(score >= 80){	// 위에서 90점 이상은 걸려졌기 때문에 범위에 포함x
			grade = 'b';
		}else if(score >= 70){
			grade = 'c';
		}
//		else{
//			grade = 'd';
//		}
		
		System.out.println("당신의 학점은 "+grade+"입니다");
		
		// 중첩 if문
		// if문 안의 if
		// 중첩 횟수 제약 x
		// 주의
		// else는 가까운 if문에 중첩된다
		// 블록을 생활화하자
		// 블록을 사용해서 명확히!
		int score2 = 0;
		char grade2 = 'C', opt = '0';
		
		System.out.println("점수를 입력하세요"); 
		Scanner scan2 = new Scanner(System.in);
		score2 = scan2.nextInt();
		
		System.out.printf("당신의 점수는 %d입니다.\n",score2);
		
		if(score2 >= 90) {
			grade2 = 'A';
			if(score2 >= 98) {
				opt = '+';
			}else if(score2 < 94) {
				opt = '-';
			}
		}else if(score2 >= 80) {
			grade2 = 'B';
			if(score2 >= 88) {
				opt = '+';
			}else if(score2 < 84) {
				opt = '-';
			}	
		}
		
		System.out.printf("당신의 학점은 %c%c입니다.\n",grade2,opt);
		
	}

}

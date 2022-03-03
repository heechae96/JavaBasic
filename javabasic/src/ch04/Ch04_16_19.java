package ch04;

import java.util.Scanner;

public class Ch04_16_19 {

	public static void main(String[] args) {

		// while문
		// 조건을 만족시키는 동안 블럭{}을 반복
		// 반복횟수를 모를때
		
		// while문과 for문은 100퍼센트 서로 변경 가능
		// -> if문과 switch문과 다르다
		
		int i = 5;
		
		while(i-- != 0) {
			System.out.println(i+" I can do it");
		}
		
		int j = 5;
		
		while(--j != 0) {
			System.out.println(j+" I can't do it");
		}
		
		// k를 1씩 증가시켜서 sum에 계속 더해 나간다
		// 언제 100에 도달하는가?
		
		int sum = 0;
		int k = 0;
		while(sum <= 100) {
			System.out.printf("%d - %d \n", k, sum);
			sum += ++k;
		}
		
		// n자리 숫자를 입력받아 각 자리 숫자의 합을 구하라
		int num = 0;
		int summ = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		String tmp = scan.nextLine();
		num = Integer.parseInt(tmp);
		
		while(num != 0) {
			summ += num % 10;
			System.out.println("sum "+summ+" 각 자리수 "+num%10);
			
			num /= 10;
		}
		
		System.out.println("각 자리 수의 합은 "+summ);
		
		
		
		// do-while문
		// 블럭{}을 최소한 한 번 이상 반복
		// 사용자 입력 받을때 유용
		
		// 사용자가 입력한 숫자 맞히기
		// 범위는 1~100
		int input = 0;
		int answer = 0;
		answer = (int)(Math.random()*100)+1;
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("1부터 100사이의 수를 입력하세요");
//		input = scanner.nextInt();
		
		do {
			System.out.println("1부터 100사이의 수를 입력하세요");
			input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("더 작은 수를 입력하세요");
			}else if(input < answer) {
				System.out.println("더 큰 수를 입력하세요");
			}
		}while(input != answer);
		
		System.out.println(input+ "정답입니다");
		
		
		
		
	}

}

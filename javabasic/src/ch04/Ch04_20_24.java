package ch04;

import java.util.Scanner;

public class Ch04_20_24 {

	public static void main(String[] args) {

		// break문
		// switch문에서 처음 등장 했음
		// 반복문을 빠져나올때도 쓰인다
		
//		for(;;) {
//			System.out.println("무한반복");
//		}
		
		// for(;true;)
		// for문과 true생략 불가능!
		
//		while(true) {
//			System.out.println("무한반복");
//		}
		
		int sum = 0;
		int i = 0;
		
		while(true) {
			if(sum > 100)
				break;
			++i;
			sum += i;
		}
		
		System.out.println("i="+i);
		System.out.println("sum="+sum);
		
		
		// continue문
		// 자신이 포함된 반복문의 끝으로 이동
		// 다음 반복으로 넘어감
		// 전체 반복 중에서 특정 조건시 반복을 건너뛸 때 유용
		
		// 1부터 10까지 3의 배수만 빼고 출력
		for(int k=1; k<=10; k++) {
			if(k%3==0) {
				continue;
			}
			System.out.println(k);
		}
		
		// 메뉴선택 예제
		int menu = 0;
		// int num = 0;
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("1) 치킨");
			System.out.println("2) 피자");
			System.out.println("3) 파스타");
			System.out.println("원하시는 메뉴를 선택하세요. (종료하고 싶으면 0)");
			
			String tmp = scan.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu==0) {
				System.out.println("프로그램 종료");
				break;
			}else if(!(1<=menu && menu <=3)) {
				System.out.println("메뉴를 잘못 선택하였습니다. (종료하고 싶으면 0)");
				continue;
			}
			System.out.println("선택하신 메뉴는 "+menu+"번입니다.");
		}
		
		
		// 이름붙은 반복문
		// 반복문에 이름을 붙여서 하나 이상의 반복문을 벗어날 수 있다
		// break 이름;
		// continue 이름;
		// continue보다는 break는 쓰이는 경우가 있으므로 알아두자!
		
		Loop1 : for(int j=2; j<=9; j++) {
				for(int p=1; p<=9; p++) {
					if(p==5) 
						break Loop1;
//						break;
//						continue Loop1;
//						continue;
					System.out.println(j+"*"+p+"="+j*p);
				}
					System.out.println();
			}
		
		// 메뉴선택 예제
		// 추가 이름 붙은 반복문
		// -> 2회독에서 해볼 것
		
	}

}

package ch04;

public class Ch04_13_14 {

	public static void main(String[] args) {

		// for문
		// 조건을 만족하는 동안 블럭{}을 반복
		// 반복 횟수를 알 때 적합
		//		초기값 조건식 증감 
		for(int i=1; i<=5; i++) {
			System.out.println("Hello");
		}
		
		// 10이하 홀수만
		for(int i=1; i<=10; i+=2)
			System.out.println("홀수"+i);
		
		// 10이라 짝수만
		for(int i=2; i<=10; i+=2) {
			System.out.println("짝수"+i);
		}
		
		// 10이하 홀수 반대로 출력
		for(int i=9; i>=0; i-=2)
			System.out.println("홀수"+i);
		
		// 10이하 짝수 반대로 출력
		for(int i=10; i>=1; i-=2) {
			System.out.println("홀수"+i);
		}
		
		// 초기값 세팅시 타입이 같으면 여러개 변수 생성 가능
		for(int i=1, j=1, k=1; i<=10 && i>=0 && k<=10; i++, j--, k++) {
			System.out.println("i "+i+" j "+j+" k"+k);
		}
		
		// 조건식을 생략하면, true로 간주되어서 무한 반복된다.
		// 초기값도 밖으로 뺄 수 있다
		/*
		for(;;) {
			System.out.println("무한반복");
		}
		*/
		
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
			System.out.printf("1부터 %d까지의 총 합은 :%d\n",i,sum);
		}
	}

}

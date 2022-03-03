package ch04;

public class Ch04_12 {

	public static void main(String[] args) {
			
		// 임의의 정수 만들기(난수)
		// Math.random() 
		// 0.0과 1.0사이의 임의의 double값을 반
		// 0.0 <= Math.random() < 1.0
		
		// 1~3의 정수를 얻고싶다면?
		// 각 변에 3을 곱한다
		// 각 변을 int형으로 변환한다
		// 각 변에 1씩 더한다 
		
		// 괄호{ } 안의 내용을 20번 반복한다.
		// for문에 대해서는 뒤에서 자세히 배운다
		for(int i=1; i<=20; i++) {
			System.out.println(Math.random());
		}
		
		System.out.println("--------------------------------");
		
		// 1~10사이의 난수 20개 출력하시오
		// 1,2,3,...,,9,10
		for(int i=1; i<=20; i++) {
			System.out.println((int)(Math.random()*10)+1);
		}

		System.out.println("--------------------------------");
		
		// -5~5사이의 난수 20개 출력하시오
		for(int i=1; i<=20; i++) {
			// 									개수설정 범위수정 
			System.out.println((int)(Math.random()*11)-5);
		}

		

	}

}

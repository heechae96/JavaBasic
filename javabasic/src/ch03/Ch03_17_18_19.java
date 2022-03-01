package ch03;

public class Ch03_17_18_19 {

	public static void main(String[] args) {

		// 조건연산자(삼항연산자)
		// if문을 간편하게 쓰기 좋다!
		// ? :
		// (조건식) ? 식1 : 식2
		//			참일때 거짓일때 
		int max = (5 > 3) ? 5 : 3; 
		System.out.println(max);
		
		
		// 대입연산자
		// =
		// 오른쪽 피연산자를 왼쪽 피연산자에 저장 후 저장된 값을 반환
		// rvalue(값) lvalue(저장공간)
		int x;
		System.out.println(x = 3);
		// 단, final 상수는 대입 불가!
		
		// 복합 대입연산자 
		// 대입 연산자와 다른 연산자를 하나로 축약
		// i += 3;	
		// i = i + 3;
		// 주의
		// i *= 10 + j;
		// i = i * (10 + j);
		
	}

}

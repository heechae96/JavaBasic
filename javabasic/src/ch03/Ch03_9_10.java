package ch03;

public class Ch03_9_10 {

	public static void main(String[] args) {

		// 사칙 연산자
		// 기본적으로 컴퓨터는 같은 타입끼리만 계산이 가능하다.
		// 다른 타입끼리 계산하려면 값손실이 적은쪽으로 맞춰서 계산
		System.out.println(4/2);
		System.out.println(4/2.0);
		
		// 산술변환
		// 연산 전에 피연산자의 타입을 일치시키는 것
		// 기본적으로 2가지 규칙이 존재
		// 1. 두 피연산자의 타입을 같게 일치시킨다.(보다 큰 타입으로 일치)
		// 2. 피연산자의 타입이 int보다 작은 타입이면 int로 변한된다
		// ex) byte + short -> int + int = int
		//		char + short -> int + int = int
		// why? 범위가 좁으므로 오버플로우가 발생 가능이 있기 때문.

		// '0' 48
		// '9' 57
		char a = '0';
		char b = '9';
		// 9 - 0 - 9
		System.out.println(b-a);
		
		int c = 1_000_000;
		int d = 2_000_000;
		
		long e = c * d;
		// -1454759936
		// int의 범위 21억을 넘어버림..
		System.out.println(e);
		
		// 형변환 시켜서 올바른 값으로
		e = (long)c * d;
		System.out.println(e);
	}

}

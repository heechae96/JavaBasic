package ch02;

public class Ch02_6 {

	public static void main(String[] args) {
		
		// 정수형의 접미사 : L(소문자 l은 숫자 1과 혼동이 있으므로 안쓰는게 좋다)
		// 실수형의 접미사 : f, d(d는 생략이 가능하므로 f를 기억하자)
		
		// 논리형 
		boolean power = true;
		System.out.println(power);
		
		// 문자형 
		char ch = 'a';
		System.out.println(ch);
		char n = '\n';	// 개행문자
		System.out.println(n);
		
		// 문자열 
		String str = "abc";
		System.out.println(str);
		
		// 정수형 
		// byte의 범위는 -127부터 126
		// 범위를 벗어나면 에러 
		byte b = 127;
		System.out.println(b);
		
		int i = 100;		// 10진수
		System.out.println(i);
		int oct = 0100;		// 8진수
		System.out.println(oct);
		int hex = 0x100; 	// 16진수
		System.out.println(hex);
		int bin = 0b0101; 	// 2진수 
		System.out.println(bin);
		
		long l = 100;		// ok
		System.out.println(l);
		
		// long ll = 10_100_000_000;
		// –2,147,483,648 ~ 2,147,483,647 넘어 가는 정수형은 접미사 L(l) 필요 
		// L(l) 없으면 에러 
		// 가독성을 높이기 위해 '_' 사용을 허용 
		long ll = 10_100_000_000L;
		System.out.println(ll);

		// 실수형
		float f = 3.14f;
		System.out.println(f);
		// float ff = 3.15;
		// 접미사 f는 생략이 불가능!
		
		// 10. -> 10.0
		System.out.println(10.);
		// .10 -> 0.10
		System.out.println(.10);
		// 10f -> 10.0f
		System.out.println(10f);
		// 1e3 -> 1000.0d
		System.out.println(1e3);
		
		// 접미사 d는 생략이 가능!
		double d = 3.14d;
		System.out.println(d);
		double dd = 3.15;
		System.out.println(dd);
		
		// 변수와 리터럴의 타입 불일치
		// ok
		int a1 = 'a';		// int > char
		System.out.println(a1);
		long l1 = 123;		// long > int
		System.out.println(l1);
		double d1 = 3.14f;	// double > float
		System.out.println(d1);
		
		// 에러
//		int i1 = 30_0000_0000;	// int의 범위를 벗어남 
//		long l1 = 3.14f;		// long(8B) < float(4B) 실수형의 저장범위가 넓음 
//		float f1 = 3.14;		// float < double
		
		
		 

	}

}

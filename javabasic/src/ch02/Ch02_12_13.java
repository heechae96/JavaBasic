package ch02;

public class Ch02_12_13 {

	public static void main(String[] args) {
		
		// printf()를 이용한 출력
		
		// println()의 단점 
		// -> 출력형식의 지정 불가 
		// 소수점 n자리만 출력하려면? 
		// ex) syso(10.0/3);
		// 3.33333333...
		
		// 정수/정수 -> 정수 
		System.out.println(10/3);
		
		// 정수/실수 or 실수/정수 -> 실
		System.out.println(10/3.0);
		System.out.println(10.0/3);
		
		// 10진수로만 출력된다
		// 8진수, 16진수로 출력하려면?
		System.out.println(0x1A);
		
		// printf()의 지시자
		// %b		boolean
		// %d		10진수 
		// %o		8진수 
		// %x %X	16진수 
		// %f		부동소수점 
		// %e %E	지수	
		// %c		문자 	
		// %s		문자열 
		
		// 개행문자는 \n을 많이 쓰지만, os에 따라 다르게 쓰일수 있다
		// %n은 공동적으로 쓰인다!
		System.out.printf("age:%d year:%d\n", 27, 1996);
		System.out.printf("age:%d year:%d%n", 27, 1996);
		
		System.out.printf("%d ",15);		// 10진수 
		System.out.printf("%o ",15);		// 8진수 
		System.out.printf("%x ",15);		// 16진수 
		// 2진수는 지시자가 따로 없어서 메소드를 이용해야 한다.
		System.out.printf("%s ",Integer.toBinaryString(15));
		 
		// 8진수 16진수 접두사 소문자 추가할때 
		System.out.printf("%#o ",15);		// 8진수 
		System.out.printf("%#x ",15);		// 16진수 

//		System.out.printf("%#O ",15);		// 8진수 
		// 8진수는 접두사 대문자 추가 에
		// 16진수 접두사 대문자로 추가할때
		System.out.printf("%#X ",15);		// 16진수 
		
		// 실수 %f 
		// 지수 %e 
		// 간략한 형식 %g
		// %f %e중 더 간략하게 표현할수 있는것을 출력한다.
		float f = 123.456789f;
		// 앞에서 배운것처럼 f는 정밀도 7자리
		// 정수범위  소수범위 포함해서 7자리만 정확하고 
		// 나머지는 부정확.. 의미없는값!
		System.out.printf("%f ",f);
		System.out.printf("%e ",f);
		System.out.printf("%g ",123.456789);
		System.out.printf("%g ",0.0000000001);
		
		System.out.println();
		// 5자리 오른쪽 정렬 
		System.out.printf("[%5d]%n", 10);
		// 5자리 왼쪽 정렬 
		System.out.printf("[%-5d]%n", 10);
		// 5자리 오른쪽 정렬후 빈 자리 0으로 채우기
		// 0말고 다른수로 채우는것은 x
		System.out.printf("[%05d]%n", 10);
		
		// 자리수를 넘어가는 경우
		// 잘리는거 없이 그냥 출력된다! 
		System.out.printf("[%5d]%n", 1234567);
		
		double d = 1.23456789;
		// 반올림해서 소수점 6자리까지 보여줌 
		System.out.printf("%f",d);
		System.out.println();
		// 14자리를 만들고 10자리를 소수에 부여
		// .도 1자리를 차지한다!
		System.out.printf("%14.10f",d);
		System.out.println();
		// 6자리까지 부여해서 뒤에는 반올림 
		System.out.printf("%14.6f",d);
		System.out.println();
		// 전체자리수는 생략이 가능하다!
		// 정수는 알아서 출력된다! 
		System.out.printf("%.6f",d);
		System.out.println();
	
		System.out.printf("[%s]%n", "www.naver.com");
		System.out.printf("[%20s]%n", "www.naver.com");
		System.out.printf("[%-20s]%n", "www.naver.com");
		System.out.printf("[%.10s]%n", "www.naver.com");
		
		
	}

}

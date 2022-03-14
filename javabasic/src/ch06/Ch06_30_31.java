package ch06;

public class Ch06_30_31 {

	public static void main(String[] args) {

		// 오버로딩
		// 한 클래스 안에 같은 이름의 메서드 여러개 정의하는 것
		
		// ex) void println()
		// void println(float x)
		// void println(char x)
		// void println(int x)
		// void println(String x)
		
		// 오버로딩이 성립하기 위한 조건
		// 1. 메서드 이름이 같아야 한다
		
		// 2. 매개변수의 개수 또는 타입이 달라야 한다
		// long add(int a, long b){return a+b;}
		// long add(long a, int b){return a+b;}
		// 단, add(3,3); 하면 모호하므로 에러
		
		//	-> 중복정의란 다름!
		//		-> 아래 예시는 중복정의!
		
		// int add(int a, int b){return a+b;}
		// int add(int x, int y){return x+y;}
		
		// int add(int a, int b){return a+b;}
		// long add(int a, int b){return (long)(a+b);}
		
		// 3. 반환 타입은 영향없다
		
		MyOver mm = new MyOver();
		System.out.println("mm.add(3, 3) 결과:" + mm.add(3, 3));
		System.out.println("mm.add(3L, 3) 결과:" + mm.add(3L, 3));
		System.out.println("mm.add(3, 3L) 결과:" + mm.add(3, 3L));
		System.out.println("mm.add(3L, 3L) 결과:" + mm.add(3L, 3L));
		
		int[] a = {100, 200, 300};
		System.out.println("mm.add(a) 결과: "+ mm.add(a));
		
	}
}
class MyOver{
	
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a+b;
	}
	
	long add(int a, long b) {
		System.out.print("long add(int a, long b) - ");
		return a+b;
	}
	
	long add(long a, int b) {
		System.out.print("long add(long a, int b) - ");
		return a+b;
	}

	long add(long a, long b) {
		System.out.print("long add(long a, long b) - ");
		return a+b;
	}

	int add(int[] a) {		
		System.out.print("int add(int[] a) - ");
		int result = 0;
		for(int i=0; i < a.length;i++) 
			result += a[i];
		
		return result;
	}		
	
}
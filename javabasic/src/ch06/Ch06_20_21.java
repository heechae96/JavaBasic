package ch06;

public class Ch06_20_21 {

	public static void main(String[] args) {

		// return문, 반환값
		// 실행 중인 메서드를 종료하고 호출한 곳으로 되돌아간다.
		
		// 반환타입이 void인 경우 return; 생략가능!
		
		MyMath1 mm = new MyMath1();
		mm.printGugudan(12);
		System.out.println("==================");
		mm.printGugudan(6);
		System.out.println("==================");
		
		long result = mm.max(5, 3);
		System.out.println(result);
		
	}

}

class MyMath1{
	void printGugudan(int dan) {
		if(!(2<=dan && dan<=9)) {
			return;
		}
		for(int i=1; i<10; i++) {
			System.out.printf("%d * %d = %d%n", dan, i, dan*i);
		}
	}
	
	long max(long a, long b) {
		if(a>b)
			return a;
		else
			return b;
	}
}

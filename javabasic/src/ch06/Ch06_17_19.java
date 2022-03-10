package ch06;

public class Ch06_17_19 {

	public static void main(String[] args) {

		// 메서드 호출	
		// 메서드이름(값1, 값2, ...);
		
		// 객체 생성
		MyMath mm = new MyMath();
		// 메서드 호출
		long result1 = mm.add(5L, 3L);
		System.out.println("add(5L, 3L) = "+result1);
		
		long result2 = mm.sub(5L, 3L);
		System.out.println("sub(5L, 3L) = "+result2);
		
		long result3 = mm.mul(5L, 3L);
		System.out.println("mul(5L, 3L) = "+result3);
		
		long result4 = mm.div(5L, 3L);
		System.out.println("div(5L, 3L) = "+result4);
		
		long result5 = mm.max(5L, 3L);
		System.out.println("max(5L, 3L) = "+result5);

		long result6 = mm.min(5, 3);
		System.out.println("min(5, 3) = "+result6);

	}

}

class MyMath{
	long add(long a, long b) {
//		long result = a + b;
//		return result;
		
		// 위 두 줄을 한 줄로
		return a+b;
	}
	
	long sub(long a, long b) {
		// 위 두 줄을 한 줄로
		return a-b;
	}

	long mul(long a, long b) {	
		// 위 두 줄을 한 줄로
		return a*b;
	}

	long div(long a, long b) {
		// 위 두 줄을 한 줄로
		return a/b;
	}
	
	long max(long a, long b) {
		return a > b ? a : b;
	}
	
	long min(long a, long b) {
		return a < b ? a : b;
	}

}



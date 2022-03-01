package ch03;

public class Ch03_7_8 {

	public static void main(String[] args) {

		// 형변환
		// 변수나 상수의 타입을 다른타입으로 변환하는 것
		// 유니코드 문자표 사용 ex) 'A' -> 65		'a' -> 97
		// 작은타입에서 큰타입으로 가는경우 자동 형변환이 가능하다!
		// 단, long이 float보다 크지만 float으로 형변환 가능 
		//		-> 실수인 float이 표현범위가 훨씬크다.
		// 바이트가 같아도 char와 short처럼 범위가 다르면 불가
		
		// 예외적으로 큰타입에서 작은타입으로 가는 형변환이 가능.
		// 범위를 보고 문제가 없는 경우
		byte b = 100;
		// 범위를 벗어나는 경우는 에러 
//		byte b = 1000;
		
		System.out.println(b);
		//byte b = (byte)100	자동으로 컴파일된것 
		
		// 실수에서 정수로 형변환시 소수값은 버려짐 
		
		
		int i = 100;
		// 위에는 리터럴(상수)이지만 여기서는 변수 
		// 컴파일러가 값을 확신할수 없다
		// 자동 형변환 불가!
//		byte by = i;
		// 직접해줘야 한다!
		byte by = (byte)i;
		System.out.println(by);
		
		// 형변환이 가능하지만 범위를 벗어나 값손실이 일어남 
		byte byt = (byte)1000;
		System.out.println(byt);
		
	}

}

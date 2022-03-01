package ch02;

public class Ch02_15_16 {

	public static void main(String[] args) {
		
		// 정수형의 오버플로우
		// 계수기(counter)처럼 생각하면 좋다 
		// 최대값이나 최소값을 넘아가면 초기화된다
		
		// 부호가 있는 경우 
		short sMin = -32768, sMax = 32767;
		// 부호가 없는 경우 
		char cMin = 0, cMax=65535;
		System.out.println((short)(sMin-1));
		System.out.println((short)(sMax+1));
		System.out.println((int)--cMin);
		System.out.println((int)++cMax);

	}

}


package ch05;

import java.util.Arrays;

public class Ch05_6_7 {

	public static void main(String[] args) {

		// 배열의 출력
		
		// 참조변수를 그냥 출력 시키면 정상적으로 출력x
		int[] iArr = {100, 95, 80, 70, 60};
		System.out.println(iArr);
		// [I@626b2d4a
		// [ : 배열	/I : 정수
		
		// 문자로 된 배열만 정상적으로 출력!
		// 이유는 뒤에서..
		char[] chArr = {'a', 'b', 'c', 'd'};
		System.out.println(chArr);
		//abcd
		
		// 1. 반복문을 통해서 배열을 출력
		for(int i=0; i<iArr.length; i++) {
			System.out.println(iArr[i]);
		}

		for(int i=0; i<iArr.length; i++) {
			System.out.printf(iArr[i]+",");
		}
		System.out.println();
		
		// 2. 클래스를 이용해 배열을 출력
		System.out.println(Arrays.toString(iArr));
		// ex) System.out.println(Arrays.toString(참조변수); 
		// -> 문자열로 바꿔서 출력시킨것
		
		
		
		
		
	}

}

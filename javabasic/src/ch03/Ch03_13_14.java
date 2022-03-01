package ch03;

public class Ch03_13_14 {

	public static void main(String[] args) {

		// 비교연산자
		// 두 피연산자를 비교해서 true(참) 또는 false(거짓)을 반환 
		// <	>	>=	<=	==	!=
		// 두 문자(char)를 비교하는 경우
		// char은 int보다 작으므로 int로 계산한다!
		//	-> 앞에서 배웠다!
		
		
		// 문자열의 비교
		// == 대신 equals()를 사용해야 한다!
		// 1
		String str1 = "abc";
		String str2 = "abc";
		
		System.out.println(str1 == str2);	// true
		System.out.println(str1.equals(str2));	// true

		// 2
		// 1번과 2번은 9장에서 차이를 배운다.
		String str3 = new String("abc");
		String str4 = new String("abc");
		
		// 6장에서 자세히 배운다.
		System.out.println(str3 == str4);	// false
		System.out.println(str3.equals(str4));	// true
		
		
		
		
	}

}

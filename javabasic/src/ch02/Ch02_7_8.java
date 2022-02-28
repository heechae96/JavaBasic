package ch02;

public class Ch02_7_8 {

	public static void main(String[] args) {
		
		// 문자와 문자열
		char ch = 'a';
		System.out.println(ch);
//		char ch1 = 'ab';	// 에러
		int i = 'a';
		System.out.println(i);
		
		// String s = 'a';	차이점은 뒤에서 배울것!
		String s = new String("a");
		System.out.println(s);
		
		String str = "";
		System.out.println(str);
		String str2 = "abcd";
		String str3 = "123";
		String str4 = str2 + str3;
		System.out.println(str4);
		
		// 문자열 + any type -> 문자열 
		System.out.println(""+7+7);
		// any type + 문자열 -> 문자열 
		System.out.println(7+7+"");
		
	}

}

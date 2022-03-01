package ch02;

public class Ch02_17 {
	
	public static void main(String[] args) {
		
		// 타입간의 변환방법 
		String str = "3";
		
		System.out.println(3);
		
		// 숫자 + '0' -> 문자
		// 문자 - '0' -> 숫자 
		System.out.println(str.charAt(0) - '0');
		System.out.println('3'-'0'+1);
		
		// 숫자나 문자는 " " 더해주면 문자열 
		System.out.println(Integer.parseInt(str)+1);
		System.out.println(str+1);
		
		// '0'은 숫자로 48 
		System.out.println(3+'0');
		System.out.println((char)(3+'0'));
		
	}
}

package ch05;

import java.util.Arrays;

public class Ch05_14_15 {

	public static void main(String[] args) {
		
		// String클래스
		
		// 1. char[]와 메서드(기능)를 결합한 것
		// String 클래스 = char[] + 메서드(기능)
		
		// 2. 내용을 변경할 수 없다(read only)
		//	-> 읽기만 가능하다
		//  -> 9장에서 자세히 다룰것
		//  -> 문자열을 결합하면 완전히 새로운 문자열이 생기는것
		//		-> 기존에 있던 문자열이 변경되는것 x
		
		// 주요 메서드
		
		// char charAt(int index)
		// -> 문자열에서 해당위치(인덱스)에 있는 문자를 반환
		
		// int length()
		// -> 문자열의 길이를 반환
		
		// String substring(int from, int to)
		// 문자열에서 해당 범위(from~to)의 문자열을 반환한다(to는 포함 x)
		
		// boolean equals(Object obj)
		// 문자열의 내용이 같은지 확인한다
		// 같으면 true 다르면 false
		
		// char[] toCharArray()
		// 문자열을 문자배열(char[])로 변환해서 반환한다
		
		
		String str = "ABCDE";
		char ch = str.charAt(2);
		System.out.println(ch);
		System.out.println(str.length());
		
		String str2 = str.substring(1,4);
		// to생략하면 끝까지 출력
		// String str3 = str.substring(1, str.length());
		String str3 = str.substring(1);
		
		System.out.println(str2);
		System.out.println(str3);
		
		
		
		
	}
}

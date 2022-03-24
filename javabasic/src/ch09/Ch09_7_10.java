package ch09;

public class Ch09_7_10 {

	public static void main(String[] args) {

		// String클래스
		//	-> 데이터(char[]) + 메서드(문자열 관련)
		/*
		public final class String implements java.io.Serializable, Comparable{
			private char[] value;
			// ...
		}
		*/
		// 내용을 변경할 수 없는 불변(immutable) 클래스
		String a = "a";	// 0x100
		String b = "b";	// 0x200
		a = a + b;		// a = 0x300
		System.out.println(a);	// "ab"
		// 덧셈 연산자(+)를 이용한 문자열 결합은 성능이 떨어짐
		// 문자열의 결합이나 변경이 빈번하다면, 내용을 변경가능한 StringBuffer를 사용
		//												-> 내용 변경 가능
		
			
		
		// 문자열 비교
		// String str = "abc"; 와 String str = new String("abc"); 의 비교
		// 전자는 하나만 만들어두고 그 문자열을 공유
		// 후자는 내용이 같아도 항상 새로운 문자열 생성
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		String str4 = new String("abc");
		
		System.out.println(str1 == str2);	// 주소값 같음
		System.out.println(str3 == str4);	// 주소값 다름
		System.out.println(str1 == str4);	// 주소값 다름
		
		System.out.println(str1.equals(str2));	// 내용 같음
		System.out.println(str3.equals(str4));	// 내용 같음
		System.out.println(str1.equals(str4));	// 내용 같음
		
		// 문자열 리터럴
		//	-> 프로그램 실행시 자동으로 생성된다.(constant pool에 저장)
		//									-> 상수 저장소
		// 같은 내용의 문자열 리터럴은 하나만 만들어진다
		
		
		
		// 빈 문자열("", empty string)
		// 내용이 없는 문자열. 크기가 0인 char형 배열을 저장하는 문자열
		// String str = "";
		// 크기(길이)가 0인 배열을 생성하는 것은 어느 타입이나 가능
		// char[] chArr = new char[0];
		// int[] iArr = {};
		
		// Q. 크기가 0인게 왜 필요해?
		// A. null로 두는것보다 유용
		// Q. 그럼 언제써?
		// A. "" + 5 = "5"
		
		// 문자(char)와 문자열(String)의 초기화
		// 기본값
		// String s = null;
		// char c = '\u0000';	// 유니코드 첫번째 문자
		// 초기화
		// String s = "";
		// char c = ' ';	// 공백으로 초기화
		
	}

}

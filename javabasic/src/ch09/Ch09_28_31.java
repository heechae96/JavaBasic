package ch09;

import java.util.ArrayList;

public class Ch09_28_31 {

	public static void main(String[] args) {

		// 문자열을 숫자로 변환하기
		//	-> 문자열을 숫자로 변환하는 다양한 방법 
		int i = new Integer("100").intValue();
		int i2 = Integer.parseInt("100");
		Integer i3 = Integer.valueOf("100");
		int i4 = Integer.valueOf("100");
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		
		
		// n진법의 문자열을 숫자로 변환하는 방법
		int i5 = Integer.parseInt("100",2);	// 100(2) 
		int i6 = Integer.parseInt("100",8);	// 100(8)
		int i7 = Integer.parseInt("100",16);	//	100(16)
		int i8 = Integer.parseInt("FF",16);
		// 뒤에 생략하면 10진수! 10진수에는 F가 없음!
		//	-> NumberFormartException발생
//		int i8 = Integer.parseInt("FF");		
		System.out.println(i5);
		System.out.println(i6);
		System.out.println(i7);
		System.out.println(i8);
		
		
		
		// 오토박싱 & 언박싱
		//	오토박싱 : int -> Integer
		//	언박싱 : Integer -> int 
		//	-> 둘 다 자동으로 컴파일러가 해줌!
		
		// JDK1.5이전에는 기본형과 참조형간의 연산이 불가능
		
		// ArrayList는 원래 객체만 저장이 가능한 클래스
		//	-> 뒤에서 자세히 배울것!
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(100));	// list에는 객체만 추가가능
		// 오토박싱
		list.add(200);	// JDK1.5이전에는 에러
		
//		Integer ii = list.get(0);			// list에 저장된 첫번째 객체를 꺼낸다.
		int ii = list.get(0).intValue();// intValue()로 Integer를 int로 변환.
		// 언박싱
		int iii = list.get(1);			// intValue()로 Integer를 int로 변환.
		
		System.out.println(ii);
		System.out.println(iii);
		
		
		
	}

}

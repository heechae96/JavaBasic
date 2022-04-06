package ch12;

import java.util.ArrayList;

public class Ch12_1 {

	public static void main(String[] args) {

		// 제네릭스(Generics)란?
		//	-> 컴파일시 타입을 체크해 주는 기능(compile-time type check) - JDK1.5
		//	-> 객체의 타입 안정성을 높이고, 형변환의 번거로움을 줄여줌
		
		// 제네릭스의 장점?
		//	1. 타입 안정성을 제공한다
		//		-> ClassCastException(형변환에러) 막을 수 있다
		// 	2. 타입체크와 형변환을 생략할 수 있으므로 코드가 간결해 진다
		
		// 런타임에러는 프로그램이 뻗어버린다
		//	컴파일에러는 바로잡고 저장이 가능.
		//	런타임 에러를 컴파일 단으로 끌고올 수 있을까?
		// 	ex) 제네릭스!
		//	ClassCastException는 컴파일 타임에 타입 정보를 준다
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);	// list.add(new Integer(10));
		list.add(20);
//		list.add("30");
		list.add(30);
		
//		Integer i = (Integer)list.get(2);
		Integer i = list.get(2);	// 형변환 생략 가능
		//						Object
		//			Integer <-
		System.out.println(list);
		
		
		
//		ArrayList list2 = new ArrayList();	// JDK1.5 이전. 제네릭스 도입이전
		ArrayList<Object> list2 = new ArrayList<Object>();	// JDK1.5 이후
		list2.add(10);	
		list2.add(20);
		list2.add("30");
		
		String str = (String)list2.get(2);
		
		System.out.println(list2);

		
	}

}

package ch10;

import java.util.*;

public class Ch10_5 {

	public static void main(String[] args) {
		
		// Calendar클래스(예제2,3)
		
		// clear()는 Calendar객체의 모든 필드를 초기화
		//	-> Thu Jan 01 00:00:00 KST 1970
		//		-> 1970년 1월1일 00시00분00초

		// 모든 필드 초기화
		Calendar dt = Calendar.getInstance();
		
		System.out.println(new Date(dt.getTimeInMillis()));
		
		dt.clear();
		
		System.out.println(new Date(dt.getTimeInMillis()));

		System.out.println("-----------------------------");
		
		// clear(int field)는 Calendar객체의 특정 필드를 초기화
		Calendar dt1 = Calendar.getInstance();
		
		System.out.println(new Date(dt1.getTimeInMillis()));
		
		dt1.clear(Calendar.SECOND);
		dt1.clear(Calendar.MINUTE);
		dt1.clear(Calendar.HOUR_OF_DAY);
		dt1.clear(Calendar.HOUR);
		
		System.out.println(new Date(dt1.getTimeInMillis()));
		

	}

}

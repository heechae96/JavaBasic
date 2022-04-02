package ch11;

import java.util.*;

public class Ch11_42 {

	public static void main(String[] args) {

		// TreeSet(2)
		// 관련 메소드는 사진 참고!

		Set set = new TreeSet();	// 범위 검색, 정렬에 유리. 정렬이 필요없음
//		Set set = new HashSet();	// 정렬이 필요

		for (int i = 0; set.size() < 6; i++) {
			int num = (int) (Math.random() * 45) + 1;
			// Integer가 가지고 있는 정렬을 사용한것
			// set.add(num); 
			set.add(new Integer(num));
//			set.add(new Test()); // 비교 기준이 없어서 에러!	기준이 필요!			
//			set.add(new Test()); // 비교 기준이 없어서 에러!	기준이 필요!			
//			set.add(new Test()); // 비교 기준이 없어서 에러!	기준이 필요!			
		}

		System.out.println(set);
	}

}

//class Test implements Comparable{
//
//	@Override
//	public int compareTo(Object o) {
//		return -1;
//	}
//	
//}	// 비교 기준이 없음	-> 만들어줘야함!
//
//class TestComp implements Comparator{
//
//	@Override
//	public int compare(Object o1, Object o2) {
//		return -1;	// 0으로 하면 같은 객체로 판단!
//	}
//	
//}

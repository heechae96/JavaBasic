package ch11;

import java.util.*;

public class Ch11_44 {
	
	public static void main(String[] args) {
		
		TreeSet set = new TreeSet();
		int[] score = {80, 95, 50, 35, 45, 65, 10, 100};

		for(int i=0; i < score.length; i++)
//			set.add(new Integer(score[i]));	
			set.add(score[i]);	// 오토박싱

		System.out.println("50보다 작은 값 :" + set.headSet(new Integer(50)));
		System.out.println("50보다 큰 값 :"  + set.tailSet(new Integer(50)));
		System.out.println("40과 80사이의 값 :"  + set.subSet(40, 80));
		
		// 특정 범위 내의 원소를 접근하기 위한 방법을 알아봅시다. 
		//	먼저, 가장 작은 원소부터 특정 값까지는 범위 접근은 headSet 메소드를 사용합니다.
		//		-> 인자로 넘기는 값과 동일한 원소는 빼고 반환하니 주의바랍니다. (exclusive)
		//	특정 원소부터 가장 큰 원소까지의 범위 접근은 tailSet 메소드를 사용합니다.
		//		-> 인자로 넘기는 값을 동일한 원소도 포함해서 반환하니 주의바랍니다. (inclusive)
		// 	마지막으로, 값A보다 크거나 같고, 값B보다 작은 원소의 범위 접근은 subSet 메소드를 사용합니다.
		//		-> 첫번째 인자는 inclusive, 두번째 인자는 exclusive 입니다.
		
	}

}

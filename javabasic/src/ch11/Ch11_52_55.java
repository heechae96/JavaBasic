package ch11;

import java.util.*;
// Collections를 생략하게 해줌
import static java.util.Collections.*;

public class Ch11_52_55 {

	public static void main(String[] args) {

		// Collections클래스
		//	-> 컬렉션 다룰때
		//	-> 컬렉션을 위한 메서드(static)를 제공
		//						-> Objects 객체 다룰때
		//						-> Arrays 배열 다룰때
		
		// 1. 컬렉션 채우기, 복사, 정렬, 검색
		//	-> fill(), copy(), sort(), binarySearch() 등
		// 2. 컬렉션의 동기화 - synchronizedXXX()
		//	-> 항상 동기화 하는것보다 필요할때만 동기화 하는게 좋다
		// 3. 변경불가(readOnly) 컬렉션 만들기 - unmodifiableXXX()
		// 4. 싱글톤 컬렉션 만들기 - singletonXXX
		//	-> 객체 1개만 저장
		// 5. 한 종류의 객체만 저장하는 컬렉션 만들기 - checkedXXX() 
		//	-> JDK1.5부터는 12장에서 배울 제네릭스를 쓴다!
		
		List list = new ArrayList();
		System.out.println(list);

		// Collections를 생략 (Collections.addAll)
		addAll(list, 1,2,3,4,5); 
		System.out.println(list);
		
		rotate(list, 2);  // 반시계 방향으로 두 번 회전
		System.out.println(list);

		swap(list, 0, 2); // 첫 번째와 세 번째를 교환(swap)
		System.out.println(list);

		shuffle(list);    // 저장된 요소의 위치를 임의로 변경 
		System.out.println(list);

		sort(list, reverseOrder()); // 역순 정렬 reverse(list);와 동일 
		System.out.println(list);
		
		sort(list);       // 정렬 
		System.out.println(list);
 
		// 이진탐색할때 반드시 정렬필요!
		int idx = binarySearch(list, 3);  // 3이 저장된 위치(index)를 반환
		System.out.println("index of 3 = " + idx);
		
		System.out.println("max="+max(list));
		System.out.println("min="+min(list));
		// 반대정렬로 최대값 -> 최소값
		System.out.println("min="+max(list, reverseOrder()));

		fill(list, 9); // list를 9로 채운다.
		System.out.println("list="+list);

		// list와 같은 크기의 새로운 list를 생성하고 2로 채운다. 단, 결과는 변경불가
		List newList = nCopies(list.size(), 2); 
		System.out.println("newList="+newList);

		System.out.println(disjoint(list, newList)); // 공통요소가 없으면 true

		copy(list, newList); 
		System.out.println("newList="+newList);
		System.out.println("list="+list);

		replaceAll(list, 2, 1); 
		System.out.println("list="+list);

		Enumeration e = enumeration(list);	// iterator와 같은것	열거!
		ArrayList list2 = list(e); 

		System.out.println("list2="+list2);
	}

}

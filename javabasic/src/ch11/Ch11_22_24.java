package ch11;

import java.util.*;

public class Ch11_22_24 {

	public static void main(String[] args) {

		// Iterator, ListIterator, Enumeration
		//	-> 컬렉션에 저장된 데이터를 접근하는데 사용되는 인터페이스
		//		-> 컬렉션에 저장된 요소들을 읽어오는 방법을 표준화한 것
		
		// Iterator(제일 많이 사용)
		
		// boolean hasNext()
		//	-> 읽어 올 요소가 남아있는지 확인.
		// Object next()
		//	-> 다음 요소를 읽어온다.
		
		// Enumeration은 Iterator의 구버전
		
		// boolean hasMoreElements()
		//	-> 읽어 올 요소가 남아있는지 확인.
		// Object nextElement()
		//	-> 다음 요소를 읽어온다.
		
		// ListIterator는 Iterator의 접근성을 향상시킨 것(단방향 -> 양방향)
		// 							-> next()이외에 previous()가 존재
		
		
		// 컬렉션에 iterator()를 호출해서 Iterator를 구현한 객체를 얻어서 사용
		ArrayList list = new ArrayList();
//		HashSet list = new HashSet();
		//	-> get메소드가 없으므로 for문은 작동을 안함!
		//	-> iterator관련 메소드는 상관없이 사용 가능!
		//		-> Set은 Collection의 자손이므로!
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

		// Iterator는 일회용이라 한번 다 쓰면 다시한번 가져와야함!
		// ex) it = list.iterator();
		Iterator it = list.iterator();

		while(it.hasNext()) {
			// next메서드는 조회하고 삭제하는게 아님. 가라키는 무언가가 움직이는것!
			//	-> 움직이면서 지정된 객체를 반환!
			Object obj = it.next();
			System.out.println(obj);
//			System.out.println(list);
		}
		
		for(int i=0; i<list.size(); i++) {
			// 지정된 객체를 반환!
			Object obj = list.get(i);
			System.out.println(obj);
//			System.out.println(list);
		}
		
		
		
		// Map과 Iterator
		// Map에는 iterator()가 없다
		// 	-> keySet(), entrySet(), values()를 호출해야함
		// Iterator it = map.entrySet().iterator();
		//						-> Set
		//					-> Iterator	
		
	}

}

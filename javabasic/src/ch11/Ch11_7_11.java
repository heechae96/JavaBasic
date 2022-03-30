package ch11;

import java.util.*;

public class Ch11_7_11 {

	public static void main(String[] args) {

		// ArrayList
		// 	-> ArrayList는 기존의 Vector를 개선한 것으로 구현원리와 기능적으로
		//	동일 ArrayList와 달리 Vector는 자체적으로 동기화처리가 되어있다.
		//	-> List인터페이스를 구현하므로, 저장순서가 유지되고 중복을 허용한다.
		//	-> 데이터의 저장공간으로 배열을 사용한다.(배열기반)
		
		// ArrayList의 메서드
		// 생성자
		// ArrayList()
		// ArrayList(Collection c)
		// ArrayList(int initialCapacity)
		//	-> 마찬가지로 배열이므로 한번 설정한 길이를 변경 할 수 없다!
		//		-> 처음에 넉넉하게 설정해야 효율적!
		
		// 추가
		// boolean add(Object o)
		// void add(int index, Object element)
		// boolean addAll(Collenction c)
		// boolean addAll(int index, Collection c)
		
		// 삭제
		// boolean remove(Object o)
		// Object remove(int index)
		// boolean removeAll(Collection c)
		// void clear()
		
		// 참고! 
		// 첫번째 객체부터 삭제하는 경우의 속도 < 마지막 객체부터 삭제하는 경우의 속도
		//	-> 배열 복사 발생					-> 배열 복사 발생안함
		//										-> 효율적!
		
		
		// 검색
		// int indexOf(Object o)
		// int lastIndexOf(Object o)
		// boolean contains(Object o)
		// Object get(int index)
		// Object set(int index, Object element)
		// List subList(int fromIndex, int toIndex)
		// Object[] toArray()
		// Object[] toArray(Object[] a)
		// boolean isEmpty()
		// void trimToSize()
		// int size()
		
		ArrayList list1 = new ArrayList(10);
//		list1.add(new Integer(5));
//		list1.add(new Integer(4));
//		list1.add(new Integer(2));
//		list1.add(new Integer(0));
//		list1.add(new Integer(1));
//		list1.add(new Integer(3));
		// 앞에서 배운 오토박싱 때문에 가능!
		list1.add(5);
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);

		ArrayList list2 = new ArrayList(list1.subList(1,4)); 
		//									-> 읽기만 가능
		print(list1, list2);

		// Collection은 인터페이스, Collections는 유틸 클래스
		Collections.sort(list1);	// list1과 list2를 정렬한다.
		Collections.sort(list2);	// Collections.sort(List l)
		print(list1, list2);

		System.out.println("list1.containsAll(list2):"
                                               + list1.containsAll(list2));

		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		print(list1, list2);

		list2.set(3, "AA");
		print(list1, list2);
		
		list1.add(0, "1");
		// 문자열 1과, 숫자 1이 다름!
		System.out.println("index="+list1.indexOf("1"));
		System.out.println("index="+list1.indexOf(1));
		// 없으면 -1 출력!
		System.out.println("index="+list1.indexOf("11"));
		
		print(list1, list2);
		
//		list1.remove(1);	// 인덱스1이 사라짐
		list1.remove(new Integer(1));	// 1을 삭제
		
		print(list1, list2);
		
		System.out.println("---------------------------");
		

		// list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
		System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));

		print(list1, list2);

		//  list2에서 list1에 포함된 객체들을 삭제한다.
		for(int i= list2.size()-1; i >= 0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
			print(list1, list2);
		}
		System.out.println("-------------------");
		
		print(list1, list2);
	} // main의 끝
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();		
	}

}

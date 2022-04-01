package ch11;

import java.util.*;

public class Ch11_34_36 {

	public static void main(String[] args) {

		// HashSet
		// -> 순서x, 중복x
		// -> Set인터페이스를 구현한 대표적인 컬렉션 클래스
		// -> 순서를 유지하려면, LinkedHashSet클래스를 사용하면 된다
		// 주요 메서드
		// -> HashSet()
		// -> HashSet(Collection c)
		// -> HashSet(int initialCapacity)
		// -> HashSet(int initialCapacity, float loadFactor)

		// -> boolean add(Object o)
		// -> boolean addAll(Collection c)
		// -> boolean remove(Object o)
		// -> boolean retainAll(Collection c)
		// -> void clear()

		// -> boolean contains(Object o)
		// -> boolean containsAll(Collection c)
		// -> Iterator iterator()

		// -> boolean inEmpty()
		// -> int size()
		// -> Object[] toArray()
		// -> Object[] toArray(Object[] a)

		// TreeSet
		// -> 범위 검색과 정렬에 유리한 컬렉션 클래스
		// -> HashSet보다 데이터 추가, 삭제에 시간이 더 걸림

		Object[] objArr = { "1", new Integer(1), "2", "2", "3", "3", "4", "4", "4" };
		Set set = new HashSet();

		for (int i = 0; i < objArr.length; i++) {
			System.out.println(objArr[i] + "=" + set.add(objArr[i]));
			// -> HashSet에 objArr의 요소들을 저장한다.
		}

		// HashSet에 저장된 요소들을 출력한다.
		System.out.println(set);

		// HashSet에 저장된 요소들을 출력한다.(Iterator이용)
		Iterator it = set.iterator();

		while (it.hasNext()) { // 읽어올 요소가 있는지 확인
			System.out.println(it.next()); // 요소 하나 반환
		}

		System.out.println("---------------------------");

		Set set2 = new HashSet();

		for (int i = 0; set2.size() < 6; i++) {
			int num = (int) (Math.random() * 45) + 1;
//			set2.add(new Integer(num));
			set2.add(num);
		}

		// 순서를 정렬하기 위해 List 사용
		List list = new LinkedList(set2); // LinkedList(Collection c)
		// 순서 정렬
		Collections.sort(list); // Collections.sort(List list)
		// 출력
		System.out.println(list);

	}

}

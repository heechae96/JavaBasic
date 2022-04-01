package ch11;

import java.util.*;

public class Ch11_30_32 {

	public static void main(String[] args) {

		// Comparator와 Comparable
		// -> 객체 정렬에 필요한 메서드(정렬기준 제공)를 정의한 인터페이스

		// 정렬
		// -> 두 대상 비교
		// -> 자리 바꿈

		// Comparable
		// -> 기본(default)정렬기준을 구현하는데 사용
		// -> 오름차순
		// -> 대문자, 소문자 순서
		// Comparator
		// -> 기본 정렬기준 외에 다른 기준으로 정렬하고자할 때 사용

		// compare()과 compareTo()는 두 객체의 비교결과를 반환하도록 작성
		// -> 같으면 0, 오른쪽이 크면 음수(-), 작으면 양수(+)

		String[] strArr = { "cat", "Dog", "lion", "tiger" };

		Arrays.sort(strArr); // String의 Comparable구현에 의한 정렬
		System.out.println("strArr=" + Arrays.toString(strArr));

		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분안함
		System.out.println("strArr=" + Arrays.toString(strArr));

		Arrays.sort(strArr, new Descending()); // 역순 정렬
		System.out.println("strArr=" + Arrays.toString(strArr));
	}
}

class Descending implements Comparator {
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable) o1;
			Comparable c2 = (Comparable) o2;
			return c1.compareTo(c2) * -1; // -1을 곱해서 기본 정렬방식의 역으로 변경한다.
			// 또는 c2.compareTo(c1)와 같이 순서를 바꿔도 된다.
		}
		return -1;

	}
}

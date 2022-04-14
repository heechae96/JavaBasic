package ch14;

import java.util.*;

public class Ch14_11_12 {

	public static void main(String[] args) {

		// CF와 함수형 인터페이스

		// 함수형 인터페이스를 사용하는 컬렉션 프레임웍의 메서드(와드 카드 생략)
		// -> 사진참고!

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++)
			list.add(i);

		// list의 모든 요소를 출력
		list.forEach(i -> System.out.print(i + ","));

//		System.out.println(list);
		// 예전에는 아래와 같이 출력했음
//		Iterator it = list.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}

		System.out.println();

		// list에서 2 또는 3의 배수를 제거한다.
		list.removeIf(x -> x % 2 == 0 || x % 3 == 0);
		System.out.println(list);

		list.replaceAll(i -> i * 10); // list의 각 요소에 10을 곱한다.
		System.out.println(list);

		Map<String, String> map = new HashMap<>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");

		// map의 모든 요소를 {k,v}의 형식으로 출력한다.
		map.forEach((k, v) -> System.out.print("{" + k + "," + v + "},"));
		System.out.println();

//		System.out.println(map);
		// 예전에는 아래와 같이 출력했음
//		Iterator it = map.entrySet().iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
	}
}

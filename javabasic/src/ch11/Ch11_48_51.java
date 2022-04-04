package ch11;

import java.util.*;

public class Ch11_48_51 {

	public static void main(String[] args) {

		// HashMap의 주요 메서드
		//	-> 배열 + 링크드 리스트
		
		// 생성자
		// HashMap()
		// HashMap(int initialCapacity)
		// HashMap(int initialCapacity, float loadFactor)
		// HashMap(Map m)
		
		// Object put(Object key, Object value)
		// void putAll(Map m)
		// Object remove(Object key)
		// Object replace(Objec key, Object value)
		// boolean replace(Object Key, Object value)
		// boolean replace(Object Key, Object oldValue, Object newValue)
		
		// Set entrySet()
		// Set ketSet()
		// Collection values()
		
		// Object get(Object key)
		// Object getOrDefault(Object key, Object defaultValue)
		// boolean containsKey(Object key)
		// boolean containsValue(Object value)
		
		// int size()
		// boolean isEmpty()
		// void clear()
		// Object clone()	// 복제
		
//		HashMap map = new HashMap();
//		map.put("myId", "1234");
//		map.put("asdf", "1111");
//		System.out.println(map);
//		map.put("asdf", "1234");
//		System.out.println(map);
//		
//		Scanner s = new Scanner(System.in);	// 화면으로부터 라인단위로 입력받는다.
//
//		while(true) {
//			System.out.println("id와 password를 입력해주세요.");
//			System.out.print("id :");
//			String id = s.nextLine().trim();	// 앞뒤 공백제거
//
//			System.out.print("password :");
//			String password = s.nextLine().trim();
//			System.out.println();
//
//			if(!map.containsKey(id)) {
//				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
//				continue;
//			} 
//			
//			if(!(map.get(id)).equals(password)) {
//				System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
//			} else {
//				System.out.println("id와 비밀번호가 일치합니다.");
//				break;
//			}
//		}
		
		System.out.println();
		
//		HashMap map2 = new HashMap();
//		map2.put("김자바", 90);	// 오토박싱 때문에 가능! new Integer(90)
//		map2.put("김자바", 100);
//		map2.put("이자바", 100);
//		map2.put("강자바", 80);
//		map2.put("안자바", 90);
//
//		Set set = map2.entrySet();
//		Iterator it = set.iterator();
//
//		while(it.hasNext()) {
//			Map.Entry e = (Map.Entry)it.next();
//			System.out.println("이름 : "+ e.getKey() + ", 점수 : " + e.getValue());
//		}
//
//		set = map2.keySet();
//		System.out.println("참가자 명단 : " + set);
//
//		Collection values = map2.values();
//		it = values.iterator();
//
//		int total = 0;
//		
//		while(it.hasNext()) {
//			int i = (int)it.next();
//			total += i;
//		}
//
//		System.out.println("총점 : " + total);
//		System.out.println("평균 : " + (float)total/set.size());
//		//comparable을 구현을 클래스의 객체만 들어올수 있다
//		//	-> Collection 클래스의 정렬은 Comparable 인터페이스를 이용하여 이루어짐
//		System.out.println("최고점수 : " + Collections.max(values));
//		System.out.println("최저점수 : " + Collections.min(values));
		
		System.out.println();
		
		String[] data = { "A","K","A","K","D","K","A","K","K","K","Z","D" };

		HashMap map = new HashMap();

		for(int i=0; i < data.length; i++) {
			if(map.containsKey(data[i])) {
				int value = (int)map.get(data[i]);
				map.put(data[i], value+1);  // 기존에 존재하는 키면 기존 값을 1증가
			} else {
				map.put(data[i], 1);	    // 긱존에 존재하지 않는 키는 값을 1로 저장		
			}
		}

		Iterator it = map.entrySet().iterator();

		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			int value = (int)entry.getValue();
			System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value );
		}
	} // main
	
	public static String printBar(char ch, int value) { 
		char[] bar = new char[value]; 

		for(int i=0; i < bar.length; i++)
			bar[i] = ch; 

		return new String(bar); // String(char[] chArr)
	}
		
}


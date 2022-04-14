package ch14;

import java.util.function.*;

public class Ch14_9_10 {

	public static void main(String[] args) {

		// Predicate의 결합
		//	-> 조건식을 표현하는데 사용됨. 매개변수는 하나. 반환타입은 boolean
		
		// 인터페이스가 가질 수 있는 메서드
		//	1. default메서드
		//	2. static메서드
		//	3. 추상메서드
		
		// and(), or(), negate()로 두 Predicate를 하나로 결합(default메서드)
		//	&&     ||	   !
	
		// test()메소드로 결과 반환
		
		// 등가비교를 위한 Predicate의 작성에는 isEqual()를 사용(static 메서드)
		
		
		//		입력		출력
		Function<String, Integer>	f  = (s) -> Integer.parseInt(s, 16);
		Function<Integer, String>	g  = (i) -> Integer.toBinaryString(i);

		//							f와 g를 연결해서 새로운 h생성
		Function<String, String>    h  = f.andThen(g);
		//								g.andThen(f)와 같다
		//							g와 f를 연결해서 새로운 h2생성
		Function<Integer, Integer>  h2 = f.compose(g);

		System.out.println(h.apply("FF")); // "FF" → 255 → "11111111"
		System.out.println(h2.apply(2));   // 2 → "10" → 16

		Function<String, String> f2 = x -> x; // 항등 함수(identity function)
		System.out.println(f2.apply("AAA"));  // AAA가 그대로 출력됨

		Predicate<Integer> p = i -> i < 100;
		Predicate<Integer> q = i -> i < 200;
		Predicate<Integer> r = i -> i%2 == 0;
		Predicate<Integer> notP = p.negate(); // i >= 100

		// (i>=100)&&(i<200||i%2==0)
		Predicate<Integer> all = notP.and(q.or(r)); 
		System.out.println(all.test(150));       // true

//		String str1 = "abc";
		String str1 = new String("abc");
		String str2 = "abc";
		
		// str1과 str2가 같은지 비교한 결과를 반환
		Predicate<String> p2 = Predicate.isEqual(str1); 
		boolean result0 = str1.equals(str2);
		boolean result = p2.test(str2);   
		System.out.println(result0);
		System.out.println(result);		
	}

}

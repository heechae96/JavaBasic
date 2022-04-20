package ch14;

import java.util.*;

public class Ch14_37_39 {

	public static void main(String[] args) {

		// OptionalInt, OptionalLong, OptionalDouble
		// -> 기본형 값을 감싸는 래퍼클래스

		// Optional- 값 가져오기
		// -> int getAsInt
		// -> long getAsLong
		// -> double getAsDouble

		// 빈 Optional객체와의 비교
//		OptionalInt opt = OptionalInt.of(0);	// 0을 저장
//		OptionalInt opt2 = OptionalInt.empty();	// 비어있어서 0을 저장 (default값)

		Optional<String> optStr = Optional.of("abcde");		
//		Optional<Integer> optInt = optStr.map(s->s.length());
		Optional<Integer> optInt = optStr.map(String::length);
		System.out.println("optStr=" + optStr.get());
		System.out.println("optInt=" + optInt.get());

		int result1 = Optional.of("123").
				filter(x -> x.length() > 0).map(Integer::parseInt).get();

		// null이면 -1 : orElse(-1)
		int result2 = Optional.of("").
				filter(x -> x.length() > 0).map(Integer::parseInt).orElse(-1);

		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);

		Optional.of("456").map(Integer::parseInt)
						.ifPresent(x -> System.out.printf("result3=%d%n", x));

		OptionalInt optInt1 = OptionalInt.of(0); 	// 0을 저장
		OptionalInt optInt2 = OptionalInt.empty(); 	// 비어있어서 0을 저장 (default값)		
		System.out.println(optInt1.isPresent()); // true
		System.out.println(optInt2.isPresent()); // false

		System.out.println(optInt1.getAsInt()); // 0
//		System.out.println(optInt2.getAsInt());  // NoSuchElementException
		System.out.println("optInt1=" + optInt1);
		System.out.println("optInt2=" + optInt2);
		// 오버라이딩 되어있다
		System.out.println("optInt1.equals(optInt2)?" + optInt1.equals(optInt2));
	}

}

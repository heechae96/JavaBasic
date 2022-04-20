package ch14;

import java.util.*;
import java.util.stream.*;

public class Ch14_40_44 {

	public static void main(String[] args) {

		// 스트림의 최종연산
		// -> 중간연산과 다르게 1번만 사용 가능
		// -> 스트림이 닫힘. 스트림 요소 소모

		// 스트림의 모든 요소에 지정된 작업을 수행
		// forEach(),
		// -> 병렬스트림인 경우 순서가 보장되지 않음
		// forEachOrdered()
		// -> 병렬스트림인 경우에도 순서가 보장됨

		// 조건검사
		// allMath(Predicate<? super T> predicate)
		// -> 모든 요소가 조건을 만족시키면 true
		// anyMatch(Predicate<? super T> predicate)
		// -> 한 요소라도 조건을 만족시키면 true
		// noneMatch(Predicate<? super T> predicate)
		// -> 모든 요소가 조건을 만족시키지 않으면 true

		// 조건에 일치하는 요소 찾기
		// -> 결과가 null일 수 있어서 Optional<T>
		// -> filter와 같이 많이 씀
		// findFirst()
		// -> 첫 번째 요소를 반환. 순차 스트림에 사용
		// findAny()
		// -> 아무거나 하나를 반환. 병렬 스트림에 사용

		// ★스트림의 요소를 하나씩 줄여가며 누적연산 수행★
		// -> reduce()
		// identity
		// -> 초기값
		// accumulator
		// -> 이전 연산결과와 스트림의 요소에 수행할 연산

		// int a = identity;
		// for(int b : stream)
		// a = a + b; // sum

		// int reduce(int identity, IntBinaryOperator op)
		// int count = intStream.reduce(0, (a,b) -> a + 1); // count()
		// int sum = intStream.reduce(0, (a,b) -> a + b); // sum()

		String[] strArr = { "Inheritance", "Java", "Lambda", 
				"stream", "OptionalDouble", "IntStream", "count", "sum" };

		System.out.println("--직렬--");
		Stream.of(strArr).forEach(System.out::println);		// 순서대로
		System.out.println("--병렬--");
		Stream.of(strArr).parallel().forEach(System.out::println);	// 순서가 다름
		System.out.println("--병렬(순서유지)--");
		Stream.of(strArr).parallel().forEachOrdered(System.out::println);	// 순서대로
		
		System.out.println();
		
		// 0인게 하나라도 없는가?
		boolean noEmptyStr = Stream.of(strArr).noneMatch(s -> s.length() == 0);
		Optional<String> sWord = Stream.of(strArr)
				.filter(s -> s.charAt(0) == 's').findFirst();
		Optional<String> sWord2 = Stream.of(strArr)
				.parallel()	// 병렬
				.filter(s -> s.charAt(0) == 's')
				.findAny();	// 아무거나

		System.out.println("noEmptyStr=" + noEmptyStr);
		System.out.println("sWord=" + sWord.get());
		System.out.println("sWord=" + sWord2.get());

		// Stream<String>을 Stream<Integer>으로 변환
		//	-> 근본적으로 'Stream<String>을 IntStream으로 변환'과 같다
		//		-> 전자는 객체로 다루고, 후자는 기본형으로 다루는 차이
		//			-> 후자가 더 빠르다!
//		Stream<Integer> intStream = Stream.of(strArr).map(String::length);
		
		// Stream<String>을 IntStream으로 변환
		//												(s) -> s.length()
		IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);

		int count = intStream1.reduce(0, (a, b) -> a + 1);
		int sum = intStream2.reduce(0, (a, b) -> a + b);

//		OptionalInt max = intStream3.reduce(Integer::max);
		OptionalInt max = IntStream.empty().reduce(Integer::max);
		OptionalInt min = intStream4.reduce(Integer::min);
		System.out.println("count=" + count);
		System.out.println("sum=" + sum);
//		System.out.println("max=" + max.getAsInt());
//		System.out.println("max=" + max.orElse(0));			// 없으면 0을 반환
		System.out.println("max=" + max.orElseGet(()->0));	// 없으면 0을 반환
		System.out.println("min=" + min.getAsInt());

	}

}

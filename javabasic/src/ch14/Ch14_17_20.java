package ch14;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ch14_17_20 {

	public static void main(String[] args) {
		
		// cf. 스트림 사용 순서
		//	1. 스트림 생성
		//  2. 중간 연산
		//  3. 최종 연산
		
		// 스트림 만들기 - 컬렉션
		
		//	-> Collection인터페이스의 stream()으로 컬렉션을 스트림으로 변환
		//		-> Stream<E> stream()	// Collection인터페이스의 메서드
		
//		List<Integer> list = Arrays.asList(1,2,3,4,5);
//		Stream<Integer> intStram = list.stream();// list를 Stream으로 변환
//		intStram.forEach(System.out::print);
//
//		// stream은 1회용. stream에 대해 최종연산을 수행하면 stream이 닫힌다
//		intStram = list.stream();	// list로부터 stream을 생성
//		intStram.forEach(System.out::print);
		
		
		// 스트림 만들기 - 배열
		
		// 객체 배열로부터 스트림 생성하기
		String[] strArr = {"a","b","c","d"};
//		Stream<String> strStream = Stream.of(strArr);
		Stream<String> strStream = Arrays.stream(strArr);
		strStream.forEach(System.out::println);
		
		// 기본형 배열로부터 스트림 생성하기
		int[] intArr = {1,2,3,4,5};
		IntStream intStream = Arrays.stream(intArr);
//		System.out.println("count="+intStream.count());
//		System.out.println("count="+intStream.sum());
		System.out.println("count="+intStream.average());
//		Integer[] intArr = {1,2,3,4,5};
//		Stream<Integer> intStream = Arrays.stream(intArr);	// count()만 가능
//		intStream.forEach(System.out::println);
//		System.out.println("count="+intStream.count());
				
		
		
		}

}

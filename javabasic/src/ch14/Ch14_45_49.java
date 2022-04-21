package ch14;

import java.net.InterfaceAddress;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class Ch14_45_49 {

	public static void main(String[] args) {

		// collect()와 Collectors
		
		// 최종연산
		// reduce(): 전체 리듀싱
		// collect(): 그룹별 리듀싱
		
		// collect()는 Collector를 매개변수로 하는 스트림의 최종연산
		// Collector를 구현한 클래스의 객체를 매개변수로
		// 	-> Object collect(Collector collector)
		
		// Collector는 수집(collect)에 필요한 메서드를 정의해 놓은 인터페이스
//		public interface collector<T,A,R>{
//			// T(요소)를 A에 누적한 다음, 결과를 R로 변환해서 반환
//			// 아래 두가지가 핵심!
//			Supplier<A> suppliere();	// 누적할 곳
//			BiConsumer<A, T> accumulator();	// 누적방법
//		}
		
		// Collectors클래스는 다향한 기능의 컬렉터(Collector를 구현한 클래스)를 제공
		//	-> 변환, 통계, 문자열 결합, 리듀싱, 그룹화와 분할
		
		// 스트림을 컬렉션, 배열로 변환
		//	-> 컬렉션으로 변환
		//		toList(), toSet(), toMap(), toCollection()
		//	-> 배열로 변환
		//		toArray()
		
		// 스트림의 통계
		//	-> counting(), summingInt(), maxBy(), minBy()
		
		// 스트림을 리듀싱
		//	-> reducing()
		//		-> reduce()와 다르게 그룹별 리듀싱
		
		// 문자열 스트림의 요소를 모두 연결
		//	-> joining()
		
		
	}

}

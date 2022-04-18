package ch14;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ch14_21_22 {

	public static void main(String[] args) {

		// 스트림 만들기 - 임의의 수
//		IntStream intStream = new Random().ints();			// 무한스트림
//		IntStream intStream = new Random().ints(5);			// 유한스트림
//		IntStream intStream = new Random().ints(5,10);		// 10은 안들어감
		IntStream intStream = new Random().ints(10,5,10);	// 10개를 5부터 9까지
		intStream.forEach(System.out::println);			
//		intStream.limit(5).forEach(System.out::println);	// 유한스트림 출력
		System.out.println();
		
		// 스트림 만들기 - 특정 범위의 정수
//		IntStream intStream = IntStream.range(1,5);			// 1,2,3,4
//		IntStream intStream = IntStream.rangeClosed(1,5);	// 1,2,3,4,5
		
		
		// 스트림 만들기 - 람다식 iterate(), generate()
		// iterate(T seed, UnaryOperator f) 단항연산자
//		Stream<Integer> intStream2 = Stream.iterate(0, n->n+2);	// 무한스트림
		Stream<Integer> intStream2 = Stream.iterate(1, n->n+2);	// 홀수만
//		intStream2.forEach(System.out::println);
		intStream2.limit(10).forEach(System.out::println);
		
		// generate(Supplier s) : 주기만 하는것 입력x.출력o
		Stream<Integer> oneStream = Stream.generate(()->1);
		oneStream.limit(10).forEach(System.out::println);
		
		
		// 스트림 만들기 - 파일과 빈 스트림
		// 파일을 소스로 하는 스트림 생성하기
//		Stream<Path> Files.list(Path dir)	// Path는 파일 또는 디렉토리
//		Stream<String> Files.lines(Path path)	// 파일내용을 라인 단위
//		Stream<String> Files.lines(Path path, Charset cs)	// 파일내용을 라인 단위
//		Stream<String> lines()	// BufferedReader클래스의 메서드
		
		// 비어있는 스트림 생성하기
//		Stream emptyStream = Stream.empty();	// empty()는 빈 스트림을 생성해서 반환
//		long count = emptyStream.count();
	}

}

package ch14;

import java.io.*;
import java.util.stream.*;

public class Ch14_30_31 {

	public static void main(String[] args) {

		// 스트림의 중간연산(2)

		// 스트림의 요소 변환하기
		// -> map()
		// Stream<T> -> Stream<R>
		// Stream<R> map(Function<? super T, ? extends R> mappper)
		// Stream<R> map(Function<T, R> mappper)

		File[] fileArr = { new File("Ex1.java"), 
				new File("Ex1.bak"), 
				new File("Ex2.java"), 
				new File("Ex1"),
				new File("Ex1.txt") };

		Stream<File> fileStream = Stream.of(fileArr);

		// map()으로 Stream<File>을 Stream<String>으로 변환
//		Stream<String> filenameStream = fileStream.map((f)->f.getName());
		Stream<String> filenameStream = fileStream.map(File::getName);
		filenameStream.forEach(System.out::println); // 모든 파일의 이름을 출력

		System.out.println();
		
		fileStream = Stream.of(fileArr); // 스트림을 다시 생성

		fileStream.map(File::getName) // Stream<File> → Stream<String>
				.filter(s -> s.indexOf('.') != -1) // 확장자가 없는 것은 제외
				.map(s -> s.substring(s.indexOf('.') + 1)) // 확장자만 추출
				.map(String::toUpperCase) // 모두 대문자로 변환
				.distinct() // 중복 제거
				.forEach(System.out::println); // JAVABAKTXT

		System.out.println();
	}

}

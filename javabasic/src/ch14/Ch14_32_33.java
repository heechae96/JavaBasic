package ch14;

import java.io.*;
import java.util.stream.*;

public class Ch14_32_33 {

	public static void main(String[] args) {

		// 스트림의 중간연산(2)

		// 스트림의 요소를 소비하지 않고 엿보기
		// -> peek()
		// -> forEach와 같지만 연산종류가 다름!

		// 중간연산(스트림을 소비x)
		// Stream<T> peek(Consumer<? super T> action)
		// 최종연산(스트림을 소비x)
		// void forEach(Consumer<? super T> action)

		// peek()는 어디에 쓰는가?
		// -> 중간작업 결과를 확인할때
		// -> 디버깅의 용도

		File[] fileArr = { new File("Ex1.java"), 
				new File("Ex1.bak"), 
				new File("Ex2.java"), 
				new File("Ex1"),
				new File("Ex1.txt") };

		Stream<File> fileStream = Stream.of(fileArr);

		// map()으로 Stream<File>을 Stream<String>으로 변환
		Stream<String> filenameStream = fileStream.map(File::getName);
		filenameStream.forEach(System.out::println); // 모든 파일의 이름을 출력

		System.out.println("--------------");
		
		fileStream = Stream.of(fileArr); // 스트림을 다시 생성

		fileStream.map(File::getName) // Stream<File> → Stream<String>
				.filter(s -> s.indexOf('.') != -1) // 확장자가 없는 것은 제외
				.peek(s->System.out.printf("filename=%s%n", s))
				.map(s -> s.substring(s.indexOf('.') + 1)) // 확장자만 추출
				.peek(s->System.out.printf("extension=%s%n", s))
				.map(String::toUpperCase) // 모두 대문자로 변환
				.peek(s->System.out.printf("changeUpper=%s%n", s))
				.distinct() // 중복 제거
				.forEach(System.out::println); // JAVABAKTXT

		System.out.println();
	}

}

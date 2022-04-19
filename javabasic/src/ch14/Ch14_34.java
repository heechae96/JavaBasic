package ch14;

import java.util.*;
import java.util.stream.*;

public class Ch14_34 {

	public static void main(String[] args) {

		// 스트림의 중간연산(2)

		// 스트림의 스트림을 스트림으로 변환
		// -> flatMap()

		Stream<String[]> strArrStrm = 
				Stream.of(new String[] { "abc", "def", "jkl" },
				new String[] { "ABC", "GHI", "JKL" });

//		Stream<Stream<String>> strStrmStrm = strArrStrm.map(Arrays::stream);
		Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);

		strStrm.map(String::toLowerCase)	// 소문자로 바꾸기
		.distinct()							// 중복제거
		.sorted()							// 정렬
		.forEach(System.out::println);		// 출력
		
		System.out.println();

		String[] lineArr = { "Believe or not It is true", 
				"Do or do not There is no try" };

		Stream<String> lineStream = Arrays.stream(lineArr);
		
		lineStream.flatMap(line -> Stream.of(line.split(" +")))	// 하나 이상의 공백
		.map(String::toLowerCase)
		.distinct()
		.sorted()
		.forEach(System.out::println);
		
		System.out.println();
	}

}

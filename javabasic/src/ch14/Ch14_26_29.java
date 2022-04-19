package ch14;

import java.util.*;
import java.util.stream.*;

public class Ch14_26_29 {

	public static void main(String[] args) {

		// 스트림의 중간연산

		// 스트림 자르기
		// -> skip(), limit()
		// Stream<T> skip(long n) // 앞에서부터 n개 건너뛰기
		// Stream<T> limit(long maxSize) // maxSize 이후의 요소는 잘라냄

		// 스트림의 요소 걸러내기
		// -> filter(), distinct()
		// Stream<T> filter(Predicate predicate) // 조건에 맞지 않는 요소 제거
		// Stream<T> distinct() // 중복제거

		// 스트림의 정렬하기
		// -> sorted()
		// Stream<T> sorted() // 스트림 요소의 기본 정렬(Comparable)로 정렬
		// Stream<T> sorted(Comparator comparator) // 지정된 Comparator로 정렬

		// Comparator의 comparing()으로 정렬 기준을 제공
		// -> comparing(Function<T, U> keyExtractor)
		// -> comparing(Function<T, U> keyExtractor, Comparator<U> keyComparator)
		// 추가 정렬 기준을 제공할 때는 thenComparing()을 사용
		// -> thenComparing(Comparator<T> other)
		// -> thenComparing(Function<T, U> keyExtractor)
		// -> thenComparing(Function<T, U> keyExtractor, Comparator<U> keyComp)

		Stream<Student> studentStream = Stream.of(
				new Student("이자바", 3, 300), 
				new Student("김자바", 1, 200),
				new Student("안자바", 2, 100), 
				new Student("박자바", 2, 150), 
				new Student("소자바", 1, 200),
				new Student("나자바", 3, 290), 
				new Student("감자바", 3, 180));

//		studentStream.sorted(Comparator.comparing(Student::getBan).reversed() // 반별 정렬
		studentStream.sorted(Comparator.comparing((Student s)->s.getBan()).reversed() // 반별 정렬
				.thenComparing(Comparator.naturalOrder()).reversed()) // 기본 정렬
				.forEach(System.out::println);
	}

}

class Student implements Comparable<Student> {
	String name;
	int ban;
	int totalScore;
	Student(String name, int ban, int totalScore) { 
		this.name =name;
		this.ban =ban;
		this.totalScore =totalScore;
	}

	public String toString() { 
	   return String.format("[%s, %d, %d]", name, ban, totalScore); 
	}

	String getName()     { return name;}
	int getBan()         { return ban;}
	int getTotalScore()  { return totalScore;}

   // 총점 내림차순을 기본 정렬로 한다.
	public int compareTo(Student s) { 
		return s.totalScore - this.totalScore;
		// 오름차순
//		return this.totalScore - s.totalScore;
	}
}

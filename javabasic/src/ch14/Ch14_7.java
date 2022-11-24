package ch14;

import java.util.function.*;
import java.util.*;

public class Ch14_7 {
	
	public static void main(String[] args) {
	
		// java.util.function패키지
		
		
		
		//	-> 자주 사용되는 다양한 함수형 인터페이스를 제공
		
		// java.lang.Runnable
		//	-> 매개변수도 없고, 반환값도 없음
		
		// Supplier<T>
		//	-> 공급자
		//	-> 매개변수는 없고, 반환값은 있음
		
		// Consumer<T>
		// 	-> 소비자
		//	-> Supplier와 반대로 매개변수만 있고, 반환값이 없음
		
		// Function<T,R>
		//	-> 일반적인 함수. 하나의 매개변수를 받아서 결과를 반환
		
		// Predicate<T>
		//	-> 조건식을 표현하는데 사용됨. 매개변수는 하나. 반환타입은 boolean
		
		
		
		//	-> 매개변수가 2개인 함수형 인터페이스
		
		// BiConsumer<T,U>
		//	-> 두개의 매개변수만 있고, 반환값이 없음
		
		// BiPredicate<T,U>
		//	-> 조건식을 표현하는데 사용됨.
		//	-> 매개변수는 둘, 반환값은 boolean
		
		// BiFunction<T,U,R>
		//	-> 두 개의 매개변수를 받아서 하나의 결과를 반환
		
		
		
		// -> 매개변수가 3개 이상이면 만들어서 사용!
		
		
		
		//	-> 매개변수의 타입과 반환타입이 일치하는 함수형 인터페이스
		
		// UnaryOperator<T>
		//	-> Function의 자손, Function과 달리 매개변수와 결과의 타입이 같다
		
		// BinaryOpertor<T>
		//	-> BiFunction의 자손, BiFunction과 달리 매개변수와 결과의 타입이 같다
		
		Supplier<Integer>  s = ()-> (int)(Math.random()*100)+1;
		Consumer<Integer>  c = i -> System.out.print(i+", "); 
		Predicate<Integer> p = i -> i%2==0; 
		Function<Integer, Integer> f = i -> i/10*10; // i의 일의자리를 없앤다
		
		List<Integer> list = new ArrayList<>();	
		makeRandomList(s, list);	// list를 랜덤값으로 채운다
		System.out.println(list);
		printEvenNum(p, c, list);	// 짝수를 출력
		List<Integer> newList = doSomething(f, list);
		System.out.println(newList);
	
	}
	
	static <T> List<T> doSomething(Function<T, T> f, List<T> list) {
		List<T> newList = new ArrayList<T>(list.size());

		for(T i : list) {
			newList.add(f.apply(i));	// 일의 자리를 없애서 새로운 list에 저장
		}	

		return newList;
	}

	static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
		System.out.print("[");
		for(T i : list) {
			if(p.test(i))	// 짝수인지 검사
				c.accept(i);	// 화면에 i 출력
		}	
		System.out.println("]");
	}

	static <T> void makeRandomList(Supplier<T> s, List<T> list) {
		for(int i=0;i<10;i++) {
			list.add(s.get());	// Supplier로 부터 1~100의 난수를 받아서 list에 추가
		}
	}
}

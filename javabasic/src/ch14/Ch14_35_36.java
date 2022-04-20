package ch14;

import java.util.Optional;

public class Ch14_35_36 {

	public static void main(String[] args) {

		// Optional
		//	-> 간접적으로 null 다루기
		//	private final T value
		//	-> 모든 타입 객체 저장 가능
		//	-> T타입 객체의 래퍼클래스
		//				-> Integer, Long, ...
		
		// 왜 필요한가?
		//	1. null을 직접 다루는것은 위험
		//	-> NullpointException발생
		//	2. null체크
		//	-> if문 필수
		//		-> 코드가 지저분해짐
		
		
		// null대신 빈 Optional<T>객체를 사용하자
		// 널로 초기화. 바람직하지 않음
//		Optional<String> optVal = null;
		// 빈 객체로 초기화
//		Optional<String> optVal = Optional.<String>empty();
//		Optional<String> optVal = Optional.empty();
		
		
		// Optional<T>객체 생성하기
		//	-> 다양한 방법
//		String str = "abc";
//		Optional<String> optval = Optional.of(str);
		// 두 줄 코드를 한 줄로!
//		Optional<String> optval = Optional.of("abc");
		// NullPointerException발생
//		Optional<String> optval1 = Optional.of(null);
		// OK
		Optional<String> optval2 = Optional.ofNullable(null);
		
		
		// Optional객체의 값 가져오기
		//	-> get(), orElse(), orElseGet(), orElseThrow()
		
		Optional<String> optVal = Optional.of("abc");
		// optVal에 저장된 값을 반환. null이면 예외발생
		String str1 = optVal.get();	
		// ★ optVal에 저장된 값이 null일때는, ""를 반환 ★
		String str2 = optVal.orElse("");	
		// ★ 람다식 사용가능 () -> new String() ★
		String str3 = optVal.orElseGet(String::new);
		// null이면 예외발생
		String str4 = optVal.orElseThrow(NullPointerException::new);
		
		// isPresent()
		//	-> Optional객체의 값이 null이면 false, 아니면 true를 반환
		
//		int[] arr = {};				// 0
		int[] arr = new int[0];		// 0
//		int[] arr = null;			// java.lang.NullPointerException		
		System.out.println("arr.length="+arr.length);
		
//		Optional<String> opt = null;	// ok. 하지만 바람직하지 못하다
//		Optional<String> opt = Optional.of("abc");
		Optional<String> opt = Optional.empty();
		System.out.println("opt="+opt);
//		System.out.println("opt.get()="+opt.get());	// 값이 없어서 예외 발생
		
		String str = "";
		
//		try {
//			str = opt.get();
//		} catch (Exception e) {
//			str = "";	// 예외가 발생하면 빈문자열("")로 초기화
//		}	// 예외발생	
		
		str = opt.orElse("Empty");	// Optional에 저장된 값이 null이면 "Empty"반환
//		str = opt.orElseGet(()->"Empty");	// Optional에 저장된 값이 null이면 "Empty"반환
//		str = opt.orElseGet(()->new String());	// 메소드 참조
//		str = opt.orElseGet(String::new);		// 람다식
		System.out.println("str="+str);
		
	}

}

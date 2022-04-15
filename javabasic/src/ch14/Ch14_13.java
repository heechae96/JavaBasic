package ch14;

import java.util.function.Function;

public class Ch14_13 {

	public static void main(String[] args) {

		// 메서드 참조
		//	-> 하나의 메서드만 호출하는 라다식은 '메서드 참조'로 간단히 할 수 있다
		//	-> 클래스이름::메서드이름
		
		// 메서드 참조 <-> 람다식 변환이 자유로워야 한다!
		
		// 종류 : static메서드 참조
		// 람다 : (x) -> ClassName.method(x)
		// 메서드 참조 : ClassName::method
		
		// 종류 : 인스턴스메서드 참조
		// 람다 : (obj, x) -> obj.method(x)
		// 메서드 참조 : ClassName::method
		
		// 이것은 거의 안쓴다!!
		// 종류 : 특정 객체 인스턴스 메서드 참조
		// 람다 : (x) -> obj.method(x)
		// 메서드 참조 : obj::method
		
		//		입력		출력
//		Function<String,Integer> f = (String s) -> Integer.parseInt(s);
//		Function<String,Integer> f = 클래스이름::메서드이름;
		Function<String,Integer> f = Integer::parseInt;		
		// 문자인지 숫자인지 확인을 위해 값을 더한다!
		System.out.println(f.apply("100")+200);
	}
}

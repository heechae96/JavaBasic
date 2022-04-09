package ch12;

public class Ch12_27_33 {

	public static void main(String[] args) {

		// 메타 애너테이션
		//	-> 애너테이션을 위한 애너테이션
		//	-> java.lang.annotation패키지에 포함
		
		// @Target
		//	-> 애너테이션을 정의할 때, 적용대상 지정에 사용
		
		// @Retention
		//	-> 애너테이션이 유지(retention)되는 기간을 지정하는데 사용
		//	-> 컴파일러에 의해 사용되는 애너테이션의 유지 정책은 SOURCE이다
		//	-> 실행시에 사용 가능한 애너테이션의 정책은 RUNTIME이다
		
		// @Documented, @Inherited
		//	-> javadoc으로 작성한 문서에 포함시키려면 @Documented를 붙인다
		//	-> 애너테이션을 자손 클래스에 상속하고자 할 때, @Inherited를 붙인다
		
		// @Repeatable
		//	-> 반복해서 붙일 수 있는 애너테이션을 정의할 때 사용
		//	-> @Repeatable이 붙은 애너테이션은 반복해서 붙일 수 있다
		//	-> @Repeatable인 애너테이션을 하나로 묶을 컨테이너 애너테이션도 정의해야 함
		
		
	}

}

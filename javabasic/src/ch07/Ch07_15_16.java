package ch07;

import static java.lang.Math.*;
import static java.lang.System.out;

public class Ch07_15_16 {

	public static void main(String[] args) {

		// import문 
		// 클래스를 사용할 때 패키지 이름을 생략할 수 있다
		// 컴파일러에게 클래스가 속한 패키지를 알려준다
		// java.lang패키지의 클래스는 import하지 않고도 사용할 수 있다
		// -> String, Object, System, Thread ...
		
		// 단축키 - command + shift + o
		
		// 선언방법
		//	-> import 패키지명.클래스명;
		//  -> import 패키지명.*;
		//		-> 모든 클래스 의미
		
		// 이름이 같은 클래스가 속한 두 패키지를 import할 때는 클래스 앞에 패키지명을 붙여야함
		
		// static import문
		// static멤버를 사용할 때 클래스 이름을 생략할 수 있게 해준다
		System.out.println(Math.random());
		out.println(random());
		
		System.out.println("Math.PI :"+Math.PI);
		out.println("Math.PI :"+PI);
	
		// 웬만하면 쓰지않고, 꼭 필요할때만 쓰는게 좋다!
		// 클래스를 명확히 하는게 좋음..
		
	}

}

package ch07;

public class Ch07_21 {

	public static void main(String[] args) {	
		
		// 접근제어자
		// private
		// -> 같은 클래스 내에서만 접근이 가능하다
		// default
		// -> 같은 패키지 내에서만 접근이 가능하다
		// protected
		// -> 같은 패키지 내에서, 그리고 다른 패키지의 자손클래스에서 접근이 가능하다
		// public
		// 접근 제한이 없다
		
		// 제어자		같은 클래스	같은 패키지	자손클래스		전체
		// public		O			O			O		O
		// protected	O			O			O
		// default		O			O	
		// private		O			
		
		// public > protected > default > private
		
		// class는 public과 (default) 선택가능
		// 멤버(변수, 메소드)에는 4가지 다 가능
		
		// 하나의 소스파일에는 public class가 1개만 있어야 한다! 

	}

}

package ch07;

public class Ch07_3 {
	
	public static void main(String[] args) {
		
		// 포함이란?
		// 클래스의 멤버로 참조변수를 선언하는것
		// 작은 단위의 클래스를 만들고, 이 들을 조합해서 클래스를 만든다
		 
		
		// Q. 1번과 2번의 차이는?
		// A. 구조적 차이
		// 저장공간이 3개인것은 동일하다
		// 1번 : c.x, c.y, c.r
		// 2번 : c.c.x, c.c.y, c.r
		// Circle c = new Circle();
		
		
		/* 1.
		 * class Circle{
		 * int x;
		 * int y;
		 * int r;
		 * }
		 */
		
		/* 2.
		 * class Circle{
		 * Point c = new Point();
		 * int r;
		 * }
		 */
		
		/*
		 * class Point{
		 * int x;
		 * int y;
		 * }
		 */
		
		
		// 클래스간의 관계 결정하기
		// 상속관계
		// -> ~은 ~이다.(is-a)
		// 포함관계
		// -> ~은 ~을 가지고 있다.(has-a)
		
		// 대부분 포함관계
		// -> 상속은 제약조건이 많다 
		
	}

}


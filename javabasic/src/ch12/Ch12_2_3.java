package ch12;

import java.util.ArrayList;

class Tv{}

class Audio{}

public class Ch12_2_3 {

	public static void main(String[] args) {

		// 타입 변수
		//	-> 클래스를 작성할 때, Object타입 대신 타입 변수(E)를 선언해서 사용
		//						일반클래스 -> 제네릭 클래스
		
		// 타입 변수에 대입하기
		//	-> 객체를 생성시, 타입 변수(E) 대신 실제 타입 (Tv)을 지정(대입)
		//	ArrayList<Tv> tvList = new ArrayList<Tv>();
		//	-> 타입 변수 대신 실제 타입이 지정되면, 형변환 생략가능
		
		// 기본적으로 참조변수에 대입한 타입과 생성자에 대입한 타입은 일치해야한다!
		ArrayList<Tv> list = new ArrayList<Tv>();
		list.add(new Tv());
//		list.add(new Audio());	// 불가능
		
//		Tv t = (Tv)list.get(0);	// 형변환 생략가능
		Tv t = (Tv)list.get(0);
		
	}

}

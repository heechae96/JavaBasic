package ch12;

import java.util.*;

class Product1 {}
class Tv1 extends Product1 {}
class Audio1 extends Product1 {}

public class Ch12_4_6 {

	public static void main(String[] args) {

		// 제네릭스 용어
		// Box<T>
		//	-> 제네릭 클래스. 'T의 Box' 또는 'T Box'라고 읽는다
		// T
		//	-> 타입 변수 또는 타입 매개변수.(T는 타입 문자)
		// Box
		//	-> 원시 타입(raw type)
		
		
		
		// 제네릭 타입과 다형성
		//	-> 참조 변수와 생성자의 대입된 타입은 일치해야 한다
		//	ArrayList<Tv> list = new ArrayList<Tv>();		// OK. 일치
		//	ArrayList<Product> list = new ArrayList<Tv>();	// 에러. 불일치
		
		// 	-> 제네릭 클래스간의 다형성은 성립(여전히 대입된 타입은 일치해야 한다)
		//	조상					자손
		//	List<Tv> list = new ArrayList<Tv>();		// OK. 다형성
		//	List<Product> list = new LinkedList<Tv>();	// OK. 다형성
		
		// 매개변수의 다형성도 성립
		// ArrayList<Product> list = new ArrayList<Product>();
		// list.add(new Product());
		// list.add(new Tv());
		// list.add(new Audio());
		// Product p = list.get(0);
		// Tv t = (Tv)list.get(1);	// 단, 형변환 필요!	매개변수의 타입이 다르므로
		
		
		ArrayList<Product1> productList = new ArrayList<Product1>();
		ArrayList<Tv1>      tvList = new ArrayList<Tv1>();
//  	ArrayList<Product1> tvList = new ArrayList<Tv1>(); // 에러.
// 		List<Tv1>           tvList = new ArrayList<Tv1>(); // OK. 다형성

		productList.add(new Tv1());		// public boolean add(Product1 e){
		productList.add(new Audio1());

		tvList.add(new Tv1());	// public boolean add(Tv1 e){
		tvList.add(new Tv1());
//		tvList.add(new Audio1());	// 에러

		printAll(productList);
//		printAll(tvList); // 컴파일 에러가 발생한다.
	}

	public static void printAll(ArrayList<Product1> list) {
		for (Product1 p : list)
			System.out.println(p);
	}
}

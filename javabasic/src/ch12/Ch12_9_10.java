package ch12;

import java.util.ArrayList;

class Fruit implements Eatable {
	public String toString() { return "Fruit";}
}

class Apple extends Fruit { public String toString() { return "Apple";}}
class Grape extends Fruit { public String toString() { return "Grape";}}
class Toy                 { public String toString() { return "Toy"  ;}}

interface Eatable {}

public class Ch12_9_10 {

	public static void main(String[] args) {

		// 제한된 제네릭 클래스
		// 	-> extends로 대입할 수 있는 타입을 제한
		//	-> 인터페이스인 경우에도 extends를 사용!
		//		-> implements 사용x
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
//		FruitBox<Grape> grapeBox = new FruitBox<Apple>(); // 에러. 타입 불일치
//		FruitBox<Toy>   toyBox   = new FruitBox<Toy>();   // 에러.

		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
//		appleBox.add(new Grape());  // 에러. Grape는 Apple의 자손이 아님
		grapeBox.add(new Grape());

		System.out.println("fruitBox-"+fruitBox);
		System.out.println("appleBox-"+appleBox);
		System.out.println("grapeBox-"+grapeBox);

	}

}

// Eatable은 인터페이스임에도 extends 사용! 	& : and
class FruitBox<T extends Fruit & Eatable> extends Box<T> {}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();		// item을 저장할 list
	void add(T item) { list.add(item);     }	// 박스에 item추가
	T get(int i)     { return list.get(i); }	// 박스에서 item을 꺼낼때
	int size()       { return list.size(); }
	public String toString() { return list.toString();}
}
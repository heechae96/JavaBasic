package ch12;

public class Ch12_15 {

	public static void main(String[] args) {

		// 제네릭 타입의 형변환
		//	-> 제네릭 타입과 원시 타입 간의 형변환은 바람직 하지 않다.(경고발생)
//		Box<Object> objbox = null;
//		Box box = (Box)objBox;		// OK. 제네릭 타입 -> 원시타입. 경고발생
//		objBox = (Box<Object>)box;	// OK. 원시 타입 -> 제네릭 타입. 경고발생
		
		// Box클래스는 Ch12_9_10참고!
		Box b = null;
		Box<String> bstr = null;
		
		b = (Box)bstr;			// Box<String> -> Box 가능. but 경고
		bstr = (Box<String>)b;	// Box -> Box<String> 가능. but 경고
		
//		Box<Object> objBox = null;
//		Box<String> strBox = null;
//		
//		objBox = (Box<Object>)strBox;	// 에러
//		strBox = (Box<String>)objBox;	// 에러
		
		//	-> 와일드 카드가 사용된 제네릭 타입으로는 형변환 가능
//		Box<? extends Object> wBox = new Box<String>();
		//							(Box<? extends Object>)생략된것
		
		// FruitBox<Apple> -> Fruit<? extends Fruit>
		FruitBox<? extends Fruit> fbox = (FruitBox<? extends Fruit>)new FruitBox<Fruit>();
		//									생략된것
		FruitBox<? extends Fruit> abox = new FruitBox<Apple>();	// 가능
		
		//  Fruit<? extends Fruit> -> FruitBox<Apple>
		FruitBox<Apple> appleBox = (FruitBox<Apple>)abox;	// 가능. 생략불가
		
		// 형변환 생략가능과 불가능한것을 외우려고 하지말자..
		//	-> 생략했는데 오류가 발생하면 형변환을 작성해주자!
		
	}

}

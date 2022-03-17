package ch07;

class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, brrrr~");
	}
	
	void stop() {
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car {	
	void water() {	
		System.out.println("water!!!");
	}
}

public class Ch07_25 {

	public static void main(String[] args) {

		// 참조변수의 형변환(2)		
		
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;	// car = (Car)fe;
//		car.water();
		fe2 = (FireEngine)car;	// 자손 <- 조상 	형변환 생략 불가!
		fe2.water();
		
		
		/*
		Car car = null;
		FireEngine fe = null;	// 실제 인스턴스가 무엇인지가 중요!
		
		FireEngine fe2 = (FireEngine)car;	//	 조상 -> 자손
		Car car2 = (Car)fe2;				// 	 자손 -> 조상
		
		// java.lang.NullPointerException 발생!
		//	-> 컴파일은 ok
		car2.drive();
		*/
		
		/*
		Car c = new Car();
		// java.lang.ClassCastException 발생!
		//	-> 컴파일은 ok
		FireEngine fe = (FireEngine)c;
		fe.water();
		*/
		
	}

}

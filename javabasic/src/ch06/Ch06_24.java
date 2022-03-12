package ch06;

public class Ch06_24 {

	public static void main(String[] args) {

		// 기본형 매개변수 
		// -> 변수의 값을 읽기만 할 수 있다(read only)
		
		// 참조형 매개변수
		// -> 변수의 값을 읽고 변경할 수 있다(read & write)
		// 		-> 객체의 주소로 접근해서 가능한것..
		
		Data2 d = new Data2();
		d.x = 10;
		System.out.println("main() : x = "+ d.x);
		
		change(d);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = "+ d.x);
		
		System.out.println("-----------------------");
		
		Data3 d1 = new Data3();
		d1.x = 10;
		
		Data3 d2 = copy(d1);
		System.out.println("d1.x ="+d1.x);
		System.out.println("d2.x ="+d2.x);
		
		
	}
	static void change(Data2 d) {
		d.x = 1000;
		System.out.println("change() : x = "+ d.x);
	}
	
	static Data3 copy(Data3 d) {
		Data3 tmp = new Data3();
		tmp.x = d.x;
		return tmp;
	}


}

class Data2 {
	int x;
}

class Data3 {
	int x;
}

/*
main() : x = 10
change() : x = 1000
After change(d.x)
main() : x = 10 
 */

/*
main() : x = 10
change() : x = 1000
After change(d.x)
main() : x = 1000
 */


package ch06;

public class Ch06_36_37 {

	public static void main(String[] args) {

		// 생성자 this()
		// 생성자에서 다른 생성자 호출할 때 사용
		//	-> 클래스이름()으로 접근하면 에러!
		// 다른 생성자 호출시 첫 줄에서만 사용가능
		
		// 둘 이 비슷하게 생겼지만 관련이 없다!
		
		// 참조변수 this
		// 인스턴스 자신을 가리키는 참조변수
		// 인스턴스 메서드(생성자 포함)에서 사용가능
		// 	-> 지역변수가 없으면 this를 생략해도 구분가능하므로 생략 가능!
		// 지역변수(lv)와 인스턴스 변수(iv)를 구별할 때 사용
		//	-> iv앞에 this
		
		
	}

}
class Car{
	String color;
	String gearType;
	int door;
	
	Car(){
		// 클래스 이름을 그대로 쓰면 안된다!
//		card("white","auto",4);
		this("white","auto",4);
	}
	
	Car(String c, String g, int d){
		color = c;
		gearType = g;
		door = d;
	}
	
	
	// 지역변수(lv)와 인스턴스 변수(iv)를 구별
//	Car(String color, String gearType, int door){
//		this.color = color;
//		this.gearType = gearType;
//		this.door = door;
//	}

}

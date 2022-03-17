package ch07;

class Product2 {
	int price;			
	int bonusPoint;	
	
	Product2(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}

	Product2() {} 
}

class Tv2 extends Product2 {
	Tv2() {  super(100);	 }

	public String toString() { return "Tv"; }
}

class Computer2 extends Product2 {
	Computer2() { super(200); }
	public String toString() { return "Computer"; }
}

class Audio2 extends Product2 {
	Audio2() { super(50); }
	public String toString() { return "Audio"; }
}

class Buyer2 {			  
	int money = 1000;	  
	int bonusPoint = 0; 
	Product2[] cart = new Product2[10];   
	int i =0;			  

	void buy(Product2 p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 구매할수 없습니다");
			return;
		}

		money -= p.price;             
		bonusPoint += p.bonusPoint;   
		cart[i++] = p;                
		System.out.println(p + "을 구매하였습니다");
	}

	void summary() {	              
		int sum = 0;                 
		String itemList ="";         
		
		
		for(int i=0; i<cart.length;i++) {
			if(cart[i]==null) break;
			sum += cart[i].price;
			itemList += cart[i] + ", ";
		}
		System.out.println("구입하신 물품의 총 금액은 " + sum + "만원입니다");
		System.out.println("구입하신 제품은 " + itemList + "입니다");
	}
}

public class Ch07_29_30 {

	public static void main(String[] args) {

		// 여러 종류의 객체를 배열로 다루기
		// 	-> 조상타입의 배열에 자손들의 객체를 담을 수 있다
		
		// 다형성 장점
		// 1. 다형적 매개변수
		// 2. 하나의 배열에 여러 종류 객체 저장
		
		// Vector클래스 
		//	-> 가변 배열 기능
		//	-> 모든 종류의 객체 저장 가능
		//  -> 공간을 알아서 잡아줘서 따로 설정하지 않아도 된다.
		//	-> 11장에서 자세히...
		
		Buyer2 b = new Buyer2();

		b.buy(new Tv2());
		b.buy(new Computer2());
		b.buy(new Audio2());
		b.summary();
		
	}

}

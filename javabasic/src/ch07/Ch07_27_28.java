package ch07;

class Product {
	int price;			
	int bonusPoint;	

	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);	
	}
}

class Tv extends Product {
	Tv() {	super(100);	}

	public String toString() { return "Tv"; }
}

class Computer extends Product {
	Computer() { super(200); }

	public String toString() { return "Computer"; }
}

class Buyer {	
	int money = 1000;	  
	int bonusPoint = 0; 

	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액부족");
			return;
		}

		money -= p.price;            
		bonusPoint += p.bonusPoint;  
//		System.out.println(p.toString() + "을 구매");
		System.out.println(p + "을 구매");
	}
}

public class Ch07_27_28 {

	public static void main(String[] args) {

		
		// 다형성
		// 1. Tv t = new SmartTv();
		// 2. 참조변수의 형변환
		//		-> 리모콘 바꾸기
		//			-> 사용가능한 멤버갯수 조절
		// 3. instanceof 연산자
		//		-> 형변환 가능여부 확인
		
		
		// 매개변수의 다형성
		// 참조형 매개변수는 메서드 호출시, 
		// 자신과 같은 타입 또는 자손타입의 인스턴스를 넘겨줄 수 있다
		
		// 상품이 추가될때 마다 오버로딩 해줘야 하는 문제가 생김
		/*
		void buy(Tv t) {
			money -= t.price;
			bonusPoint += t.bonusPoint;
		}
		void buy(Computer c) {
			money -= c.price;
			bonusPoint += c.bonusPoint;
		}
		void buy(Audio a) {
			money -= a.price;
			bonusPoint += a.bonusPoint;
		}
		*/
		
		// 조상타입을 직접 작성(다형성을 이용)
		/*
		void buy(Product p) {
			money -= p.price;
			bonusPoint += p.bonusPoint;
		}
		*/
		
		Buyer b = new Buyer();
		
		// b.buy(new Tv());
		Product p = new Tv();
		b.buy(p);
		b.buy(new Computer());
		
		System.out.println("현재 남은 돈은 "+b.money+"만원입니다");
		System.out.println("현재 보너스 점수는 "+b.bonusPoint+"점입니다.");
			
	}

}

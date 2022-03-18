package ch07;

abstract class Unit2{
	int x, y;
	abstract void move(int x, int y);
	void stop() {
		System.out.println("멈춤");
	}
}

interface Fightable{
	void move(int x, int y);	// public abstract 생략!
	void attack(Fightable f);
}

class Fighter extends Unit2 implements Fightable{
	// 오버라이딩 규칙 : 조상(public)보다 접근제어자가 범위가 좁으면 안된다!!
	//	-> 안쓰면 default이므로 오류 발생!
	public void move(int x, int y) {
		System.out.println("["+x+","+y+"]로 이동");
	}	
	public void attack(Fightable f) {
		System.out.println(f+"를 공격");
	}
	
	// 싸울 수 있는 상대를 반환
	Fightable getFightable() {
		Fightable f = new Fighter();	// Fighter를 생성해서 반환
		
		// ★★★반환타입이 Fightable일 경우, Fightable 인터페이스를 구현한 객체를 반환한다!★★★
		return f;				
	}
}

public class Ch07_38 {

	public static void main(String[] args) {
		
		Fighter f = new Fighter();
		Fightable f2 = f.getFightable();
		
		/*
//		Fighter f = new Fighter();
		Unit2 u = new Fighter();	
		Fightable f = new Fighter();
		
		u.move(100, 200);
//		u.attack(new Fighter());	// Unit2에는 attack()이 없어서 호출불가!
		u.stop();
		
		f.move(100, 200);
		f.attack(new Fighter());	
//		f.stop();					// Fightable에는 stop()이 없어서 호출불가!
		*/
		
		
		
		
		
		
		// 인터페이스를 이용한 다형성
		
		// 다형성
		//	-> 조상 참조변수로 자손 객체 접근
		
		// 인터페이스도 구현 클래스의 부모?
		//	-> yes!
		
		/*
		class Fighter extends Unit implements Fightable{
			public void move(int x, int y) {}
			public void attack(Fightable f) {}
		}
		*/
		
		// 	unit	Fightable
		//	^			^
		//  |			|
		//  	Fighter
		
		// 인터페이스를 통해서 다중 상속 문제(충돌)을 해결!
		
		// Unit u = new Fighter();
		// Fightable f = new Fighter();
		
		// ★★★인터페이스 타입 매개변수는 인터페이스 구현한 클래스의 객체만 가능★★★
		/*
		interface Fightable{
			void move(int x, int y);
			void attack(Fightable f);
		}
		*/
		
		// 인터페이스를 메서드의 리턴타입으로 지정할 수 있다
		//	-> Fightable 인터페이스를 구현한 클래스의 인스턴스를 반환
		//		-> 아래는 형변환을 통해서 반환!
		/*
		Fightable method() {
			Fighter f = new Fighter();
			return f;
			// return new Fighter();
		}
		
		class Fighter extends Unit implements Fightable{
			public void move(int x, int y) {}
			public void attack(Fightable f) {}
		}
		*/
		
	}
}

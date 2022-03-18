package ch07;

public class Ch07_35_37 {

	public static void main(String[] args) {

		// 인터페이스
		//	-> 추상 메서드의 집합
		//	-> 구현된 것이 전혀 없는 설계도. 껍데기(모든 멤버가 public)
		// 		-> 메서드를 이용한 iv접근(캡슐화 관련)
		
		// 추상클래스와 인터페이스의 차이는?
		//-> iv를 가질 수 있는가 없는가
		// 추상클래스는 일반 클래스인데(iv, 생성자 포함) 추상메서드를 가지고 있고, 
		// 인터페이스는 추상 메서드만 가지고 있다.(iv를 가질 수 없다)
		//	-> 변수로 상수만을 가질 수 있음(public static final)
		
		// 공통점은?
		//	-> 추상 메서드를 가지고 있다(미완성 설계도)
		
		// 인터페이스 설정시
		// 상수 선언은 public static final 키워드 생략 가능
		// 추상 메서드 선언은 public abstract 키워드 생략 가능
		
		// 인터페이스의 조상은 인터페이스만 가능!
		// 	-> Object가 최고 조상이 아님!
		
		// 다중상속이 가능!
		// 	-> 추상메서드의 집합이므로..
		//		-> 구현부x
		//			-> 메서드 충돌 문제가 없다!
		//			-> 선언부는 같은데 구현부가 다른경우 충돌 발생!
		// ex) interface Fightable extends Movable, Attackable{	}
		
		// 인터페이스의 구현
		//	-> 인터페이스에 정의된 추상 메서드를 완성하는것
		//		-> 인터페이스의 구현
		// extends라는 키워드 말고 implement키워드 사용!
		// ex) class Fighter implements Fightable{	}
		//	-> Fighter클래스는 Fightable 인터페이스를 구현했다!
		// 일부만 구현하는 경우, 클래스 앞에 abstract 붙여야 함
		
		
		
		
		
	}

}

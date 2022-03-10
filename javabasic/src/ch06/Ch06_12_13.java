package ch06;

public class Ch06_12_13 {

	public static void main(String[] args) {

		// 클래스변수 인스턴스변수
		
		// ex) 카드 객체
		
		// 인스턴스 변수(iv)
		// -> 개별 속성
		// ex) 무늬, 숫자
	
		// 클래스 변수(cv)
		// -> 공통 속성
		// ex) 폭, 높이
		
		// iv는 객체마다 1개씩 생성
		// cv는 다른 공간에 1개만 만들어진다
		
		// cv접근
		// 참조변수명.속성명 (반만 정답)
		// 클래스명.속성명 (정답)
		
		System.out.println("Card.width = "+Card.width);
		System.out.println("Card.height = "+Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 "+c1.kind+", "+c1.number+"이며, 크기는"+c1.width+", "+c1.height);
		System.out.println("c2은 "+c2.kind+", "+c2.number+"이며, 크기는"+c2.width+", "+c2.height);
		                                                                     
		System.out.println("c1의 width와 height를 각 각 50,80으로 변경");    
		Card.width = 50;                                                     
		Card.height = 80;                                                    
	                                                                         
		System.out.println("c1은 "+c1.kind+", "+c1.number+"이며, 크기는"+c1.width+", "+c1.height);
		System.out.println("c2은 "+c2.kind+", "+c2.number+"이며, 크기는"+c2.width+", "+c2.height);
		

	}

}

class Card{
	String kind;
	int number;
	
	static int width = 100;
	static int height = 250;
}


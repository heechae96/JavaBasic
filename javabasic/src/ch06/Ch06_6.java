package ch06;

public class Ch06_6 {

	public static void main(String[] args) {

		// 객체의 생성과 사용
		
		// 객체의 생성
		// 클래스명 변수명;
		// 변수명 = new 클래스명();
		// -> 클래스명 변수명 = new 클래스명();
		// Tv t = new Tv();
		
		// 객체의 사용
		// t.channel = 7;
		// t.channelDown();
		
		// 1. 클래스 작성(설계도)
		// 2. 객체의 생성(제품)
		// 3. 객체의 사용(변수, 메소드)
		//					-> 메소드 호출!
		
		// 참조변수(주소값을 저장)를 리모콘으로 설명
		// 실생활과 다르게 리모콘이 없으면 사용이 불가함
		
		// Tv t1 = new Tv();
		// Tv t2 = new Tv();
		// t1.channel = 7;
		// t2 = t1
		// -> t1의 주소를 t2에 대입
		// -> 기존에 쓰이던 t2객체는 더이상 사용불가
		//							-> garbage collector에 의해 메모리가 정리된다
		
		// 하나의 인스턴스를 여러 개의 참조변수가 가리기는 경우 가능!
		// 여러 인스턴스를 하나의 참조변수가 가리키는 경우 불가능!
		//							-> 결국 변수. 하나의 값만 저장가능!
		
		
		Tv t;
		t = new Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println("현재 채널은 "+t.channel+"입니다");
	}

}

class Tv{
	// Tv의 속성(멤버변수)
	String color;
	boolean power;
	int channel;
	
	// Tv의 기능(메서드)
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}	
}

package ch07;

public class Ch07_31_32 {

	public static void main(String[] args) {

		// 추상클래스(abstract class)
		// -> 미완성 설계도. 미완성 메서드를 갖고 있는 클래스
		//	-> 몸통{} (구현부)이 없는 미완성 메서드
		//		-> 추상메서드를 가지고 있으면 추상클래스
		
		// -> 클래스와 메서드 앞에 abstract키워드 필요
		
		// -> 다른 클래스 작성에 도움을 주기 위한 것
		//	-> 인스턴스 생성 불가
		
		// -> 상속을 통해 추상메서드를 완성해야 인스턴스 생성가능
		//	-> 구현을 의미
		
		// Q. 언제 사용하는가?
		// A. 꼭 필요하지만 자손마다 다르게 구현될 것으로 예상되는 경우
		
//		Player p = new Player();	// 추상클래스라 객체 생성 불가
		AudioPlayer ap = new AudioPlayer();
		ap.play(100);
		ap.stop();
		
		// 다형성의 특징때문에 가능하다!
		// -> 상속으로 기능이 만들어진 상태에서 리모콘으로 조작!
		Player p = new AudioPlayer();
		p.play(200);
		p.stop();
	}

}
abstract class Player{
	abstract void play(int pos);
	abstract void stop();
}

/*
// 주의! Player클래스 중 하나의 메소드만 완성시켰음
//	-> 하나는 미완성이므로 class앞에 abstract을 꼭 써야함!
abstract class AbstactPlayer extends Player{
	void play(int pos) {
		// 내용생략
	}
}
*/

class AudioPlayer extends Player{
	void play(int pos){
		System.out.println(pos+"위치부터 play합니다");
	}
	void stop() {
		System.out.println("재생을 멈춥니다");
	}
}

package ch13;

public class Ch13_16_17 {

	public static void main(String[] args) {
		
		// 쓰레드 그룹
		//	-> 서로 관련된 쓰레드를 그룹으로 묶어서 다루기 위한 것
		//	-> 모든 쓰레드는 반드시 하나의 쓰레드 그룹에 포함되어 있어야 한다
		//	-> 쓰레드 그룹을 지정하지 않고 생성한 쓰레드는 'main쓰레드 그룹'에 속한다
		//		-> main쓰레드는 main쓰레드 그룹에 속한다
		//	-> 자신을 생성한 쓰레드(부모 쓰레드)의 그룹과 우선순위를 상속받는다
		
		// 쓰레드 자신이 속한 쓰레드 그룹을 반환
		//	-> ThreadGroup getThreadGroup()
		
		// 관련 메소드 사진참고!
		
	}
}

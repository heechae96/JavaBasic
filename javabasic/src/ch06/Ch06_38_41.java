package ch06;

public class Ch06_38_41 {

	public static void main(String[] args) {

		// 변수의 초기화
		// 지역변수(lv)는 수동 초기화 해야함(사용전에 반드시!)
		// 멤버변수(iv, cv)는 자동 초기화된다
		/*
		 	char	'\u0000'
			byte, short, int	0
			long	0L
			float	0.0F
			double	0.0 또는 0.0D
			boolean	false
			배열, 인스턴스 등	null
		 */
		
		
		
		// 멤버변수의 초기화
		
		// 1. 명시적 초기화(=)
		// 기본형 변수의 초기화
		// -> int num = 1;
		// 참조형 변수의 초기화
		// -> Engine e = new Engine();
		
		// 2. 초기화 블럭
		// iv의 경우
		// -> 인스턴스 초기화 블럭 : {	}
		//		-> 잘 사용하지 않음
		// cv의 경우
		// -> 클래스 초기화 블럭 : static {	}
		
		// 3. 생성자
		// iv초기화
		// [복잡한 초기화]
		
		// 클래스 변수 초기화 시점
		// -> 클래스가 처음 로딩될 때 한번
		// 인스턴스 변수 초기화 시점 
		// -> 인스턴스가 생성될 때 마다
		
		// 초기화 순서
		// cv먼저 iv이후에
		// 자동초기화(0) -> 간단 초기화(=) -> 복잡(static{}, 생성자}
		
		
	}

}
class StaticBlockTest{
	static int[] arr = new int[10];	// 명시적 초기화
	
	// cv의 복잡초기화
	static {	// 클래스 초기화 블럭 - 배열 arr을 난수로 채운다
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10)+1;
		}
	}
}
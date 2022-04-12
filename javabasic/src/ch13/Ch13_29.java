package ch13;

public class Ch13_29 {

	public static void main(String[] args) {

		// yield()
		//	-> 남은시간을 다음 쓰레드에게 양보하고, 자신(현재 쓰레드)은 실행대기한다
		//	-> static메서드. 다른 쓰레드에게 양보하라고 못 함
		//	-> yield()와 interrupt()를 적절히 사용하면, 응답성과 효율을 높일 수 있다
		//		-> 혹여나 자고 있을 경우를 생각해서, 바로 동작 할 수 있도록 함!
		// 	-> yield()는 OS스케쥴러에 의해 제어되므로 반드시 동작한다고 장담할 수 없다.
		// 		-> 그렇지만 쓰는 편이 효율이 좋은 편.
		
		// cf. 
		// -> busy-waiting : 하는 일 없이 반복문 돌고 있을 경우
	}

}

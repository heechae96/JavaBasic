package ch08;

public class Ch08_18 {

	public static void main(String[] args) {

		// 연결된 예외(chained exception)
		// 한 예외가 다른 예외를 발생시킬 수 있다
		// 예외 A가 예외 B를 발생시키면, A는 B의 원인 예외(cause exception)
		//							-> B가 발생한 원인은 A
		
		// Throwable inintCause(Throwable cause)	// 지정한 예외를 원인 예외로 등록
		//	예외(Exception)	메서드	예외 A
		// Throwable getCause()	// 원인 예외를 반환
		
		// 이유1
		//	-> 여러 예외를 하나로 묶어서 다루기 위해서
		//		-> 묶지 않는 경우 catch문을 여러개 작성해야하는 번거로움..
		
		// 이유2
		// checked예외를 unchecked예외로 변경하려 할 때
		//	-> unchecked로 변경하면 예외처리를 할 필요가 없어진다!
		//	Exception자손(필수처리)	/ RuntimeException자손(선택처리)
		//	-> 예외 선언 Exception 자손만 한다!
		//		-> RuntimeException은 예외 선언 안하는게 보통!
		
		
		
		
	}

}

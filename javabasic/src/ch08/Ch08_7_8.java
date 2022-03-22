package ch08;

public class Ch08_7_8 {

	public static void main(String[] args) {

		// printStackTrace()
		//	-> 예외발생 당시의 호출스택(Call Stack)에 있었던 메소드의 정보와
		//		예외 메시지를 화면에 출력한다
		
		// getMessage()
		//	-> 발생한 예외클래스의 인스턴스에 저장된 메시지를 얻을 수 있다
		
		// 예외가 발생하면, 예외 객체가 생김!
		// 	-> 일치하는 catch문의 참조변수에 생긴 예외 객체 주소를 대입!
		
		
		
		// 멀티 catch블럭
		//	-> 내용이 같은 catch블럭을 하나로 합친 것
		
		// '|' : 비트 연산자 논리식 or
		
		// 주의
		// ExceptionA와 B가 조상-자손 관계일 경우, 조상만 써주면 됨.
		// 멀티 catch 블럭 사용할 경우, 참조변수로는 두 예외 클래스의 공통 멤버만 사용 가능.
		//	-> ExceptionA가 들어올지 B가 들어올지 알 수 없다
		
		/*
		try {
			//...
		}catch(ExceptionA e) {
			e.printStackTrace();
		}catch(ExceptioB e2) {
			e2.printStackTrace();
		}
		
		try {
			//...
		}catch(ExceptionA | ExceptionB e) {
			e.printStackTrace();
		}
		*/
		
	}

}

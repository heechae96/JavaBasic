package ch07;

class Time{
	private int hour;
	private int minute;
	private int second;
	
	// opt + command + m : Extract Method
	public void setHour(int hour) {
		if(isNotValidHour(hour)) {
			return;
		}
		this.hour = hour;
	}

	// 매개변수로 넘겨진 hour가 유효한지 확인해서 알려주는 메소드
	// public으로 하면 나중에 전체 패키지를 확인하면서 오류를 찾아야함..
	//	-> 처음에 private으로 설정하면 오류테스트가 훨씬 간편한다!
	private boolean isNotValidHour(int hour) {
		return hour < 0 || hour > 23;
	}
	
	public int getHour() {
		return hour;
	}
}

public class Ch07_22 {

	public static void main(String[] args) {	
		
		// 캡술화와 접근 제어자
		// 접근제어자를 사용하는 이유
		//	-> 외부로부터 데이터를 보호하기 위해서
		// 	-> 외부에는 불필요한, 내부적으로만 사용되는 부분을 감추기 위해
		// 		-> 외부접근을 막는다. 메서드를 통해서 간접접근을 허용
		
		Time t = new Time();
		t.setHour(21);
		System.out.println(t.getHour());
		t.setHour(100);
		System.out.println(t.getHour());
		

	}

}

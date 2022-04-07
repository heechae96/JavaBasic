package ch12;

enum Direction2 { 
	// 하나의 생성자임!
	EAST(1, ">"), SOUTH(2,"V"), WEST(3, "<"), NORTH(4,"^");

	private static final Direction2[] DIR_ARR = Direction2.values();
	private final int value;
	private final String symbol;

	Direction2(int value, String symbol) { // 접근 제어자 private이 생략됨
		this.value  = value;
		this.symbol = symbol;
	}

	public int getValue()     { return value;  }
	public String getSymbol() { return symbol; }

	public static Direction2 of(int dir) {
        if (dir < 1 || dir > 4) // 범위가 벗어나는 경우 예외발생!
            throw new IllegalArgumentException("Invalid value :" + dir);

        return DIR_ARR[dir - 1];
	}	

	// 방향을 회전시키는 메서드. num의 값만큼 90도씩 시계방향으로 회전한다.
	public Direction2 rotate(int num) {
		num = num % 4;

		if(num < 0) num +=4; // num이 음수일 때는 시계반대 방향으로 회전 

		return DIR_ARR[(value-1+num) % 4];
	}

	public String toString() {
		return name()+" "+getSymbol();
	}
	
} // enum Direction2

public class Ch12_21_22 {

	public static void main(String[] args) {

		// 열거형에 멤버 추가하기
		//	-> 불연속적인 열거형 상수의 경우, 원하는 값을 괄호()안에 적는다
		// 		enum Direction {EAST(1), SOUTH(5), WEST(-1), NORTH(10)}
		//					인덱스(순서)  0	2		3			4
		//		-> 괄호()를 사용하려면, 인스턴스 변수와 생성자를 새로 추가해 줘야 한다
		//		-> 열거형의 생성자는 묵시적으로 private이므로, 외부에서 객체생성 불가
		
		for(Direction2 d : Direction2.values()) 
			System.out.printf("%s=%d (ord%d)%n", d.name(), d.getValue(), d.ordinal()); 

		Direction2 d1 = Direction2.EAST;
		Direction2 d2 = Direction2.of(1);

		System.out.printf("d1=%s, %d, %d%n", d1.name(), d1.getValue(), d1.ordinal());
		System.out.printf("d2=%s, %d, %d%n", d2.name(), d2.getValue(), d2.ordinal());
		System.out.println(Direction2.EAST.rotate(1));
		System.out.println(Direction2.EAST.rotate(2));
		System.out.println(Direction2.EAST.rotate(-1));
		System.out.println(Direction2.EAST.rotate(-2));
	}

}

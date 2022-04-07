package ch12;

// 열거형 상수에 다른값을 부여할수도 있다..
//	-> 디폴트는 0, 1, 2, ...
//				0	   1		2	    3
enum Direction { EAST, SOUTH, WEST, NORTH }

public class Ch12_17_20 {

	public static void main(String[] args) {

		// 열거형(enum)
		//	-> 관련된 상수들을 같이 묶어 놓은 것.
		//		Java는 타입에 안전한 열거형을 제공
		//				-> 값&타입 체크
		
		// 열거형의 정의와 사용
		//	-> 열거형을 정의하는 방법
		//		-> enum 열거형이름 {상수명1, 상수명2, ...}
		//		-> enum Direction {EAST, SOUTH, WEST, NORTH}
		//						인덱스 0, 1, 2 , ... 
		
		//	-> 열거형 타입의 변수를 선언하고 사용하는 방법
		//		-> class Unit{
		//				int x, y;		// 유닛의 위치
		//				Direction dir;	// 열거형 인스턴스 변수를 선언
		//
		//				void init(){
		//					dir = Directoin.East;	// 유닛의 방향을 EAST로 초기화
		//				}
		
		//	-> 열거형 상수의 비교에 ==와 compareTo()사용가능
		//	if(dir == Direction.EAST){	// true
		//		x++;
		//	} else if(dir > Direction.WEST){	// 에러. 열거형 상수에 비교연산자 불가!
		//		...
		//	} else if (dir.compareTo(Direction.WEST) > 0) {	// compareTo()는 가능!
		//		// 같으면 0, 오른쪽이 크면 음수, 왼쪽이 크면 양수
		//		...
		//	}
		
		// 열거형의 조상
		//	-> java.lang.Enum
		//		-> 모든 열거형은 Enum의 자손이며, 아래의 메서드를 상속받는다.
		//		class<E> getDeclaringClass() : 열거형의 Class객체를 반환
		//		String name() : 열거형 상수의 이름을 문자열로 반환
		//		int ordinal() : 열거형 상수가 정의된 순서를 반환(0부터 시작)
		//		T valueOf(class<T> enumType, String name) : 지정된 열거형에서 name과
		//													일치하는 열거형 상수를 반환
		//	-> values(), valueOf()는 컴파일러가 자동으로 추가
		
		
		
		Direction d1 = Direction.EAST;	// 열거형타입.상수이름	// 가장 많이 사용
		Direction d2 = Direction.valueOf("WEST");
		Direction d3 = Enum.valueOf(Direction.class, "EAST");

		System.out.println("d1="+d1);
		System.out.println("d2="+d2);
		System.out.println("d3="+d3);

		System.out.println("d1==d2 ? "+ (d1==d2));
		System.out.println("d1==d3 ? "+ (d1==d3));
		System.out.println("d1.equals(d3) ? "+ d1.equals(d3));
//		System.out.println("d2 > d3 ? "+ (d1 > d3)); // 객체라 비교연산자라 불가!
		System.out.println("d1.compareTo(d3) ? "+ (d1.compareTo(d3)));
		System.out.println("d1.compareTo(d2) ? "+ (d1.compareTo(d2)));

		switch(d1) {
			case EAST: // Direction.EAST라 쓸 수 없다.
				System.out.println("The direction is EAST."); break;
			case SOUTH:
				System.out.println("The direction is SOUTH."); break;
			case WEST:
				System.out.println("The direction is WEST."); break;
			case NORTH:
				System.out.println("The direction is NORTH."); break;
			default:
				System.out.println("Invalid direction."); break;
		}

		Direction[] dArr = Direction.values();	// 열거형의 모든 상수를 배열로 반환

		for(Direction d : dArr)  // for(Direction d : Direction.values()) 
			System.out.printf("%s=%d%n", d.name(), d.ordinal()); 
			//										-> 순서! 
			//								열거형 상수를 따로 부여하면 순서랑 값이 다름
			//								-> 디폴트는 0,1,2,.. 이므로 순서와 같음
	}
	

}

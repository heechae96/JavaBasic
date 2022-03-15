package ch07;

public class Ch07_7_9 {

	public static void main(String[] args) {

		// 오버라이딩
		// -> 메서드 오버라이딩
		// 상속받은 조상의 메서드를 자신에 맞게 변경하는것
		
		
//		MyPoint3D p = new MyPoint3D();
//		p.x = 3;
//		p.y = 5;
//		p.z = 7;
//		System.out.println(p.getLocation());
		
		Point p = new Point(3,5);
//		p.x = 3;
//		p.y = 5;
//		System.out.println(p.toString());
		System.out.println(p);
		
		
		// 오버라이딩의 조건
		// 1. 선언부가 조상 클래스의 메서드와 일치해야한다.
		// 		-> 반환타입, 메서드이름, 매개변수 목록
		// 2. 접근 제어자를 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다
		//		-> public, protected, [default], private
		// 			-> 뒤에서 자세히 배운다
		// 3. 예외는 조상 클래스의 메서드보다 많이 선언할 수 없다
		//		-> 8장에서 자세히...
		
		
		// 오버로딩 vs 오버라이딩
		// 오버로딩 : 기존에 없는 새로운 메서드를 정의하는것(new)
		//			-> 단, 이름이 같을 뿐
		//			-> 상속과 관계가 없다
		// 오버라이딩 : 상속받은 메서드의 내용을 변경하는것 (change, modify)
	}

}
class Point{	// 컴파일러가 자동으로 Obj클래스 상속..
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
//	String getLocation() {
//		return "x:"+x+", y:"+y;
//	}
	
	// Object클래스의 toString()을 오버라이딩
	// -> 원래 toString에 public이 붙어있어서..
	public String toString() {
		return "x:"+x+", y:"+y;
	}
}

//class MyPoint3D extends Point{
//	int z;
//	
//	// 조상의 메서드를 오버라이딩
//	String getLocation() {
//		return "x:"+x+", y:"+y+", z:"+z;
//	}
//}


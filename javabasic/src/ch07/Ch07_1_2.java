package ch07;

public class Ch07_1_2 {
	
	public static void main(String[] args) {
		
		// 상속
		// 기존의 클래스로 새로운 클래스를 작성하는것(코드의 재사용)
		// 두 클래스를 부모와 자식으로 관계를 맺어주는 것
		
		// class 자식클래스 extends 부모클래스{
		//	// ...
		// }
		
		// Parent
		// 	 ^
		//   |
		// Child
		
		// 자손은 조상의 모든 멤버를 상속받는다(생성자, 초기화 블럭 제외)
		//		-> 부모의 부모도 상속 가능하므로..
		// 자손의 멤버 개수는 조상보다 적을 수 없다(같거나 많다)
		// 자손의 변경은 조상에 영향을 미치지 않는다
		
		Point3D p = new Point3D();
		System.out.println("p.x :"+p.x);
		System.out.println("p.y :"+p.y);
		System.out.println("p.z :"+p.z);
	}

}

class Point2D{
	int x, y;
}

class Point3D extends Point2D{
	int z;
}

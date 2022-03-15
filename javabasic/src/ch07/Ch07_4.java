package ch07;

class MyPoint{
	int x;
	int y;
}

//class Circle extends MyPoint{
//	int r;
//}

class Circle{
	MyPoint p = new MyPoint();
	int r;
}

public class Ch07_4 {
	
	public static void main(String[] args) {
		
		Circle c = new Circle();
//		c.x = 1;
//		c.y = 2;
//		c.r = 3;
//		System.out.println("c.x: "+c.x);
//		System.out.println("c.y: "+c.y);
//		System.out.println("c.r: "+c.r);

		c.p.x = 1;
		c.p.y = 2;
		c.r = 3;
		System.out.println("c.p.x: "+c.p.x);
		System.out.println("c.p.y: "+c.p.y);
		System.out.println("c.r: "+c.r);
		
	}

}

// 상속의 경우
// c.x: 1
// c.y: 2
// c.r: 3

// 포함의 관계
// c.p.x: 1
// c.p.y: 2
// c.r: 3

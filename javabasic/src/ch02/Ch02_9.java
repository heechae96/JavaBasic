package ch02;

public class Ch02_9 {

	public static void main(String[] args) {
		
		// 두 변수의 값 교환하기 
		int x = 4 , y = 2;
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		// 임시로 변수를 하나 생성 
		int tmp;
		
		tmp = x;
		x = y;
		y = tmp; 

		System.out.println("x="+x);
		System.out.println("y="+y);
	}

}

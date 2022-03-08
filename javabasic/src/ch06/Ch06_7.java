package ch06;

public class Ch06_7 {

	public static void main(String[] args) {

		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 채널은 "+t1.channel+"입니다");
		System.out.println("t2의 채널은 "+t2.channel+"입니다");
		
		t1.channel = 7;
		System.out.println("t1의 채널값을 7로 변경");
		
		System.out.println("t1의 채널은 "+t1.channel+"입니다");
		System.out.println("t2의 채널은 "+t2.channel+"입니다");		
		
		// 참조변수 t1의 값을 t2에 저장
		// t2객체는 가비지 컬렉터에 의해 제거!
		t2 = t1;
		System.out.println("t1의 채널은 "+t1.channel+"입니다");
		System.out.println("t2의 채널은 "+t2.channel+"입니다");		
		
		
	}

}


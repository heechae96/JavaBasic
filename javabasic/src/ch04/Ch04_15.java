package ch04;

public class Ch04_15 {

	public static void main(String[] args) {

		// 중첩 for문
		// for문 내에 또 다른 for문을 포함
		// ex) 구구단
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println("==================");
		}
	}

}

package ch02;

// 1. import문 추가 
import java.util.*;

public class Ch02_14 {

	public static void main(String[] args) {
		
		// 화면으로부터 입력받기
		// Scanner
		// 화면으로부터 데이터를 입력받는 기능을 제공하는 클래스!
		
		// 1. import문 추가 필요
		// import java.util.*;
		
		// 2. Scanner객체의 생성
		// Scanner scanner = new Scanner(System.in);
		//								-> 화면입력
		
		// 3. Scanner객체를 사용
		// int num = scanner.nextInt();		화면에서 입력받은 정수를 num에 저장
		// String input = scanner.nextLine();	입력받은 내용을 저장
		// int num = Integer.parseInt(input);	문자열을 숫자로 변

		
		// 2. Scanner객체 생성 
		Scanner scanner = new Scanner(System.in);
		
		// 3. Scanner객체 사용
//		int num = scanner.nextInt();
//		int num2 = scanner.nextInt();
//		System.out.println(num);
//		System.out.println(num2);
		
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		System.out.println(num);
				
		
	}

}

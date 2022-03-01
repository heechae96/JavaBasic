package ch03;

public class Ch03_11_12 {

	public static void main(String[] args) {

		// 반올림 Math.round()
		// 실수를 소수점 첫 째자리에서 반올림한 정수를 반환
		System.out.println(Math.round(4.52));
		
		// 소수점 n자리에서 반올림하고 싶은 경우?
		double pi = 3.141592;
		System.out.println(pi);
		System.out.println(pi*1000);
		System.out.println(Math.round(pi*1000)/1000);
		System.out.println(Math.round(pi*1000)/1000.0);
		// 3.142
		
		// 3.141을 얻고싶으면?
		// 형변환을 통해 값손실을 내자
		System.out.println(pi*1000);
		System.out.println((int)(pi*1000));
		System.out.println((int)(pi*1000)/1000.0);
		
		// 나머지 연산자
		// %
		// 오른쪽 피연산자로 나누고 남은 나머지를 반환
		// 몫이 아닌 나머지!
		System.out.println(10 % 8);
		// 오른쪽 피연산자가 음수이면 -부호는 무시된다
		//	->양수와 같은 결과가 나온다!
		System.out.println(10 % -8);
	}

}

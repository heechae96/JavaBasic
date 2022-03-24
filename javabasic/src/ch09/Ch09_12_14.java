package ch09;

public class Ch09_12_14 {

	public static void main(String[] args) {

		// join()과 StringJoiner
		
		// join()은 여러 문자열 사이에 구분자를 넣어서 결합한다
		String animals = "dog,cat,bear";
		String[] arr = animals.split(",");
		String str = String.join("-", arr);
		System.out.println(str);	// dog-cat-bear
		
		

		// 문자열과 기본형 간의 변환
		int i = 100;
		String str1 = i + "";				// 간단하고 편리
		String str2 = String.valueOf(i);	// 속도가 빠름
		System.out.println(str1);
		System.out.println(str2);
		
		// 문자열을 숫자로 바꾸는 방법
		// 기본형(오토박싱 때문에 가능! 뒤에서 배울것...)
		int i1 = Integer.parseInt("100");	// old방법	// 각 변환 메소드명이 다름
		int i2 = Integer.valueOf("100");	// new방법	// 모든 변환형이 valueOf
		// 참조형
		Integer i3 = Integer.valueOf("100");
		
		System.out.println("예제");
		
		int iVal = 100;
		String strVal = String.valueOf(iVal); // int를 String으로 변환
		
		double dVal = 200.0;
		String strVal2 = dVal + "";	// int를 String으로 변환하는 또 다른 방법

		double sum  = Integer.parseInt("+"+strVal)
                                          + Double.parseDouble(strVal2);
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		
		System.out.println(String.join("",strVal,"+",strVal2,"=")+sum);
		System.out.println(strVal+"+"+strVal2+"="+sum2);

	}

}

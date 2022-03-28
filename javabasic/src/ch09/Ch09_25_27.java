package ch09;

public class Ch09_25_27 {

	public static void main(String[] args) {

		// 래퍼(wrapper)클래스
		//	-> 기본형 값을 감싸는 클래스
		// 		-> boolean char byte short int long float double
		//	-> 8개의 기본형을 객체로 다뤄야할 때 사용하는 클래스
		//			-> 기본형은 객체가 아님!
		//	-> Boolean Character Byte Short Integer Long Float Double
		//		-> Character, Integer빼고 앞에만 대문자로 수정!
		
		// Java는 90% 객체지향언어...
		// Why? 기본형때문
		// 성능 문제 때문에 기본형을 유지!
		
		Integer i  = new Integer(100);
		Integer i2 = new Integer(100);

		System.out.println("i==i2 ? "+(i==i2));
		System.out.println("i.equals(i2) ? "+i.equals(i2));
		// 같으면 0/	 오른쪽 값이 작으면 양수/		오른쪽 값이 크면 음수
		// 11장에서 자세히!
		System.out.println("i.compareTo(i2)="+i.compareTo(i2));
		System.out.println("i.toString()="+i.toString());

		System.out.println("MAX_VALUE="+Integer.MAX_VALUE);
		System.out.println("MIN_VALUE="+Integer.MIN_VALUE);
		System.out.println("SIZE="+Integer.SIZE+" bits");
		System.out.println("BYTES="+Integer.BYTES+" bytes");
		System.out.println("TYPE="+Integer.TYPE);

		
		
		// Number클래스
		//	-> 모든 숫자 래퍼 클래스의 조상
		//	Byte Short Integer Long Float Double
		//	BigInteger BigDecimal
		//	아주 큰 정수  아주 큰 실수
		// 	정밀도가 높다!
		
		// 래퍼객체를 기본형으로 바꿔주는 메서드를 가지고 있다!
		//	-> 추상클래스로 구성
		//	ex) Integer -> int
		//	ex) new Integer(100) -> 100
				
	}

}

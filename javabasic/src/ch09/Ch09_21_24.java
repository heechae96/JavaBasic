package ch09;

public class Ch09_21_24 {

	public static void main(String[] args) {

		// StringBuilder(동기화x)
		//	-> StringBuffer는 동기화 되어있다.(데이터보호)
		//		-> 멀티 쓰레드에 안전(thread-safe)	13장에서 자세히!!
		//	싱글쓰레드 : 한번에 1개 작업
		//	멀티쓰레드 : 한번에 n개 작업(Ex 카카오톡 영상 다운로드 받으면서 채팅하기)
		//	-> 멀티쓰레드 프로그램이 아닌 경우, 동기화는 불필요한 성능저하
		//		-> 이럴땐 StringBuffer대신 StringBuider를 사용하면 성능 향상
		//									-> 싱글쓰레드 프로그램
		
		// 참고. 지금까지 작성해온 프로그램은 전부 싱글 쓰레드로 작성된 것이고 
		//		멀티 쓰레드로 프로그램을 작성하는 방법은 13장 쓰레드에서 배우게 된다
		
		
		
		// Math클래스
		// 수학관련 static메서드의 집합
		//	-> iv가 없으니까 객체를 만들 필요가 없다!
		
		// 관련 메소드 사진 참고!!
		
		// round()와 rint()의 차이
		// HALF_UP	HALF_DOWN_EVEN
		// rint가 오차값이 더 작다!
		//	-> 정확성이 높다!
		double sum = 0;
		double sum1 = 0;
		double sum2 = 0;
		
		for(double d = 1.5; d<=10.5; d++) {
			double d1 = Math.round(d);
			double d2 = Math.rint(d);
			
			System.out.printf("%4.1f %4.1f %4.1f %n",d,d1,d2);
			
			sum += d;
			sum1 += d1;
			sum2 += d2;
		}
		System.out.println("--------------");
		System.out.printf("%4.1f %4.1f %4.1f %n",sum,sum1,sum2);
		

		
	}

}

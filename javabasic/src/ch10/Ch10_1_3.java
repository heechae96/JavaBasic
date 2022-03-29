package ch10;

import java.util.Calendar;

public class Ch10_1_3 {

	public static void main(String[] args) {

		// 날짜와시간
		//	-> java.util.Date
		//	날짜와 시간을 다룰 목적으로 만들어진 클래스(JDK1.0)
		//	Date의 메서드는 거의 deprecated되었지만, 여전히 쓰이고 있다
		//					-> 부족한 부분이 많다!
		
		//	-> java.util.Calendar
		// 	Date클래스를 개선한 새로운 클래스(JDK1.1). 여전히 단점이 존재
		//	-> 날짜와 시간이 묶여있다...
		
		//	->java.time패키지
		//	Date와 Calendar의 단점을 개선한 새로운 클래스들을 제공(JDK1.8)
		//	-> 날짜			시간
		//	-> LocalDate	LocalTime
		//	-> 날짜 + 시간
		//	-> LocalDateTime 
		
		
			
		// Calendar클래스
		//	-> 추상 클래스이므로 getInstace()를 통해 구현된 객체를 얻어야 한다.
		
//		Calendar cal = new Calendar();	// 에러
		
		// 구현한 클래스 인스턴스를 반환한다.
//		Calendar cal = Calendar.getInstance();
		
		// 기본적으로 현재 날짜와 시간으로 설정된다
		Calendar today = Calendar.getInstance();
		// get메소드를 통해 가져온다
		//	-> set으로 현재 날짜와 시간 말고 다른 날짜와 시간 설정 가능!
		System.out.println("이 해의 년도 : " + today.get(Calendar.YEAR));
 	    System.out.println("월(0~11, 0:1월) : " + today.get(Calendar.MONTH));
	  	System.out.println("이 해의 몇 째 주: " 
                                    + today.get(Calendar.WEEK_OF_YEAR)); 
		System.out.println("이 달의 몇 째 주: " 
                                    + today.get(Calendar.WEEK_OF_MONTH));
		// DATE와 DAY_OF_MONTH는 같다.
	 	System.out.println("이 달의 몇 일: " + today.get(Calendar.DATE));
	 	System.out.println("이 달의 몇 일: " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("이 해의 몇 일: " + today.get(Calendar.DAY_OF_YEAR));
	  	System.out.println("요일(1~7, 1:일요일): " 
		 + today.get(Calendar.DAY_OF_WEEK)); // 1:일요일, ...
	 	System.out.println("이 달의 몇 째 요일: "
                               + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("오전_오후(0:오전, 1:오후): "
                               + today.get(Calendar.AM_PM));
		System.out.println("시간(0~11): " + today.get(Calendar.HOUR));
		System.out.println("시간(0~23): " + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분(0~59): " + today.get(Calendar.MINUTE));
		System.out.println("초(0~59): " + today.get(Calendar.SECOND));
		System.out.println("1000분의 1초(0~999): " 
                                      + today.get(Calendar.MILLISECOND));
 		// 천분의1초를 시간으로 표시하기 위해 36000000으로 나눔(1시간 = 60 * 60초)
		System.out.println("TimeZone(-12~+12): " 
                    + (today.get(Calendar.ZONE_OFFSET)/(60*60*1000))); 
		System.out.println("이 달의 마지막 날: " 
		            + today.getActualMaximum(Calendar.DATE) ); // 이 달의 마지막 일
		
		
		
	}

}

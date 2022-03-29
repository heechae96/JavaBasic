package ch10;

import java.util.Calendar;

public class Ch10_4 {

	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 " + date.get(Calendar.DATE) + "일 ";
	}
	
	public static void main(String[] args) {

		// Calendar예제(1)
		// 저번시간은 get메소드로 정보를 가져왔음..

		// 날짜

		// set()으로 날짜와 시간 지정하기
		// -> 월(MONTH)이 0부터 시작한다는 점에 주의

		// 요일은 1부터 시작하기 때문에, DAY_OF_WEEK[0]은 비워두었다.
		final String[] DAY_OF_WEEK = { "", "일", "월", "화", "수", "목", "금", "토" };

		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();

		// month의 경우 0부터 시작하기 때문에 4월인 경우, 3로 지정해야한다.
		// date1.set(2019, Calendar.APRIL, 29);와 같이 할 수도 있다.
		date1.set(2019, 3, 29); // 2019년 4월 29일로 날짜를 설정한다.
		System.out.println("date1은 " + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일이고,");
		System.out.println("오늘(date2)은 " + toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "요일입니다.");

		// 두 날짜간의 차이를 얻으려면, getTimeInMillis() 천분의 일초 단위로 변환해야한다.
		// 1000ms = 1초
		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
		System.out.println("그 날(date1)부터 지금(date2)까지 " + difference + "초가 지났습니다.");
		System.out.println("일(day)로 계산하면 " + difference / (24 * 60 * 60) + "일입니다."); // 1일 = 24 * 60 * 60
	
		
		System.out.println("--------------------------");
		
		// 시간
		final int[] TIME_UNIT = { 3600, 60, 1 }; // 큰 단위를 앞에 놓는다.
		final String[] TIME_UNIT_NAME = { "시간 ", "분 ", "초 " };

		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();

		time1.set(Calendar.HOUR_OF_DAY, 10); // time1을 10시 20분 30초로 설정
		time1.set(Calendar.MINUTE, 20);
		time1.set(Calendar.SECOND, 30);

		time2.set(Calendar.HOUR_OF_DAY, 20); // time2을 20시 30분 10초로 설정
		time2.set(Calendar.MINUTE, 30);
		time2.set(Calendar.SECOND, 10);

		System.out.println("time1 :" + time1.get(Calendar.HOUR_OF_DAY) + "시 " + time1.get(Calendar.MINUTE) + "분 "
				+ time1.get(Calendar.SECOND) + "초");
		System.out.println("time2 :" + time2.get(Calendar.HOUR_OF_DAY) + "시 " + time2.get(Calendar.MINUTE) + "분 "
				+ time2.get(Calendar.SECOND) + "초");

		long difference2 = Math.abs(time2.getTimeInMillis() - time1.getTimeInMillis()) / 1000;
		System.out.println("time1과 time2의 차이는 " + difference2 + "초 입니다.");

		// 핵심 부분
		//	-> 시분초로 변환(거스름돈 구할때랑 똑같다!)
		String tmp = "";
		for (int i = 0; i < TIME_UNIT.length; i++) {
			tmp += difference2 / TIME_UNIT[i] + TIME_UNIT_NAME[i];
			difference2 %= TIME_UNIT[i];
		}
		System.out.println("시분초로 변환하면 " + tmp + "입니다.");

	}


}

package ch10;

import java.util.Calendar;

public class Ch10_6_8 {

	public static void main(String[] args) {

		// add()는 특정 필드의 값을 증가 또는 감소(다른 필드에 영향 O)
		// ex) 2020.08.31 +1 하면 2020.09.01
		
		// get() : 필드 읽기
		// set() : 필드 변경
		// clear() : 필드 초기화
		 
		// roll()은 특정필드의 값을 증가 또는 감소(다른 필드에 영향 X)
		// ex) 2020.08.31 +1 하면 2020.08.01
		
		Calendar date = Calendar.getInstance();
		date.set(2019, 7, 31);	// 2019년 8월 31일

		System.out.println(toString(date));
		System.out.println("= 1일 후 =");
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));

		System.out.println("= 6달 전 =");
		date.add(Calendar.MONTH, -6);
		System.out.println(toString(date));

		System.out.println("= 31일 후(roll) =");
		date.roll(Calendar.DATE, 31);
		System.out.println(toString(date));

		System.out.println("= 31일 후(add) =");
		date.add(Calendar.DATE, 31);
		System.out.println(toString(date));
		
		
		System.out.println("----------------------------------");
		
		
		// 달력 출력 예제
		if(args.length !=2) { 
			System.out.println("Usage : java Ex10_5 2019 9"); 
			// 2019가 args[0]	9가 args[1]
			return; 
		} 
		int year  = Integer.parseInt(args[0]); 
		int month = Integer.parseInt(args[1]); 
		int START_DAY_OF_WEEK = 0; 	// 1일의 요일
		int END_DAY = 0; 			// 마지막날의 요일

		Calendar sDay = Calendar.getInstance(); // 시작일 
		Calendar eDay = Calendar.getInstance(); // 끝일 

		// 월의 경우 0부터 11까지의 값을 가지므로 1을 빼주어야 한다. 
		// 예를 들어, 2019년 11월 1일은 sDay.set(2019, 10, 1);과 같이 해줘야 한다. 
  		sDay.set(year, month-1, 1);       
		eDay.set(year, month, 1); 

		// 다음달의 첫날(12월 1일)에서 하루를 빼면 현재달의 마지막 날(11월 30일)이 된다. 
		eDay.add(Calendar.DATE, -1);       

		// 첫 번째 요일이 무슨 요일인지 알아낸다. 
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK); 

		// eDay에 지정된 날짜를 얻어온다. 
		END_DAY = eDay.get(Calendar.DATE); 

		System.out.println("      " + args[0] +"년 " + args[1] +"월"); 
		System.out.println(" SU MO TU WE TH FR SA"); 

		// 해당 월의 1일이 어느 요일인지에 따라서 공백을 출력한다. 
		// 만일 1일이 수요일이라면 공백을 세 번 찍는다.(일요일부터 시작) 
		for(int i=1; i < START_DAY_OF_WEEK; i++)  
			System.out.print("   "); 
            
		for(int i=1, n=START_DAY_OF_WEEK ; i <= END_DAY; i++, n++) { 
			System.out.print((i < 10)? "  "+i : " "+i ); 
			if(n%7==0) System.out.println(); 
		}
		
		
		
		// Date와 Calendar간의 변환
		//	-> Date의 메서드는 대부분 deprecated되었지만 여전히 사용
		
		// Calendar를 Date로 변환
		// Calendar cal = Calendar.getInstance();
		// Date d = new Date(cal.getTimeInMillis());
		
		// Date를 Calendar로 변환
		// Date d = new Date();
		// Calendar = Calendar.getInstance();
		// cal.setTime(d);
		
		
	}

	// 보기 편하게!
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"년 "+ (date.get(Calendar.MONTH)+1) 
                   +"월 " + date.get(Calendar.DATE) + "일";
	}
		
		
	

}

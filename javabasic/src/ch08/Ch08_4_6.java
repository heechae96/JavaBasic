package ch08;

public class Ch08_4_6 {

	public static void main(String[] args) {

		// 예외 처리하기, try-catch문의 흐름
		
		// 주의!
		//	-> if문과 달리, try블러이나 catch블럭 내에 포함된 문장이 하나뿐이어도
		//		괄호{	}를 생략 불가!
		
		/*
		try {
			// 예외가 발생할 가능성이 있는 문장들을 넣는 부분
		}catch(Exception1 e1) {
			// Exception1이 발생했을 경우, 이를 처리하기 위한 문장을 넣는 부분
		}catch(Exception2 e2) {
			// Exception2이 발생했을 경우, 이를 처리하기 위한 문장을 넣는 부분
		}catch(ExceptionN eN) {
			// Exception1이 발생했을 경우, 이를 처리하기 위한 문장을 넣는 부분
		}
		*/
		
		// try블럭 내에서 예외가 발생하지 않은 경우
		// 	-> catch블럭을 거치지 않고 전체 try-catch문을 빠져나가서 수행을 계속한다
		
		// try블럭 내에서 예외가 발생한 경우
		// 	-> 1. 발생한 예외와 일치하는 catch블럭이 있는지 확인
		//	-> 2. 일치하는 catch블럭을 찾게 되면, 그 catch블럭 내의 문장들을 수행하고
		//			전체 try-catch문을 빠져나가서 그 다음 문장을 계속해서 수행한다
		//			만약 일치하는 catch블럭을 찾지 못하면, 예외는 처리되지 못한다
		//											-> 프로그램 비정상 종료
		
		// 예외가 발생한 이후 문장은 실행되지 않는다!
		// Exception이 선언된 catch블럭은 모든 예외 처리(마지막 catch 블럭)
		//	-> 모든 예외의 최고조상! 모든 예외처리 가능!
		
		System.out.println(1);			
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);// ArithmeticException 발생
			System.out.println(4); 	// 예외가 발생한 이후 문장을 실행되지 않는다
		} catch (ArithmeticException ae)	{
			if (ae instanceof ArithmeticException) 
				System.out.println("true");	
			System.out.println("ArithmeticException");
		} catch (Exception e){	// 우리가 생각하지 못한 예외가 발생할 경우 대비!
			System.out.println("Exception");
		}	
		System.out.println(6);
		
		System.out.println("-----------------------------------");
		
		System.out.println(1);			
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(args[0]);// ArrayIndexOutOfBoundsException 발생
			System.out.println(4); 		// 예외가 발생한 이후 문장을 실행되지 않는다
		} catch (ArithmeticException ae)	{	// 불일치 catch문
			if (ae instanceof ArithmeticException) 
				System.out.println("true");	
			System.out.println("ArithmeticException");
		} catch (ArrayIndexOutOfBoundsException e){	// 일치 catch문
			System.out.println("ArrayIndexOutOfBoundsException");
		}	
		System.out.println(6);
	}

}

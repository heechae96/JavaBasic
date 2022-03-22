package ch08;

import java.io.File;

public class Ch08_11_13 {

	public static void main(String[] args) {

		// 예외선언하기, finally블럭
		
		// 예외를 처리하는 방법
		// 1. 직접처리
		//	-> try-catch문
		// 2. 예외 떠넘기기(알리기)
		//	-> 예외 선언하기
		// 3. 은폐(덮기)/무시 
		//	-> 빈 catch문
		
		// ★★★오버라이딩 조건 3가지★★★
		// 1. 선언부 일치
		// 2. 조상의 접근제어자보다 좁을 수 없다
		// 3. 조상보다 더 많은 예외를 던질 수 없다
		
		
		// 참고!
		//	-> 예외를 발생하는 키워드 throw와 예외를 메서드에 선언할 때 쓰이는 throws구별!
		// 메서드가 호출시 발생가능한 예외를 호출하는 쪽에 알리는 것(메서드에 예외 선언)
		//	-> checked예외만 선언하는게 정석!
		/*
		void method() throws Exception1, Exception2, ExceptionN{
			// 메서드 내용
		}
		void method() throws Exception{
			// 메서드 내용
		}
		*/
		
		// 예외가 발생한 곳에서 예외 처리를 할 수도 있고, 
		//	이 메서드를 호출한 곳에서 예외 처리를 할 수도 있다!
		//	-> 아래 예제는 후자!
		//		-> 둘 중 어느곳에서도 예외 처리를 하지 않으면 비정상종료!
		
		try {
			File f = createFile("test2.txt");
//			File f = createFile("");	// 예외 발생!
			System.out.println( f.getName()+"파일이 성공적으로 생성");
		} catch (Exception e) {			// 예외 처리!
			System.out.println(e.getMessage()+" 다시 입력해 주기 바람");
		}
	}	// main메서드 끝

	static File createFile(String fileName) throws Exception {	// 예외 선언!
		if (fileName==null || fileName.equals(""))
			throw new Exception("파일 이름이 유효하지 않음");
		File f = new File(fileName);		//  File클래스의 객체를 만듦
     	// File객체의 crateNewFile메서드를 이용해서 실제 파일을 생성
		f.createNewFile();
		return f;		// 생성된 객체의 참조를 반환
	}	
	
}



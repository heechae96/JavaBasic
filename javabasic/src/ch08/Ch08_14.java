package ch08;

public class Ch08_14 {

	public static void main(String[] args) {

		// finally블럭
		//	-> 예외 발생여부와 관계없이 수행되어야 하는 코드를 넣는다
		
		// 설치 시작, 파일 복사, 설치 끝나면 임시 파일 삭제의 경우
		// 	-> 오류가 발생해도, 설치가 완료되어도, 임시 파일은 삭제해야함!
		//		-> 중복 코드 발생!
		
		/*
		try {
			startInstall();
			copyFiles();
			deleteTempFiles();	// 중복코드
		} catch(Exception e) {
			e.printStackTrace();
			deleteTempFiles();	// 중복코드
		}
		
		try {
			startInstall();
			copyFiles();
		} catch(Exception e) {
			e.printStackTrace();
		} finally{	// 중복 코드 제거
			deleteTempFiles();	
		}
		*/
	}

}

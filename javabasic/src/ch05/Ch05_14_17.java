package ch05;

public class Ch05_14_17 {

	public static void main(String[] args) {
		//					-> 이걸 사용하는것
		
		// 커맨드라인 입력받기
		// -> 문자열 배열에 담겨서 전달된다
		// 이전시간에는 Scanner라는 클래스를 이용했음
		
		// Run -> Run Configurations... 
		// -> arguments
		// -> abc 123 "Hello world" 입력후 run
		System.out.println("매개변수의 개수:"+args.length);
		for(int i=0; i<args.length; i++) {
			System.out.println("args["+i+"] = \""+args[i]+"\"");
		}
		
		
	}

}

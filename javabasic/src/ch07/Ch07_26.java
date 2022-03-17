package ch07;

public class Ch07_26 {

	public static void main(String[] args) {

		// instanceof 연산자
		// 참조변수의 형변환 가능여부 확인에 사용. 가능하면 true반환
		//	-> 조상과 자손만 형변환 가능!
		// 형변환 전에 반드시 instanceof로 확인해야 함
		
		// 본인 또는 최고조상(Object)도 true로 반환
		
		/*
		void doWork(Car c) {
			if(c instanceof FireEngine) {
				FireEngine fe = (FireEngine)c;
				fe.water();
			}
		}
		*/
		
		FireEngine fe = new FireEngine();
		System.out.println(fe instanceof Object);		// 최고조상 ok
		System.out.println(fe instanceof Car);			// 조상 ok
		System.out.println(fe instanceof FireEngine);	// 본인 ok
		
		
		// Q. 참조변수의 형변환은 왜 하나요?
		// A. 참조변수(리모콘)을 변경함으로써 사용할 수 있는 멤버의 갯수를 조절하기 위해
		
		// Q. instanceof연산자는 언제 사용하나요?
		// A. 참조변수를 형변환하기 전에 형변환 가능여부를 확인할때
	}

}

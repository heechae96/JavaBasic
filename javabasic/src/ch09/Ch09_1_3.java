package ch09;

class Value{
	int value;
	
	Value(int value){
		this.value =  value;
	}
	
	
	// Object의 equals()를 오버라이딩해서 주소가 아닌 value를 비교하도록 오버라이딩!
	public boolean equals(Object obj) {
		// 참조변수의 형변환 전에는 반드시 instanceof로 확인해야함
		if(!(obj instanceof Value))
			return false;
		
		Value v = (Value)obj;	// obj를 value로 형변환
			
		return this.value==v.value;
//		return this==obj		// 주소비교. 서로 다른 객체는 항상 거짓
	}
}

public class Ch09_1_3 {

	public static void main(String[] args) {

		// Object클래스
		// 모든 클래스의 최고 조상. 오직 11개의 메서드만을 가지고 있다
		// notify(), wait()등은 쓰레드와 관련된 메서드이다.
		// 사진참고!
		
		
		// equals()
		//	-> 객체 자신(this)과 주어진 객체(obj)를 비교한다.
		//		-> 같으면 true, 다르면 false
		//	-> Object클래스의 equals()는 객체의 주소를 비교(참조변수 값 비교)
		//	-> ==과 다름 주의!!(참조변수 비교)
		
		// 인스턴스 변수(iv)의 값을 비교하도록 equals()를 오버라이딩!
		//	-> cv는 객체마다 공통이므로 비교할 필요 x
		// 기본 구현이 아래와 같기때문!
		// String클래스 비교는 오버라이딩 해서 구현되어져 있었음...
		/*
		public boolean equals(Object obj) {
	        return (this == obj);
	    }
		*/
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2))
			System.out.println("v1과 v2는 같습니다");
		else 
			System.out.println("v1과 v2는 다릅니다");
		
	}

}

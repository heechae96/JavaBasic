package ch06;

public class Ch06_32_35 {

	public static void main(String[] args) {

		// 생성자
		// 인스턴스가 생성될 때마다 호출되는 '인스턴스 초기화 메서드'
		// 인스턴스 생성시 수행할 작업(iv 초기화)에 사용
		
		// 이름이 클래스 이름과 같아야 한다
		// 리턴값이 없다.(void안붙임)
		//			-> 항상 반환값이 없기 때문에!
		// ★모든 클래스는 반드시 생성자를 가져야 한다★
		
		// 기본생성자
		// 매개변수가 없는 생성자
		// ★생성자가 하나도 없을 때만, 컴파일러가 자동 추가★
		// -> Time t = new Time();
		
		// 생성자
		// 기본생성자가 아닌 생성자를 만들면, 기본생성자는 없다
		// 								-> 따로 만들어줘서 써야함
		// -> Time t = new Time(12,34,56);
		
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2();
		// The constructor Data_2() is undefined
		
		
		// ★ 기본생성자를 만드는 습관 필요! ★
		
		// 과정
		// 1. 참조변수 생성
		// 2. new를 통해서 객체 생성
		// 3. 객체 초기화
		// 4. 대입(연결)
		
	}

}
class Data_1{
	int value;
//	Data_1() {}	// 기본생성자
}

class Data_2{
	int value;
	
	Data_2() {}	// 기본생성자 필요!
	
	Data_2(int x){
		value = x;
	}
}
package ch06;

public class Ch06_25 {

	public static void main(String[] args) {

		// 기본형 매개변수 
		// -> 변수의 값을 읽기만 할 수 있다(read only)
		
		// 참조형 매개변수
		// -> 변수의 값을 읽고 변경할 수 있다(read & write)
		// 		-> 객체의 주소로 접근해서 가능한것..

		// 참조형 반환타입
		Data33 d = new Data33();
		d.x = 10;
		
		// static이라 객체 생성없이 호출가능
		// Ex06_25 e = new Ex06_25();
		// e.copy();
		// 지금은 자세히 알 필요없다!
		
		Data33 d2 = copy(d);
		System.out.println("d.x ="+d.x);
		System.out.println("d2.x ="+d2.x);
		
		// heap 에 있는 객체의 주소만 stack에 저장한다
		// -> 아직 heap에 대한 언급은 없었음..
		
		
	}
	
	static Data33 copy(Data33 d) {
		Data33 tmp = new Data33();
		tmp.x = d.x;
		return tmp;	// 복사한 객체의 주소를 반환
	}


}
class Data33 {
	int x;
}

/*
main() : x = 10
change() : x = 1000
After change(d.x)
main() : x = 10 
 */

/*
main() : x = 10
change() : x = 1000
After change(d.x)
main() : x = 1000
 */

/*
d.x =10
d2.x =10
 */


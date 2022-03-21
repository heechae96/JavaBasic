package ch07;

public class Ch07_39 {

	public static void main(String[] args) {

		// 인터페이스의 장점
		// 1. 두 대상(객체) 간의 '연결, 대화, 소통'을 돕는 '중간 역할'을 한다.
		// inter + face
		//  ~사이	   얼굴(대상)
		// 2. 선언(설계)와 구현을 분리시킬 수 있게 한다.
		//	-> 느슨한 결합! <-> 강한 결합!
		//		유연				no유연
		
		// 유연하지 못한 관계
		// A -> B

		// 유연한 관계
		//		-- I --
		//		||---||	
		// A -> ||->B||
		// 		||___||
		//		-------

		// B를 C로 변경해야 하는 경우
		// 유연하지 못하면(A->B) A B를 동시에 변경
		// 유연하면(A->I->B) A는 그대로 B만 C로 변경
		//	-> A에서 인터페이스를 사용하고, 직접적인 B와의 관계가 없었기 때문
		
		A a = new A();
//		a.method(new B());
		a.method(new C());
		
		
	}

}
// 유연하지 못한 강한 결합!
// 껍데기 + 알맹이
/*
class A{
	public void method(B b) {
		b.method();
	}
}

class B{
	public void method() {
		System.out.println("methodB()");
	}
}
*/
//유연한 느슨할 결합!
class A{
	public void method(I i) {
		i.method();
	}
}

// 껍데기
interface I {
	void method();
}

// 알맹이
class B implements I{
	public void method() {
		System.out.println("methodB()");
	}
}

// 알맹이
class C implements I{
	public void method() {
		System.out.println("methodC()");
	}
}
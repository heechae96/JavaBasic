package pkg2;

// commant + shift + o : auto import
import pkg1.MyParent;

class MyChild extends MyParent{
	
	public void printMembers() {
//		System.out.println(prv);	// 에러
//		System.out.println(dft);	// 에러
		System.out.println(prt);	// 자손이므로 ok
		System.out.println(pub);
	}
}

public class MyParentTest2 {

	public static void main(String[] args) {
		
		MyParent p = new MyParent();
//		System.out.println(p.prv);	// 에러
//		System.out.println(p.dft);	// 에러
//		System.out.println(p.prt);	// 에러(자손에도 속하지 않음)
		System.out.println(p.pub);	// ok
	}

}

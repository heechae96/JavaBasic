package pkg1;

// 하나의 소스파일에는 public class가 1개만 있어야 한다! 

public class MyParent{	// 접근제어자가 public
	private int prv;	// 같은클래스	
	int dft;			// 같은 패키지
	protected int prt;	// 같은 패키지 + 자손(다른패키지)
	public int pub;		// 접근제한 없음
	
	public void printMembers() {
		System.out.println(prv);
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}
}

class MyParentTest {	// 접근제어자가 (default)

	public static void main(String[] args) {

		MyParent p = new MyParent();
//		System.out.println(p.prv);	// 에러
		System.out.println(p.dft);	// ok
		System.out.println(p.prt);	// ok
		System.out.println(p.pub);	// ok
		
	}

}

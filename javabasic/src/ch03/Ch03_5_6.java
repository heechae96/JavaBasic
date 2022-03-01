package ch03;

public class Ch03_5_6 {

	public static void main(String[] args) {

		// 증감연산자 (단항연산자에 속함)
		// 전위형과 후위형으로 나뉨
		// 증감연산자가 독립적으로 사용된경우, 차이가 없다
		// ex) j = i++	/	j = ++i
		
		int i = 5, j = 0;
		
		//전위 
		j = i++;
		System.out.println("j=i++후 "+"i="+i+" j="+j);
		
		i = 5;
		j = 0;
		
		// 후위 
		j = ++i;
		System.out.println("j=++i후 "+"i="+i+" j="+j);
		
		// 부호연산자
		// + -
		// 사실 +는 존재는 하지만, 쓰이는 경우가 없다.
		
		// 기본연산자는 피연산자를 2개 필요로 함
		// 단항연산자는 피연산자 1개만 있어도 된다!
		
		
	}

}

package ch03;

public class Ch03_15_16 {

	public static void main(String[] args) {
		
		System.out.println(3>5);
		System.out.println(3==5);
		System.out.println(3!=5);
		
		// 논리 연산자
		// 조건식을 연결할 때 사용하는 연산자
		// &&(and)	||(or)
		// 그리고		또는
		// 주의
		// x > 10 && x <20	
		// -> 10 < x < 20	불가능
		// 한 식에 and or가 같이 나오면 먼저 계산할 식에 괄호를 쳐주는게 좋다 
		// and가 or보다 우선순위가 높다 
		
		
		// 논리 부정 연산자
		// !
		// true를 false로
		// false를 true로
		// 언제쓰이는가?
		// ex) 소문자가 아닌지 파악하고 싶은 경우  
		char ch = 'N';
		System.out.println(ch < 'a' || ch > 'z');
		// 보다 직관적!
		System.out.println(!('a' <= ch && ch <= 'z'));
				
		
		// 이중으로 붙어있는 경우
		// -> 단항 연산자이기 때문에 오른쪽에서 왼쪽으로 하나씩
		
		
	}

}

package ch11;

import java.util.*;

public class Ch11_15_18 {

	public static void main(String[] args) {

		// Stack과 Queue
		
		// Stack(밑이 막힌 상자)
		//	-> LIFO구조. 마지막에 저장된 것을 제일 먼저 꺼내게 된다
		//		-> Last In First Out
		//	저장(push) 추출(pop)
		//	-> 배열이 효율적
		
		// Queue(양끝이 꿇린 상자)
		//	-> FIFO구조. 제일 먼저 저장한 것을 제일 먼저 꺼내게 된다
		//		-> First In First Out
		//	저장(offer) 추출(poll)
		//	-> LinkedList가 효율적
		
		// Stack은 클래스
		//	-> 객체 생성 후 사용
		
		// Queue는 인터페이스
		//	-> 객체 생성 불가능
		//		-> Queue를 직접구현
		//		-> Queue를 구현한 클래스를 사용
		//			-> ex) Queue q = new LinkedList();
		
		
		Stack st = new Stack();
		Queue q = new LinkedList();	// Queue인터페이스의 구현체인 LinkedList를 사용
		
		st.push("0");
		st.push("1");
		st.push("2");

		q.offer("0");
		q.offer("1");
		q.offer("2");

		System.out.println("= Stack =");
		while(!st.empty()) {
			System.out.println(st.pop()); // 스택에서 요소 하나를 꺼내서 출력
		}
		
		System.out.println(st);

		System.out.println("= Queue =");
		while(!q.isEmpty()) {
			System.out.println(q.poll()); // 큐에서 요소 하나를 꺼내서 출력
		}
		
		System.out.println(q);
	}

}

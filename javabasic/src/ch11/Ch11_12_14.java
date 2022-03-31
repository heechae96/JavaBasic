package ch11;

public class Ch11_12_14 {

	public static void main(String[] args) {

		// LinkedList
		
		// 배열의 장점
		// 	-> 배열은 구조가 간단하고 데이터를 읽는데 걸리는 시간(접근시간, access time)이 짧다
		// 배열의 단점
		//	-> 크기를 변경할 수 없다
		//		-> 크기를 변경해야 하는 경우 새로운 배열을 생성 후 데이터를 복사해야함
		//		1. 더 큰 배열 생성
		//		2. 복사
		//		3. 참조변경
		//	-> 비순차적인 데이터의 추가, 삭제에 시간이 많이 걸린다
		//		-> 데이터를 추가하거나 삭제하기 위해 다른 데이터를 옮겨야 함
		//		-> 그러나 순차적인 데이터(끝에 추가)와 삭제(끝부터 삭제)는 빠르다
		
		// 배열의 단점을 보완
		//	-> 배열과 달리 LinkedList는 불연속적으로 존재하는 데이터를 연결(link)
		//						-> 배열은 연속적!
		//	-> 데이터의 삭제 : 단 한번의 참조변경만으로 가능
//		class Node{
//			Node next;	// 다음노드
//			Object obj;	// 데이터
//		}
		//	-> 데이터의 추가 : 한번의 Node객체 생성과 두 번의 참조변경만으로 가능 
		
		// 이중 연결 리스트
		// 연결 리스트 단점 : 데이터 접근성이 나쁨
		// doubly linked list
		// -> 이중 연결리스트, 접근성 향상(그래도 여전히 나쁘다)
//		class Node{
//			Node next;
//			Node previous;
//			Object obj;
//		}
		// doubly circular linked list
		//	-> 이중 원형 연결리스트
		
		// ArrayList vs LinkedList 성능비교
		//	(배열기반)		 (연결기반)
		//	(연속적)		 (비연속적)
		// 순사적으로 데이터를 추가/삭제 : ArrayListrk 빠름
		// 비순차적으로 데이터를 추가/삭제 : LinkedList 빠름
		// 접근시간(access time) : ArrayList 빠름
		//	-> 인덱스가 n인 데이터의 주소 = 배열의 주소 + n * 데이터 타입의 크기
		
		
	}

}

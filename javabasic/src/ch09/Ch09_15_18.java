package ch09;

public class Ch09_15_18 {

	public static void main(String[] args) {

		// StringBuffer클래스
		//	-> String처럼 문자형 배열(char[])을 내부적으로 가지고 있다
		
		/*
		public final class StringBuffer implements java.io.Serializable{
			private char[] value;
			// ...
		}
		*/
		
		// ★★★그러나, String과 달리 내용을 변경할 수 있다.(mutable)★★★
		// append()는 지정된 내용을 StringBuffer 추가 후, StringBuffer의 참조를 반환
		//								-> sb.append("123").append("ZZ");
		//											->	sb.append("ZZ")
		StringBuffer sb1 = new StringBuffer("abc");
//		sb1.append("123");
//		sb1.append("ZZ");
		// 위 2줄 코드를 한번에
		sb1.append("123").append("ZZ");
		System.out.println(sb1);
		
		// append(): 문자열 추가
		// delete(): 문자열 삭제
		// insert(): 문자열 삽입
		
		// StringBuffer는 저장할 문자열의 길이를 고려해서 적절한 크기로 생성해야함
		// 배열은 길이 변경불가. 공간이 부족하면 새로운 배열 생성해야함
		//	변경하고 싶은 경우 아래와 같은 과정 필요!
		//	-> 1. 새로운 배열 생성
		//	-> 2. 공간 부족 내용 복사
		//	-> 3. 참조 변경
		
		// StringBuffer는 equals()가 오버라이딩 되어있지 않다.(주소비교)
		// 	-> this==obj
		// StringBuffer을 string으로 변환 후에 equals()로 비교해야 한다!
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		System.out.println(sb==sb2);
		System.out.println(sb.equals(sb2));
		
		String s = sb.toString();
		String s2 = sb2.toString();
		System.out.println(s.equals(s2));
		
		
		
		
	}

}

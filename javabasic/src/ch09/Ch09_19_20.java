package ch09;

public class Ch09_19_20 {

	public static void main(String[] args) {

		// StringBuffer클래스의 메서드
		// 사진 참고!
		
		StringBuffer sb = new StringBuffer("01");
		// 버퍼의 크기 기존 16에서 01 추가해서 18
		System.out.println("capacity="+sb.capacity());
		StringBuffer sb2 = sb.append(23);
		// 기존 18인 버퍼의 길이2에서 길이2를 추가한것
		//	-> 버퍼의 크기는 동일
		System.out.println("capacity="+sb2.capacity());
		System.out.println("length="+sb2.length());
		sb.append('4').append(56);
		
		StringBuffer sb3 = sb.append(78);			
		sb3.append(9.0);

		System.out.println("sb ="+sb);
		System.out.println("sb2="+sb2);
		System.out.println("sb3="+sb3);

		System.out.println("sb ="+sb.deleteCharAt(10));
		System.out.println("sb ="+sb.delete(3,6));
		System.out.println("sb ="+sb.insert(3,"abc"));
		System.out.println("sb ="+sb.replace(6, sb.length(), "END"));

		System.out.println("capacity="+sb.capacity());
		System.out.println("length="+sb.length());
	}

}

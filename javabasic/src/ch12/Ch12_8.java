package ch12;

import java.util.*;

public class Ch12_8 {

	public static void main(String[] args) {
		// HashMap<K,V>
		// 	-> 여러개의 타입 변수가 필요한 경우, 콤마(,)를 구분자로 선언
		// 	HashMap<String, Student> map = new HashMap<String, Student>();
		// 	-> 형변환이 불필요!
		//	Student s1 = map.get("1-1");
		
		// JDK1.7부터 생성자에 타입지정 생략가능
//		HashMap<String, Student2> map = new HashMap<String, Student2>();
		HashMap<String, Student2> map = new HashMap<>();
		
		map.put("자바", new Student2("자바왕", 1, 2, 30, 40, 50));
		
		// public Student get(Object key){
//		Student2 s = (Student2)map.get("자바왕");
		// 			-> 형변환이 필요 없어짐
//		Student2 s = map.get("자바");
		
		System.out.println(map.get("자바").name);
		
		// 주의. 
		//	-> 매개변수가 Object라고 무조건 형변환을 하는것은 아니다..
	}
}

class Student2 {
	String name = "";
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	Student2(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
}

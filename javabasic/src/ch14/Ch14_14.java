package ch14;

import java.util.function.Function;
import java.util.function.Supplier;

public class Ch14_14 {

	public static void main(String[] args) {

		// 생성자의 메서드 참조
		
		// 생성자와 메서드 참조
		//			출력
		// Supplier<Myclass> s = () -> new MyClass();
		// -> Supplier<MyClass> s = MyClass::new;
		//			입력		 출력
		// Fucntion<Integer, Myclass> s = (i) -> new MyClass(i);
		// -> Function<Integer, MyClass> s = MyClass::new;
		
		
		// 배열과 메서드 참조
		// Function<Integer, int[]> f = x -> new int[x];
		// Function<Integer, int[]> f2 = int[]::new
		
		
//		Supplier<MyClass> s = () -> new MyClass();
//		Supplier<MyClass> s = 클래스이름::메서드이름;
//		Supplier<MyClass> s = MyClass::new;
		
//		Function<Integer, MyClass> f = (i) -> new MyClass(i);
		Function<Integer, MyClass> f = MyClass::new;
		
		MyClass mc = f.apply(100);
		System.out.println(mc);
		System.out.println(mc.iv);
		
		System.out.println(f.apply(200).iv);
		
		// 배열
//		Function<Integer, int[]> f2 = (i) -> new int[i];
		Function<Integer, int[]> f2 = int[]::new;
		int[] arr = f2.apply(200);
		System.out.println(arr.length);
		System.out.println(f2.apply(100).length);
	}

}

class MyClass{
	int iv;
	
	MyClass(int iv) {
		this.iv = iv;
	}
}

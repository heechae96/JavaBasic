package ch11;

import java.util.Arrays;

public class Ch11_25_29 {

	public static void main(String[] args) {

		// Arrays
		//	-> 	배열을 다루기 편리한 메서드(static) 제공
		// 1. 배열의 출력 - toString()
		// 2. 배열의 복사 - copyOf(), copyOfRange()
		// 3. 배열 채우기 - fill(), setAll()
		// 4. 배열의 정렬과 검색(이진탐색) - sort(), binarySearch()
		//	-> 검색하려면 정렬을 먼저해야함!
		// 	순서 검색(탐색)
		//		-> 좌에서 우로! 순서대로!
		// 	이진 검색(탐색)
		//		-> 계속 절반으로 나누면서 원하는값을 검색
		// 5. 다차원 배열의 출력 - deepToString()
		// 6. 다차원 배열의 비교 - deepEquals() 
		// 7. 배열을 List로 변환 - asList(Object... a)
		//								-> 가변 매개변수(매개변수 여러개 가능)
		//	-> 읽기 전용!
		//		-> 수정하려면 새로운 ArrayList를 만들어야함
		// 8. 람다와 스트림(14장) 관련 - parallelXXX(), spliterator(), stream()
		
		int[]	   arr   = {0,1,2,3,4};
		int[][]	arr2D = {{11,12,13}, {21,22,23}};

		System.out.println("arr="+Arrays.toString(arr));
		System.out.println("arr2D="+Arrays.deepToString(arr2D));

		int[] arr2 = Arrays.copyOf(arr, arr.length);
		int[] arr3 = Arrays.copyOf(arr, 3);          
		int[] arr4 = Arrays.copyOf(arr, 7);          
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4);  
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7);  

		System.out.println("arr2="+Arrays.toString(arr2));
		System.out.println("arr3="+Arrays.toString(arr3));
		System.out.println("arr4="+Arrays.toString(arr4));
		System.out.println("arr5="+Arrays.toString(arr5));
		System.out.println("arr6="+Arrays.toString(arr6));
		
		int[] arr7 =  new int[5];
		Arrays.fill(arr7, 9);  // arr=[9,9,9,9,9]
		System.out.println("arr7="+Arrays.toString(arr7));

		// 람다식
		Arrays.setAll(arr7, i -> (int)(Math.random()*6)+1);
		System.out.println("arr7="+Arrays.toString(arr7));

		// 향상된 for문
//		for(int i=0; i<arr7.length; i++) {
//			// 생략
//		}
		for(int i : arr7) {	
			char[] graph = new char[i];
			Arrays.fill(graph, '*');
			System.out.println(new String(graph)+i);
		}

		String[][] str2D  = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};

		System.out.println(Arrays.equals(str2D, str2D2));     // false
		System.out.println(Arrays.deepEquals(str2D, str2D2)); // true

		char[] chArr = { 'A', 'D', 'C', 'B', 'E' };

		System.out.println("chArr="+Arrays.toString(chArr));
		// 음수가 나올수 없는데 음수가 나왔네?
		//	-> 잘못된 것. 정렬을 먼저안해서!
		System.out.println("index of B ="+Arrays.binarySearch(chArr, 'B'));
		System.out.println("= After sorting =");
		Arrays.sort(chArr);
		System.out.println("chArr="+Arrays.toString(chArr));
		System.out.println("index of B ="+Arrays.binarySearch(chArr, 'B'));
		
	}

}

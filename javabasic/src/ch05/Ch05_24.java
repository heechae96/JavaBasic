package ch05;

import java.util.Arrays;

public class Ch05_24 {

	public static void main(String[] args) {

		// Arrays로 배열 다루기
		// -> 클래스
		
		// 배열의 비교와 출력
		// equals(), toString()
		
		// 배열의 복사
		// copyOf(), copyOfRange()
		
		// 배열의 정렬
		// sort()
		// 오름차순으로!
		// 11장에서 정렬 자세히 배움!
		
		int[] arr = {0,1,2,3,4};
		int[][] arr2d = {{11,12},{21,22}};
		
		// 1차원 경우
		System.out.println(Arrays.toString(arr));
		// 2차원 이상일 경우
		System.out.println(Arrays.deepToString(arr2d));
		
		String[][] str2d = {{"aaa", "bbb"},{"AAA", "BBB"}};
		String[][] str2d2 = {{"aaa", "bbb"},{"AAA", "BBB"}};
		
		// 참조변수 값을 비교
		System.out.println(str2d == str2d2);
		// 내용물 비교
		// 2차원이상
		System.out.println(Arrays.deepEquals(str2d, str2d2));
		
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		// 복사 대상의 배열크기를 넘어가면 빈자리 0으로 채워짐
		int[] arr3 = Arrays.copyOf(arr, 7);
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
		// 복사할 배열명 , from , to
		// to는 마찬가지로 포함 x
		int[] arr4 = Arrays.copyOfRange(arr,2,4);
		System.out.println(Arrays.toString(arr4));
		
		int[] mix = {3,5,1,2,6,0};
		System.out.println("정렬전 "+Arrays.toString(mix));
		// 오름차순 정렬
		Arrays.sort(mix);
		System.out.println("정렬후 "+Arrays.toString(mix));
		
		// 그럼 내림차순정렬은?
		// 11장에서 자세히 배움!
		
		
		
	}

}

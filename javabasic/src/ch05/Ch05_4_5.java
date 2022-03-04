package ch05;

public class Ch05_4_5 {

	public static void main(String[] args) {

		// 배열의 길이 
		// 배열이름.length - 배열의 길이(int형 상수)
		
		// 배열은 한번 생성하면 실행 동안 그 길이를 바꿀 수 없다
		// 의문점1) 왜?
		// 공간을 할당할때 연속적으로 구성되어 있어야 하는데
		// 이때 그 공간을 이미 다른곳에서 차지할 가능성.
		// 의문점2) 이후에 길이가 부족하면?
		// 큰 배열을 새로 만들고 기존 배열을 복사해서 넣어준다.
		
		// 넘어가는 인덱스를 출력하면 에러
		// 이를 방지하기 위해
		// -> for(int i=0; i<score.length; i++)
		
		int[] arr = new int[5];
		System.out.println("arr.length="+arr.length);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"]"+arr[i]);
		}
		
		// 배열의 초기화
		// 배열의 각 요소에 처음으로 값을 저장하는 것
		// 지정안하면 0으로 지정됨
		// 2번 방식을 주로 사용
		// 1) int[] score = new int[]{50,60,70,80,90};
		// 2) int[] score = {50,60,70,80,90};
		
		// 주의!
		// 두 줄로 작성하면 에러!
		// 2번 방식으로 그냥 알아두자..
		// int[] score;
		// score = {50,60,70,80,90};
		
		
		
		
		
		
	}

}

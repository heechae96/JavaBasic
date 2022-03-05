package ch05;

import java.util.Arrays;

public class Ch05_10_11 {

	public static void main(String[] args) {
		
		// 배열의 활용
		
		// 섞기(shuffle)
		// 배열의 요소의 순서를 반복해서 바꾼다
		// 숫자 섞기, 로또번호 생성
		
		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));
		
		// 100번 섞는것
		for(int i=0; i<100; i++) {
			// 인덱스 9번까지 배열을 만들었기 때문
			int n = (int)(Math.random()*10);
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		System.out.println(Arrays.toString(numArr));		
		
		
		// 로또 번호 생성
		int[] ball = new int[45];
		
		for(int i=0; i<ball.length; i++) {
			// 로또 번호를 1~45로 설정
			ball[i] = i+1;
		}
		
		System.out.println(Arrays.toString(ball));
		
		int tmp = 0;
		int j = 0;
		
		for(int i=0; i<6; i++) {
			// 위에서 배열 인덱스가 44까지였음
			j = (int)(Math.random()*45);
			// 로또 번호가 중복되면 안되기 때문에 옮겨줌
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
			System.out.println("ball"+i+" : "+ball[i]);
		}
		
	}

}

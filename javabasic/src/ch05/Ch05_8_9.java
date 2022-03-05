package ch05;


public class Ch05_8_9 {

	public static void main(String[] args) {

		// 배열의 활용
		// 배열의 모든 요소를 더해서 총합과 평균을 구한다
		int sum = 0;
		float avg = 0f;
		
		int[] score = {90, 89, 70, 76, 98};
		
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		
		// 값손실을 막기 위해 형변환
		avg = (float)sum/score.length;
//		avg = sum/score.length;
		
		System.out.println("총합 "+sum);
		System.out.println("평균 "+avg);
		
		
		
		// 최대값과 최소값을 찾는 예제
		int[] score1 = {20, 30, 40, 50, 60};
		
		int max = score1[0];
		int min = score1[0];
		
		for(int i=0; i<score1.length; i++) {
			if(score1[i] > max) {
				max = score1[i];
			}else if(score1[i] < min) {
				min = score1[i];
			}
		}
		
		System.out.println("max :"+max);
		System.out.println("min :"+min);
		
		
	}

}

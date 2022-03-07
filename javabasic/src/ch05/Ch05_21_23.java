package ch05;

public class Ch05_21_23 {

	public static void main(String[] args) {

		// 2차원 배열의 예제
		// 꼭 정사각형이 아니어도 무관
		int[][] score = {
				{100, 200, 300},
				{20, 20, 20, 20},
				{30, 30},
				{40}
		};
		
		int sum = 0;
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.printf("score[%d][%d]=%d\n",i,j,score[i][j]);
				sum += score[i][j];
			}
		}
		
		System.out.println("sum = "+sum);
		
		
		
		
		// 과목별 총점 예제도 이후에 풀자!
		
		
		
		// 영어 단어 퀴즈 예제도 이후에 풀자!
		
		
	}

}

package ch5;

import java.util.Arrays;

public class Ch5_5 {
    public static void main(String[] args) {
        // 다음은 1과9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램이다.
        // 1~2에 알맞은 코드를 넣어서 프로그램을 완성

        int[] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] ball3 = new int[3];

        for (int i = 0; i < ballArr.length; i++) {
            int j = (int) (Math.random() * ballArr.length);  // 인덱스 역할
            int tmp = 0;

            // 1)
            tmp = ballArr[j];
            ballArr[j] = ballArr[i];
            ballArr[i] = tmp;

//            System.out.println(Arrays.toString(ballArr));
        }

        // 2)
        System.arraycopy(ballArr, 0, ball3, 0, 3);

        System.out.println(Arrays.toString(ball3));
    }
}

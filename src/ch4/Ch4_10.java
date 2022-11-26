package ch4;

import java.util.Scanner;

public class Ch4_10 {
    public static void main(String[] args) {
        // 다음은 숫자 맞추기 게임을 작성한 것이다.
        // 1과 100사이의 값을 반복적으로 입력해서 컴퓨터가 생각한 값을 맞추면 게임이 끝난다.
        // 사용자가 값을 입력하면, 컴퓨터는 자신이 생각한 값과 비교해서 결과를 알려준다
        // 사용자가 컴퓨터가 생각한 숫자를 맞추면 게임이 끝나고 몇 번 만에 숫자를 맞췄는지 알려준다

        int answer = (int) (Math.random() * 100) + 1;
        Scanner sc = new Scanner(System.in);
        int input = 0;
        int cnt = 0;

//        System.out.println("answer = " + answer);

        do {
            System.out.print("1~100 사이의 값을 입력하세요: ");
            input = sc.nextInt();
            cnt++;

            if (answer > input) {
                System.out.println("더 큰 수를 입력하세요");
            } else if (answer < input) {
                System.out.println("더 작은 수를 입력하세요");
            } else {
                System.out.println("정답입니다");
                System.out.println("당신은 " + cnt + "번에 성공했습니다");
            }
        } while (answer != input);
    }
}

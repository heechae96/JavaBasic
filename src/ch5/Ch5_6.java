package ch5;

import java.util.Scanner;

public class Ch5_6 {
    public static void main(String[] args) {
        // 단어의 글자위치를 섞어서 보여주고 원래의 단어를 맞추는 예제
        // 실행결과와 같이 동작하도록 예제의 빈 곳을 채우시오

        String[] words = {"television", "computer", "mouse", "phone"};

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<words.length; i++){
            char[] question = words[i].toCharArray();   // String -> char[]

            // 문제
            for(int j=0; j<question.length; j++){
                int idx = (int)(Math.random() * question.length);

                char tmp = question[idx];
                question[idx] = question[j];
                question[j] = tmp;
            }

            System.out.printf("Q%d. %s의 정답을 입력하세요 > ", i+1, new String(question));
            String answer = sc.next();

            if(words[i].equals(answer.trim())){
                System.out.println("맞았습니다");
            }else{
                System.out.println("틀렸습니다");
            }
        }

    }
}

package ch4;

public class Ch4_7 {
    public static void main(String[] args) {
        // 숫자로 이루어진 문자열 str이 있을때,
        // 각 자리의 합을 더한 결과를 출력하는 코드를 완성해라.
        // 만일 문자열이 "12345"라면, '1+2+3+4+5'의 결과인 15를 출력

        String str = "12345";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - '0';
//            System.out.println("inner sum = " + sum);
        }

        System.out.println("sum = " + sum);
    }
}

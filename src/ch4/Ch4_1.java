package ch4;

public class Ch4_1 {
    public static void main(String[] args) {
        // 다음의 문장들을 조건식을 표현하라

        // 1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
        // x > 10 && x < 20

        // 2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
        // !(ch == ' ' || ch == '\t')

        // 3. char형 변수 ch가 'x'또는 'X'일 때 true인 조건식
        // ch == 'x' || ch == 'X'

        // 4. char형 변수 ch가 숫자('0'~'9')일 때 true인 조건식
        // ch >= '0' && ch <= '9'

        // 5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
        // (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')

        // 6. int형 변수 year가 400으로 나누어 떨어지거나 또는 4로 나누어 떨어지고
        //    100으로 나누어 떨어지지 않을 때 true인 조건식
        // &&가 ||보다 우선이므로 괄호 안했음!
        // year % 400 == 0 || year % 4 == 0 && !(year % 100 == 0)

        // 7. boolean형 변수 powerOn이 false일 때 true인 조건식
        // powerOn == false

        // 8. 문자열 참조변수 str이 "yes"일 때 true인 조건식
        // str.equals("yes")
    }
}

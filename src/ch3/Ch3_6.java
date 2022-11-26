package ch3;

public class Ch3_6 {
    public static void main(String[] args) {
        // 아래는 화씨(F)를 썹씨(C)로 변환하는 코드이다.
        // 변환공식 C = 5/9 * (F-32)
        // 단, 변환 결과값은 소수점 셋째자리에서 반올림 해야한다
        // Math.round()를 사용하지 않고 처리 할 것

        int fahrenheit = 100;
        float celcius = (int) (5f / 9 * (fahrenheit - 32) * 100 + 0.5) / 100.0f;

        System.out.println("fahrenheit = " + fahrenheit);
        System.out.println("celcius = " + celcius);
    }
}

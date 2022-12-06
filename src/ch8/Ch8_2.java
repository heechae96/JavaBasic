package ch8;

public class Ch8_2 {
    // 다음은 실행도중 예외가 발생하여 화면에 출력된 내용이다
    // 이에 대한 설명 중 옳지 않은 것은?

    // java.lang.ArithmeticException : / by zero
    //      at ExceptionEx18.mehod2(ExceptionEx18.java:12)
    //      at ExceptionEx18.mehod1(ExceptionEx18.java:8)
    //      at ExceptionEx18.main(ExceptionEx18.java:4)

    // 1. 위의 내용으로 예외가 발생했을 당시 호출스택에 존재했던 메서드를 알수있다
    // 2. 예외가 발생한 위치는 method2 메서드이며, ExceptionEx18.java파일의 12번째 줄이다
    // 3. 발생한 예외는 ArithmeticException이며, 0으로 나누어서 예외가 발생했다
    // 4. method2메서드가 method1 메서드를 호출하였고 그 위치는 ExceptionEx18.java파일의 8번째 줄이다

    // 답 4. method1메서드가 method2메서드를 호출.
}

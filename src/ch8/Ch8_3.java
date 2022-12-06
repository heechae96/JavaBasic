package ch8;

import com.sun.jdi.InvalidLineNumberException;

public class Ch8_3 {
    // 다음 중 오버라이딩이 잘못된 것은?
    void add(int a, int b) throws InvalidLineNumberException, NotANumberException {
    }

    class NumberException extends Exception {
    }

    class InvalidNumberException extends NumberException {
    }

    class NotANumberException extends NumberException {
    }

    // 1. void add(int a, int b) throws InvalidNumberException, NotANumberException{}
    // 2. void add(int a, int b) throws InvalidNumberException{}
    // 3. void add(int a, int b) throws NotANumberException{}
    // 4. void add(int a, int b) throws Exception{}
    // 5. void add(int a, int b) throws NumberException{}

    // 답: 4,5
    // 조상보다 더 많은 예외를 선언하는것은 오버라이딩 조건 탈락
}

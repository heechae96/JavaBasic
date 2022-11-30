package ch7;

public class Ch7_6 {
    public static void main(String[] args) {
        // Outer클래스의 내부 클래스 Inner의 멤버변수 iv의 값을 출력하세요
        Outer outer = new Outer();

    }
}

class Outer{
    class Inner{
        int iv = 100;
    }
}

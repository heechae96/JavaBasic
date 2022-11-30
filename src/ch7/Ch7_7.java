package ch7;

public class Ch7_7 {
    public static void main(String[] args) {
        // Outer클래스의 내부 클래스 Inner의 멤버변수 iv의 값을 출력하시오
        Outer2 outer = new Outer2();
//        System.out.println(outer.Inner2.iv);

    }
}

class Outer2{
    static class Inner2{
        int iv = 200;
    }
}

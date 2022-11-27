package ch6;

public class Ch6_6 {
    public static void main(String[] args) {
        // 문제 6-4에서 작성한 클래스 메서드 getDistance()를 MyPoint클래스의 인스턴스메서드로 정의하시오
        MyPoint mp = new MyPoint(1,1);
        System.out.println(mp.getDistance(2,2));
    }
}

class MyPoint {
    int x, y;

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double getDistance(int x2, int y2) {
        return Math.sqrt((x - x2) * (x - x2) + (y - y2) * (y - y2));
    }
}

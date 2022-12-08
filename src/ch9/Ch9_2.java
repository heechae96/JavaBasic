package ch9;

public class Ch9_2 {
    // 다음과 같은 실행결과를 얻도록 Point3D클래스의 equals()를 멤버변수인 x,y,z의 값을 비교하도록 오버라이딩하고,
    // toString()은 실행결과를 참고해서 적절히 오버라이딩하시오

    // 실행결과
    // [1,2,3]
    // [1,2,3]
    // p1==p2?false
    // p1.equals(p2)?true
    public static void main(String[] args) {
        Point3D p1 = new Point3D(1, 2, 3);
        Point3D p2 = new Point3D(1, 2, 3);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println("p1==p2? " + (p1 == p2));
        System.out.println("p1.equals(p2)? " + p1.equals(p2));
    }
}

class Point3D {
    int x, y, z;

    Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    Point3D() {
        this(0, 0, 0);
    }

    @Override
    public boolean equals(Object obj) {
        // 주소 비교 -> 내용 비교
        if(obj instanceof Point3D){
            Point3D point3D = (Point3D) obj;
            return this.x==point3D.x && this.y==point3D.y && this.z== point3D.z;
        }
        return false;
    }

    @Override
    public String toString() {
        return "[" + this.x + "," + this.y + "," + this.z + "]";
    }
}

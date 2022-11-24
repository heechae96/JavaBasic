package ch2;

public class Ch2_8 {
    public static void main(String[] args) {
        // 아래는 변수 x,y,z의 값을 서로 바꾸는 예제이다.
        // 결과와 같이 출력되도록 (1)에 알맞은 코드를 넣으시오

        int x = 1;
        int y = 2;
        int z = 3;

        // (1)
        int tmp = x;
        x = y;
        y = z;
        z = tmp;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        // 결과
        // x = 2
        // y = 3
        // z = 1
    }
}

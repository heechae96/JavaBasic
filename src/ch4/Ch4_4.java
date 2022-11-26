package ch4;

public class Ch4_4 {
    public static void main(String[] args) {
        // 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때,
        // 몇까지 더해야 총합이 100이상 되는지 구하시오

        int sum = 0;
        int num = 1;
        int minus = 1;  // 부호

        for (int i = 1; sum < 100; i++, minus *= -1) {
            num = i * minus;
            sum += num;
        }

        System.out.println("num = " + num);
        System.out.println("sum = " + sum);
    }
}

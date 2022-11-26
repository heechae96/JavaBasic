package ch3;

public class Ch3_2 {

    public static void main(String[] args) {

        // 다음 연산의 결과를 적으시오
        int x = 2;
        int y = 5;
        char c = 'A';   // 65

        System.out.println(1 + x << 33);                // 6        // int 32비트이므로 1비트만 옮겨짐
        System.out.println(y >= 5 || x < 0 && x > 2);   // true
        System.out.println(y += 10 - x++);              // 13       // x는 3
        System.out.println(x += 2);                     // 5
        System.out.println(!('A' <= c && c <= 'Z'));    // false
        System.out.println('C' - c);                    // 2
        System.out.println('5' - '0');                  // 5
        System.out.println(c + 1);                      // 66
        System.out.println(++c);                        // B
        System.out.println(c++);                        // B
        System.out.println(c);                          // C
    }
}

package ch9;

import java.util.Scanner;
import java.util.Vector;
import java.util.regex.Matcher;

public class Ch9_6 {
    // 다음은 화면으로부터 전화번호의 일부를 입력받아 일치하는 전화번호를
    // 주어진 문 자열 배열에서 찾아서 출력하는 프로그램이다.
    // 알맞은 코드를 넣어 프로그램을 완성하시오.
    //[Hint] Pattern, Matcher클래스를 사용하라.
    public static void main(String[] args) {
        String[] phoneNumArr = {"012-3456-7890",
                "099-2456-7980",
                "088-2346-9870",
                "013-3456-7890"};
        Vector list = new Vector();
        Scanner s = new Scanner(System.in);

        // 검색결과를 담을 Vector
        while (true) {
            System.out.print(">>");
            String input = s.nextLine().trim(); // trim()으로 입력내용에서 공백을 제거
            if (input.equals("")) {
                continue;
            } else if (input.equalsIgnoreCase("Q")) {
                System.exit(0);
            }

            // 사이에 코드를 완성하시오



            if (list.size() > 0) { // 검색결과가 있으면
                // 검색결과를 출력하고
                System.out.println(list);
                // 검색결과를 삭제
                list.clear();
            } else {
                System.out.println("일치하는 번호가 없습니다.");
            }
        }
    } // main
}

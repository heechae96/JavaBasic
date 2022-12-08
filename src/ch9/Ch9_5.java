package ch9;

public class Ch9_5 {
    // 메서드명 : delChar
    // 기능 : 주어진 문자열에서 금지된 문자들을 제거하여 반환한다.
    // 반환타입 : String
    // 매개변수 : String src - 변환할 문자열
    //          String delCh - 제거할 문자들로 구성된 문자열

    // StringBuffer와 String클래스의 charAt(int i)과 indexOf(int ch)를 사용하라.

    public static String delChar(String src, String delCh){
        StringBuffer sb = new StringBuffer();
        return "";
    }

    public static void main(String[] args) {
        // (1!2@3^4~5) -> 12345
        System.out.println("(1!2@3^4~5)" + " -> " + delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
        // (1 2 3 4 5) -> (12345)
        System.out.println("(1 2 3 4\t5)" + " -> " + delChar("(1 2 3 4\t5)", " \t"));
    }
}

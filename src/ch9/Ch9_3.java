package ch9;

public class Ch9_3 {
    // 다음과 같이 정의된 메서드를 작성하고 테스트하시오.

    // 메서드명 : count
    // 기능 : 주어진 문자열(src)에 찾으려는 문자열(target)이 몇 번 나오는지 세어서 반환
    // 반환타입 : int
    // 매개변수 : String src, String target

    // 힌트. String클래스의 indexOf(Sting str, int fromIndex)

    public static int count(String src, String target) {
        int count = 0;
        int pos = 0;    // 찾기 시작할 위치
        while (true) {
            pos = src.indexOf(target, pos);
            if(pos!=-1){
//                System.out.println("pos = " + pos);
                count++;
                pos += target.length();
            }else{
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count("12345AB12AB345AB", "AB"));    // 3
        System.out.println(count("12345", "AB"));               // 0
    }
}

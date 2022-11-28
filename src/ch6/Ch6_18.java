package ch6;

public class Ch6_18 {
    public static boolean isNumber(String str){
        // 유효성 체크
        if(str.length()==0 || str==null){
            return false;
        }

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch<'0' || ch>'9'){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // 다음과 같이 정의된 메서드를 작성하고 테스트하시오
        // 메서드명: isNumber
        // 기능: 주어진 문자열이 모두 숫자로만 이루어져 있는지 확인
        //      모두 숫자로만 이루어져 있으면 true를 반환
        //      그렇지 않으면 false를 반환
        //      만일 주어진 문자열이 null이거나 빈 문자열 ""이라면 false를 반환
        // 반환타입: boolean
        // 매개변수: String str - 검사할 문자열

        String str = "123";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));

        str = "1234o";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));
    }
}

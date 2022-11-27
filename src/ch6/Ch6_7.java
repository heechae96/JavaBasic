package ch6;

public class Ch6_7 {
    public static void main(String[] args) {
        // 다음은 컴퓨터 게임의 병사(marine)를 클래스로 정의한 것이다.
        // 이 클래스의 멤버중에 static을 붙여야 하는것은 어떤 것들이고 그 이유는 무엇인가?
        // 단, 모든 병사의 공격력과 방어력은 같아야 한다

        // 답: int weapon, int armor
        //      모든 병사의 공격력과 방어력은 같아야 하므로
        // 답: weaponUp(), armorUp() 메서드
        //      static 변수인 weapon, armor를 다루므로
    }
}

class Marine {
    int x = 0, y = 0;   // x, y 좌표
    int hp = 60;        // 현재 체력
    static int weapon = 6; // 공격력
    static int armor = 0;  // 방어력

    static void weaponUp(){
        weapon++;
    }

    static void armorUp(){
        armor++;
    }

    void move(int x, int y){
        this.x = x;
        this.y = y;
    }
}

package ch6;

public class Ch6_5 {
    public static void main(String[] args) {
        // 다음의 코드에 정의된 변수들을 종류별로 구분해서 적으시오
        // iv : kind, num
        // cv : width, height
        // lv : k, n, args, card
    }
}

class PlayingCard{
    int kind;
    int num;

    static int width;
    static int height;

    PlayingCard(int k, int n){
        kind = k;
        num = n;
    }

    public static void main(String[] args){
        PlayingCard card = new PlayingCard(1,1);
    }
}

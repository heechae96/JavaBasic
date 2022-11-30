package ch7;

public class Ch7_2 {
    public static void main(String[] args) {

        SutdaDeck deck = new SutdaDeck();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ",");
        }

        System.out.println();
        System.out.println(deck.pick(0));
    }
}

class SutdaDeck {
    // 섯다카드 20장을 포함하는 섯다카드 한 벌(SutdaDeck클래스)을 정의한 것이다.
    // 섯다카드 20장을 담은 SutdaCard배열을 초기화 하시오.
    // 단, 섯다카드는 1부터 10까지의 숫자가 적힌 카드가 한 쌍씩 있고,
    // 숫자가 1,3,8인 경우에는 둘 중의 한 장은 광(Kwang)이어야 한다.
    // 즉, SutdaCard의 인스턴스 변수 isKwang의 값이 true이어야 한다

    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        // 7-1
        for (int i = 0; i < cards.length; i++) {
            int num = i % 10 + 1;
            boolean isKwang = false;
            if ((i < 10) && (num == 1 || num == 3 || num == 8)) {
                isKwang = true;
            }
            cards[i] = new SutdaCard(num, isKwang);
        }
    }

    // 7-2
    // 문제 7-1의 SutdaDeck클래스에 다음에 정의된 새로운 메서드를 추가하고 테스트 하시오

    // 메서드명: shuffle
    // 기능: 배열 cards에 담긴 카드의 위치를 섞는다(Math.random()사용)
    // 반환타입: 없음
    // 매개변수: 없음
    void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int random = (int) (Math.random() * cards.length);
            SutdaCard tmp;
            tmp = cards[i];
            cards[i] = cards[random];
            cards[random] = tmp;
        }
    }

    // 메서드명: pick
    // 기능: 배열 cards에서 지정된 위치의 SutdaCard를 반환한다
    // 반환타입: SutdaCard
    // 매개변수: int index - 위치
    SutdaCard pick(int index) {
        if (index < 0 || index > CARD_NUM){
            return null;
        }
        return cards[index];
    }

    // 메서드명: pick
    // 기능: 배열 cards에서 임의의 위치의 SutdaCard를 반환한다(Math.random()사용)
    // 반환타입: SutdaCard
    // 매개변수: 없음
    SutdaCard pick(){
        int random = (int) (Math.random() * cards.length);
        return cards[random];
    }

}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    // info()대신 Object클래스의 toString()을 오버라이딩했다.
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

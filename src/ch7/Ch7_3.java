package ch7;

public class Ch7_3 {
    public static void main(String[] args) {
        // 다음의 코드는 컴파일 하면 에러가 발생한다.
        // 그 이유를 설명하고 에러를 수정하기 위해서는 코드를 어떻게 바꾸어야 하는가?
        // 답: Tv클래스의 기본 생성자에서 컴파일러가 자동으로 super()을 호출하는데
        //      Product클래스에는 기본 생성자가 없어서 에러가 발생.
        //      -> Product클래스의 기본 생성자를 추가하면 에러 x

        Tv t = new Tv();
    }
}

class Product {
    int price;
    int bonusPoint;

    Product() {

    }

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv extends Product {
    Tv() {

    }

    public String tosString() {
        return "Tv";
    }
}

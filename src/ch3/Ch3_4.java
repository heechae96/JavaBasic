package ch3;

public class Ch3_4 {
    public static void main(String[] args) {
        // 아래의 코드는 사과를 담는데 필요한 바구니의 수를 구하는 코드이다
        // 만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면
        // 13개의 바구니가 필요할 것이다.

        int numOfApples = 123;  // 사과수
        int numOfBucket = 10;   // 바구니 크기

        int getNumOfBucket = numOfApples / numOfBucket
                                + ((numOfApples % numOfBucket == 0) ? 0 : 1);

        System.out.println("필요한 바구니의 수: " + getNumOfBucket);
    }
}

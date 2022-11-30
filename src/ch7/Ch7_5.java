package ch7;

public class Ch7_5 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();
        t.setChannel(10);
        System.out.println("CH: " + t.getChannel());    // 10
        t.setChannel(20);
        System.out.println("CH: " + t.getChannel());    // 20
        t.gotoPrevChannel();
        System.out.println("CH: " + t.getChannel());    // 10
        t.gotoPrevChannel();
        System.out.println("CH: " + t.getChannel());    // 20
    }
}

class MyTv2{
    // 문제 7-4에서 작성한 MyTv클래스에 이전 채널(previous channel)로 이동하는
    // 기능의 메서드를 추가해서 실행결과와 같은 결과를 얻도록 하시오
    // HINT) 이전 채널의 값을 저장할 멤버변수를 정의

    private int prevChannel;
    private boolean isPowerOn;
    private int channel;
    private int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    // MyTv클래스의 멤버변수 isPowerOn, channel, volume을 클래스 외부에서 접근 할 수 없도록
    // 제어자를 붙이고 대신 이 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록 getter와 setter메서드를 추가하라

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setChannel(int channel) {
        if (channel > MAX_CHANNEL || channel < MIN_CHANNEL) {
            return;
        } else {
            prevChannel = this.channel; // gotoPrevChannel()메소드에 사용 할 것
            this.channel = channel;
        }
    }

    public void setVolume(int volume) {
        if (volume > MAX_VOLUME || volume < MIN_VOLUME) {
            return;
        } else {
            this.volume = volume;
        }
    }

    // 메서드명: gotoPrevChannel
    // 기능: 현재 채널을 이전 채널로 변경
    // 반환타입: 없음
    // 매개변수: 없음

    public void gotoPrevChannel(){
        setChannel(prevChannel);
    }
}

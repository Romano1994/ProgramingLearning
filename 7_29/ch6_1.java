public class ch6_1 {
    public static void main(String[] args) {
       Tv t;
        t= new Tv();
        t.channel = 7;
        t.channelDown();
        System.out.printf("현재 채널은 %d 입니다%n", t.channel);
    }
}

class Tv {
    String color;
    boolean power;
    int channel;

    void power() {
        power = !power;
    }
    void channelUp() {
        ++channel;
    }
    void channelDown() {
        --channel;
    }
}

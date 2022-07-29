public class ch6_2 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();

        t1.channel = 5;
        System.out.println(t1.channel);
        System.out.println(t2.channel);

        t1 = t2;
        t1.channel = 3;
        System.out.println(t1.channel);
        System.out.println(t2.channel);

        t2.channel = 9;
        t1.channel = 6;
        System.out.println(t1.channel);
        System.out.println(t2.channel);
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


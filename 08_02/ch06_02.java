public class ch06_02 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();

        t1.channel = 6;
        t2.channel = 8;
        System.out.println(t1.channel);
        System.out.println(t2.channel);

        t1 = t2;
        System.out.println(t1.channel);
        System.out.println(t2.channel);

        t1.channel = 10;
        t2.channel = 13;
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
        channel++;
    }
    void channelDown() {
        channel--;
    }
}


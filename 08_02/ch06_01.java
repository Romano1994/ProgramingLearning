public class ch06_01 {
    public static void main(String[] args) {
        Tv t = new Tv();

        t.channel = 7;
        t.channelDown();
        System.out.println(t.channel);

        t.power = true;
        t.power();
        System.out.println(t.power);

        t.color = "red";
        System.out.println(t.color);
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

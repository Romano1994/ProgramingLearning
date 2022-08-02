public class ch06_03 {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();

        c1.kind = "Heart";
        c1.number = 3;
        c1.width = 50;
        c1.height = 100;
        System.out.println(c1.kind + c1.number + c1.width + c1.height);

        c2.kind = "Diamond";
        c2.number = 5;
        c2.width = 30;
        c2.height = 50;
        System.out.printf("%d %d%n", c2.width, c2.height);
        System.out.printf("%d %d",c1.width, c1.height);
    }
}

class Card {
    String kind;
    int number = 9;
    static int width = 100;
    static int height = 200;
}

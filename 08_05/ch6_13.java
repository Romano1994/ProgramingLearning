public class ch6_13 {
    public static void main(String[] args) {
        Car2 c2 = new Car2("white");
        System.out.println(c2.color);
    }
}

class Car2{
    String color;
    String gearType;
    int door;

    Car2(String c) {
        this("white", "auto", 4);
    }

    Car2(String c, String g, int d){
        this.color = c;
        this.gearType = g;
        this.door = d;
    }
}

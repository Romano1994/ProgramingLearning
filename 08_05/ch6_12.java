public class ch6_12 {
    public static void main(String[] args) {
        Car c = new Car("white", 4);
        System.out.println(c.color);
    }
}

class Car {
    String color;
    String gearType;
    int door;
    
    Car(){}

    Car(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }

    Car(String q, int e) {
        this(q, "auto", 4);
    }
}

public class CompositeTest {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.r = 10;
        c.pt.x = 9;
        System.out.println(c.pt.x);
    }
}

class MyPoint{
    int x;
    int y;
}

class Circle{
    MyPoint pt = new MyPoint();
    int r;
}
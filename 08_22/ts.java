/**
 * ts
 */
public class ts {
public static void main(String[] args) {
    Circle c = new Circle();
    c.x = 9;
    System.out.println(c.x);
}
    
}

/**
 * InheritanceTest
 */
class Mypoint{
    int x;
    int y;
    
}

class Circle extends Mypoint{
    int r;
}

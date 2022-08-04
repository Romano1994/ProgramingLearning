/**
 * ch6_9
 */
public class ch6_9 {

    public static void main(String[] args) {
        MyMath mm = new MyMath();
        mm.a = 6;
        mm.b = 3;
        System.out.println(mm.add());
        System.out.println(mm.subtract());
        System.out.println(mm.multiply());
        System.out.println(mm.divide());

        System.out.println(MyMath.add1(4, 2));
        System.out.println(MyMath.subtract1(4, 2));
        System.out.println(MyMath.multiply1(4, 2));
        System.out.println(MyMath.divide1(4, 2));
    }
}

class MyMath {
    long a, b;
    long add() {return a + b;}
    long subtract() {return a - b;}
    long multiply() {return a * b;}
    long divide() {return a / b;}

    static long add1 (long a, long b) {return a + b;}
    static long subtract1(long a, long b) {return a - b;}
    static long multiply1(long a, long b) {return a * b;}
    static long divide1(long a, long b){return a / b;}

}
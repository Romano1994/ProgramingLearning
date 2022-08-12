package lecture;
public class sbs12_01 {

    public static void main(String[] args) {
        Util.m1();
        // Util.m2();
        Util util = new Util();
        util.m2();
    }
}

class Util{
    static void m1(){
        System.out.println("m1");
    }
    void m2(){
        System.out.println("m2");
    }
}
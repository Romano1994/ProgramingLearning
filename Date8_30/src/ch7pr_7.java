public class ch7pr_7 {
    public static void main(String[] args) {
        Outer2.Inner2 inner2 = new Outer2.Inner2();
        System.out.println(inner2.iv);
    }
}
class Outer2{
    static class Inner2{
        int iv = 200;
    }
}
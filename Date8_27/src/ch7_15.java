public class ch7_15 {
    public static void main(String[] args) {
        Outer oc = new Outer();
        Outer.InstanceInner ii = oc.new InstanceInner();
        //인스턴스 내부 클래스를 이용하려면 먼저 외부 클래스의 객체를 만들고
        //외부 클래스의 객체로 내부 클래스의 객체를 만든다
        System.out.println("ii.iv = " + ii.iv);
        System.out.println("cv = "+Outer.StaticInner.cv);
//        System.out.println("staticInner.iv" + Outer.StaticInner.iv);

        Outer.StaticInner si = new Outer.StaticInner();
        //내부 static 클래스는 외부 클래스의 객체를 만들지 않고 만들 수 있음
        //하지만 객체 명 앞에 외부 클래스의 이름 밝혀야한다
        System.out.println("staticInner.iv = " +si.iv);
    }
}
class Outer{
    class InstanceInner{
        int iv = 100;
    }
    static class StaticInner{
        int iv = 200;
        static int cv = 300;
    }
    void myMethod(){
        class LocalInner{
            int iv = 400;
        }
    }
}
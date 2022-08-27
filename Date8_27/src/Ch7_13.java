public class Ch7_13 {
    class InstanceInner{}
    static class StaticInner{}

    InstanceInner iv = new InstanceInner(); //인스터스 멤버끼리는 직접적인 접근이 가능하다
    StaticInner cv = new StaticInner(); //클래스 멤버끼리는 직접적인 접근이 가능하다

    static void staticMethod(){
//        InstanceInner obj1 = new InstanceInner(); //static 메서드에서 인스턴스 멤버에 접근할 수 없다
        StaticInner obj2 = new StaticInner();
        // 스태틱 메서드 안에서 인스턴스 멤버를 접근하려면 객체를 생성하면 된다. 하지만 잘 안씀
        Ch7_13 outer = new Ch7_13();
        InstanceInner obj1 = outer.new InstanceInner();
    }
    void instanceMethod(){
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();
//        LocalInner lv2 = new LocalInner():    //지역 변수는 접근 불가
    }
    void myMethod(){
        class LocalInner{
            LocalInner lv = new LocalInner();
        }
    }

}

class InnerClass{
    class InstanceInner{
        int iv = 100;
        static int cv = 101;
        static final int CONST = 100;
    }
    static class StaticInner{
        int iv = 200;
        static int cv = 200;
    }
    void myMethod(){
        class LocalInner{
            int iv = 300;
            static int cv = 300;
            final static int CONST = 300;
        }
    }

}

class ch7_12 {
    public static void main(String[] args) {
        System.out.println(InnerClass.InstanceInner.cv);
        System.out.println();
    }
}

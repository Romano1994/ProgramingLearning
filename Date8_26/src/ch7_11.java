public class ch7_11 {
    public static void main(String[] args) {
        Child3 child3 = new Child3();
        child3.method1();
        child3.method2();
        MyInterface.staticMethod();
        MyInterface2.staticMethod();
    }
}
class Child3 extends Parent3 implements MyInterface2, MyInterface{
    public void method1(){
        System.out.println("Method1() in child3");
    }
}
class Parent3{
    public void method2(){
        System.out.println("method2() in Parent3");
    }
}
interface MyInterface{
    default void method2(){
        System.out.println("method2() in MyInterface");
    }
    default void method1(){
        System.out.println("method1() in MyInterface");
    }
    static void staticMethod(){
        System.out.println("static method() in MyInterface");
    }
}
interface MyInterface2{
    default void method1(){
        System.out.println("method1() in MyInterface2");
    }
    static void staticMethod(){
        System.out.println("static method() in MyInterface2");
    }
}
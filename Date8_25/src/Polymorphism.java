interface Animal {
    public abstract void cry();
}
interface Cat extends Animal{
    public abstract void cry();
}
interface Dog extends Animal{
    public abstract void cry();
}
class MyPet implements Cat, Dog{
    public void cry(){
        System.out.println("멍멍 야옹");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        MyPet mypet = new MyPet();
        mypet.cry();
    }
}

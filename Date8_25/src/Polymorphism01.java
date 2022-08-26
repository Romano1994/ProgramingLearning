abstract class Animal1{
    abstract void cry();
}
abstract class Cat1 extends Animal1{
    abstract void cry();
}
abstract class Dog1 extends Animal1{
    abstract void cry();
}
class MyPet1 extends Cat1{
    void cry(){
        System.out.println("야옹");
    }
}
class Polymorphism01{
    public static void main(String[] args) {
        MyPet1 mypet = new MyPet1();
        mypet.cry();
    }
}
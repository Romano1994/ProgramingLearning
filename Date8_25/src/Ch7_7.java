public class Ch7_7 {
    public static void main(String[] args) {
//        FireEngine fe2 = new FireEngine();
//        Car c1 = new Car();
//        System.out.println(c1);
//        fe2.doWork(c1);
//        System.out.println(c1);
        double d = 3.14;
        int i = (int) d;
        System.out.println(i);
    }
}

class Car{
    String color;
    int door;

    void drive(){
        System.out.println("drive brrrrrrr~");
    }
    void stop(){
        System.out.println("stop!!");
    }
}

class FireEngine extends Car{
    void water(){
        System.out.println("water!!!");
    }
    void doWork(Car c){
        if (c instanceof FireEngine){
            FireEngine fe = (FireEngine) c;
        }
    }
}
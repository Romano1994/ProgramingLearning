public class Ch7_7 {
    public static void main(String[] args) {
    Car2 car = null;
    FireEngine2 fe = new FireEngine2();
    FireEngine2 fe2 = null;

    fe.water();
    car = fe;   // FireEngine2를 Car2로 형변환
//    car.water(); // water메서드는 FireEngine2에 들어있으므로 car로 사용 불가
    fe2 = (FireEngine2) car; // car2를 fe2로 형변환
    fe2.water(); // fe2에 null이 아닌 다른 값이 들어왔기 때문에 water()사용 가능
    }
}

class Car2 {
    String color;
    int door;

    void drive(){
        System.out.println("drive, brrrr~");
    }
    void stop(){
        System.out.println("stop!!!");
    }
}
class FireEngine2 extends Car2{
    void water(){
        System.out.println("water!!!");
    }
}
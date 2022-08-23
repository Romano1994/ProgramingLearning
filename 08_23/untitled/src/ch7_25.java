public class ch7_25 {
    public static void main(String[] args) {
        FireEngine f = new FireEngine();
        System.out.println(f);  //FireEngine@28a418fc
        Car c = (Car) f;
        System.out.println(c);  //FireEngine@28a418fc
        Ambulance a = (Ambulance) c;
        System.out.println(a);  //에러: 결론적으로는 FireEngine이 Ambulance로 형변환 됐기 때문이다

    }
}

class Car{
    Car(){}
}
class FireEngine extends Car{
    FireEngine(){}
}
class Ambulance extends Car{
    Ambulance(){}
}

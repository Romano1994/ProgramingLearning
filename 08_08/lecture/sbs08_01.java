
/**
 * 08_01
 */
public class sbs08_01 {
    public static void main(String[] args) {
        
    Car c1 = new Car();
    c1.cal("tesla", "white");
    }
}

class Car {
    void cal(String n, String c){
        System.out.println(n + c);
    }

}
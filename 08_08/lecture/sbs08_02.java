/**
 * sbs08_02
 */
public class sbs08_02 {

    public static void main(String[] args) {
        Car2 c2 = new Car2();
        c2.cal("volvo", "white");
    }
}

class Car2{

    void cal(String n, String c){
        System.out.println(n + c);
    }
}
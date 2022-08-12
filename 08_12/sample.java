public class sample {
    public static void main(String[] args) {
        Test.calculate("truck", 5);
    }
}

class Test{
    int one;
    int two;

    static void calculate(String str, int one){
        String car = str;
        int two = one;
        System.out.println(car + one);
    }
}

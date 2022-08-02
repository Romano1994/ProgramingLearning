public class ch06_04 {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long result1 = mm.add(5,6);
        System.out.println(result1);

        long result2 = mm.subtract(5, 6);
        System.out.println(result2);

        long result3 = mm.multiply(5, 6);
        System.out.println(result3);

        double result4 = mm.divide(5, 6);
        System.out.println(result4);
    }
}

class MyMath{
    long add(long a, long b){
        return a + b;
    }
    long subtract(long a, long b){
        return a - b;
    }
    long multiply(long a, long b){
        return a * b;
    }
    double divide(float a, float b){
        return a / b;
    }
}
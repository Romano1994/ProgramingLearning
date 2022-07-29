public class ch6_4 {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long result1 = mm.add(5L, 3L);
        long result2 = mm.substract(5L, 3L);
        long result3 = mm.multifly(5L, 3L);
        double result4 = mm.divide(5L, 3L);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(mm.max(6));

    }
}

class MyMath{
    long add (long a, long b) {
        long result = a + b;
        return result;
    }
    long substract(long a, long b) {return a - b;}
    long multifly (long a, long b) {return a * b;}
    double divide (double a, double b) {return a / b;}

    String max (int a) {
        return (a%2==0)? "Even" : "Odd";
    }
}
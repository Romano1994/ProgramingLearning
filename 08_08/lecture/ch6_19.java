public class ch6_19 {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        System.out.println(mm.add(3, 5));
    }
}

class MyMath{
    int a;
    int b;

    long add(long c ,long d){
        long result = c + d;
        return result;
    }
}
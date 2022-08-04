public class ch6_11 {
    public static void main(String[] args) {
        Data_1 d1 = new Data_1();
        Data_2 d2 = new Data_2();
        d2.ddd(3);
        System.out.println(d2.ddd(5));
    }
}

class Data_1 {
    int value;
}

class Data_2 {
    int value;

    int ddd(int x){
        value = x;
        return value;
    }
}

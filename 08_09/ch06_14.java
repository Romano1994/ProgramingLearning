
class MyMath2 {
    public static void main(String[] args) {
        Mm m1 = new Mm();
        System.out.println(m1.iv);
    }
}

class Mm{
    static int cv = 1;
    int iv = 1;
    static {
        cv = 2;
    }
    Mm(){
        iv = 2;
    }
    
}

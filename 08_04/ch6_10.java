public class ch6_10 {
    public static void main(String[] args) {
        MyMath3 mm = new MyMath3();
        System.out.println(mm.add(3, 3));
        System.out.println(mm.add(3, 3L));

        int[] a = {100, 200, 300};
        System.out.println(mm.add(a));
    }
}

class MyMath3{
    // int add (int a, int b){
    //     System.out.print("int add(int a, int b) - ");
    //     return a + b;
    // }
    long add (int a, long b){
        System.out.print("long add(int a, long b) - ");
        return a + b;
    }
    int add(int[] a) {
        System.out.print("int add(int [] a) - ");
        int result = 0;
        for(int i = 0; i < a.length; i++){
            result += a[i];
        }
        return result;
    }


}

public class ch4p4 {
    public static void main(String[] args) {
        int sum = 0;
        int x = 1;

        for (int i =0; sum < 100; i++) {
            if (i%2!=0){
                x = i;
            } else if (i%2==0) {
                x = -i;
            }
            sum += x;
        }
        System.out.println(x);
    }
}

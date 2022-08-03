public class sbs3_02 {
    public static void main(String[] args) {
        int i = 2;
        int j = 1;
        while (i <= 9) {
            while (j <= 9){
                System.out.printf("%d * %d = %d%n", i, j, i*j);
                j++;
            }
            i++;
        }
    }
}

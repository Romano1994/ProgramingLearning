public class ch4_17 {
    public static void main(String[] args) {
        int sum = 1;
        int i = 1;
        while (sum < 100) {
            System.out.printf("%d - %d%n", i , sum);
            sum += ++i;
        }
    }
}

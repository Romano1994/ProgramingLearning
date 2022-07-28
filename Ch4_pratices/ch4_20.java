import java.text.BreakIterator;

public class ch4_20 {
    public static void main(String[] args) {
        int i = 1;
        int sum1 = 1;
        int sum2 = 1;

        while (true) {
            i++;
            sum2 += i;
            if (sum2 > 100) {
                --i;
                System.out.printf("%d - %d%n", i, sum1);
                break;
            }
            sum1 += i;
        }
        // System.out.printf("%d - %d%n", i, sum2);
    }
}

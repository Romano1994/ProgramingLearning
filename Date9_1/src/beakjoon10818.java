import java.util.Arrays;
import java.util.Scanner;

public class beakjoon10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
        }
        int maxNum = a[0];
        int minNum = a[0];
        for(int i = 0; i < n; i++){
            if(a[i] > maxNum){
                maxNum = a[i];
            } else if(a[i] < minNum){
                minNum = a[i];
            }
        }
        System.out.print(minNum +" " + maxNum);
    }
}

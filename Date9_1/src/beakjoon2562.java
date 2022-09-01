import java.util.Arrays;
import java.util.Scanner;

public class beakjoon2562 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[9];
        Scanner scanner = new Scanner(System.in);
        int maxNum = 0;
        for (int i = 0; i < 9; i++){
            arr[i] = scanner.nextInt();
            if(arr[i] > maxNum){
                maxNum = arr[i];
            }
        }
        int count = Arrays.asList(arr).indexOf(maxNum);
        System.out.println(maxNum);
        System.out.println(count+1);
    }
}

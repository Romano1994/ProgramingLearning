import java.util.Scanner;

public class beakjoon_1110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int count = 0;
        int save;
        save = x;

        do{
            x = (x%10)*10 + ((x%10) + (x/10))%10;
            count++;
        }while (x != save);
        System.out.println(count);
    }
}

import java.util.Scanner;

public class beakjoon1110_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int copy = x;
        int count = 0;
        // int num;

        do{
            x = ((x%10)*10) + ((x%10 + x/10)%10);
            count ++ ;
        }while(copy !=  x);
        System.out.println(count);
    }
}

import java.util.Scanner;

/**
 * beakjoon1330
 */
public class beakjoon1330 {

    public static void main(String[] args) {
        int A = 0;
        int B = 0;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();


        if(A > B){
            System.out.println(">");
        } else if (A < B) {
            System.out.println("<");
        } else if (A == B){
            System.out.println("==");
        }

    }
}
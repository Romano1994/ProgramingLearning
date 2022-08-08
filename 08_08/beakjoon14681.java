import java.util.Scanner;

/**
 * beakjoon14681
 */
public class beakjoon14681 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        

        if(0 < x && 0 < y){
            System.out.println(1);
        } else if(0 < x && 0 > y) {
            System.out.println(4);
        } else if (0 > x && 0 > y) {
            System.out.println(3);
        } else if (0 > x && 0 < y) {
            System.out.println(2);
        }
    }
}
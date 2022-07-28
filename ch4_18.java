import java.util.Scanner;

public class ch4_18 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        System.out.println("숫자를 입력하세요");
        
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        i = Integer.parseInt(tmp);

        while (i >= 1) {
            sum += i%10;
            System.out.println(sum);
            i /= 10;
        }
    }
}

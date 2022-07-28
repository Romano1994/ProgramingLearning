import java.util.Scanner;

public class ch4_23 {
    public static void main(String[] args) {
        int num = 0;
        System.out.println("숫자를 입력하세요");

        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        Loop1 : for(int i = num; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.println(i+"*"+j+"="+i*j);
            }
        }
    }
}

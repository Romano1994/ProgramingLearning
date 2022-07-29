import java.util.Scanner;

public class ch4_19 {
    public static void main(String[] args) {
        int num = 0;
        int answer = (int)(Math.random()*100) + 1;
        System.out.println("숫자를 입력해 주세요");
        
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        num = Integer.parseInt(tmp);

        do {
            if (num > answer) { 
                System.out.println("더 작은 값을 입력하세요");
            } else if (num < answer) {
                System.out.println("더 큰 값을 입력하세요");
            }
        } while (num != answer);
        System.out.println("정답입니다");
    }
}

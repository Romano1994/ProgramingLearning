import java.util.Scanner;

public class ch4_11 {
    public static void main(String[] args) {
        int month = 0;
        System.out.print("현재의 월을 입력해주세요");
        Scanner scanner = new Scanner(System.in);
        month = scanner.nextInt();

        switch (month) {
            case 1: case 2: case 3:
                System.out.println("현재는 1분기 입니다");
                break;
            case 4: case 5: case 6:
                System.out.println("현재는 2분기 입니다");
                break;
            case 7: case 8: case 9:
                System.out.println("현재는 3분기 입니다");
                break;
            case 10: case 11: case 12:
                System.out.println("현재는 4분기 입니다");    
                break;
        }
    }
}

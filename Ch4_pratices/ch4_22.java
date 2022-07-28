import java.util.Scanner;

public class ch4_22 {
    public static void main(String[] args) {
        int menu = 0;
        int num = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.println("원하는 메뉴를 입력하세요");
            menu = scanner.nextInt();

            if (menu == 0) {
                System.out.println("종료합니다.");
                break;
            } else if (!(1<= menu && menu <=3)) {
                System.out.println("메뉴를 잘못 선택하셨습니다");
            } else if (1<= menu && menu <=3){
                System.out.printf("선택하신 메뉴는 %d번 입니다 %n",menu);
            }

        }
    }
}

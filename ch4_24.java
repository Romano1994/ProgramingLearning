import java.util.Scanner;

public class ch4_24 {
    public static void main(String[] args) {
        int menu = 0;
        int num = 0;
        Scanner scanner = new Scanner(System.in);

        outer:
        while(true) {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.println("메뉴의 번호를 입력해 주세요 (0)종료");
            String tmp= scanner.nextLine();
            menu = Integer.parseInt(tmp);

            if(menu == 0) {
                System.out.println("시스템을 종료합니다");
                break outer;
            } else if (!(1<= menu&&menu <=3)) {
                System.out.println("메뉴를 다시 입력해주세요");
                continue;
            } for(;;) {
                System.out.println("계산할 메뉴를 선택해주세요 (계산종료 : 0, 전체종료 : 0");
                tmp = scanner.nextLine();
                num = Integer.parseInt(tmp);
    
                if (num == 0){
                    System.out.println("계산을 종료합니다");
                    break;
                } else if (num == 99) {
                    System.out.println("전체 종료합니다");
                    break outer;
                }
                switch (num) {
                    case 1:
                        System.out.println("계산할 값 : " + num * num);
                        break;
                    case 2:
                    System.out.println("계산할 값 : " + num * num);
                        break;
                    case 3:
                    System.out.println("계산할 값 : " + num * num);
                        break;
                }
            } 
        }
            
    }
}

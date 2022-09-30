import java.util.ArrayList;
import java.util.Scanner;

public class SungukService2 {
	private ArrayList<SungJukDTO2> list = new ArrayList<SungJukDTO2>();
	public void menu() {
		Scanner scan = new Scanner(System.in);
		int num;
		SungJuk2 sungJuk;
		
		while(true) {
			System.out.println();
			System.out.println("*************");
			System.out.println("1. 입력 ");
			System.out.println("2. 출력 ");
			System.out.println("3. 수정 ");
			System.out.println("4. 삭제 ");
			System.out.println("6. 종료 ");
			System.out.println("*************");
			System.out.print(" 번호 : ");
			num = scan.nextInt();
			
			if(num == 6) break;
			if(num == 1) {
				sungJuk = new SungJukInsert2();
			}else if(num == 2) {
				sungJuk = new SungJukList2();
			}else if(num == 3) {
				sungJuk = new SungJukUpdate2();
			}else if(num == 4) {
				sungJuk = new SungJukDelete2();
				
			}else if(num == 5) {
				sungJuk = new SungJukSort2();
				
			}else {
				System.out.println("번호를 다시 입력하세요");
				continue;
			}
			sungJuk.execute(list);
		} //while
	} //menu
}

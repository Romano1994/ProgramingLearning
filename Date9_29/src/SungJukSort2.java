import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SungJukSort2 implements SungJuk2 {

	@Override
	public void execute(ArrayList<SungJukDTO2> list) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		while(true) {
			System.out.println();
			System.out.println("*************");
			System.out.println("1. 총점으로 내림차순");
			System.out.println("2. 이름으로 오름차순");
			System.out.println("3. 이전 메뉴");
			System.out.println("*************");
			System.out.print("메뉴 : ");
			num = scan.nextInt();
			Comparator<SungJukDTO2> com = null;
			
			if(num == 3) break;
			if(num == 1) {
				com = new Comparator<SungJukDTO2>() {		
					@Override
					public int compare(SungJukDTO2 s1, SungJukDTO2 s2) {
						return s1.getTot() < s2.getTot() ? 1 : -1;
					}
				};
			}else if(num == 2) {
				com = new Comparator<SungJukDTO2>() {		
					@Override
					public int compare(SungJukDTO2 s1, SungJukDTO2 s2) {
						return s1.getName().compareTo(s2.getName());
					}
				};
			}
			Collections.sort(list, com);
		}
		
	}

}

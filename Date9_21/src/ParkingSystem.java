import java.awt.Point;
import java.util.Scanner;

public class ParkingSystem {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean[] ar = new boolean[5];
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("\t주차관리시스템");
			System.out.println("***********************");
			System.out.println("\t1. 입차");
			System.out.println("\t2. 출차");
			System.out.println("\t3. 리스트");
			System.out.println("\t4. 종료");
			System.out.println("***********************");
			System.out.println("\t메뉴 : ");
			num = scan.nextInt();
			if(num == 4 ) break;
			if(num < 1 || num > 4 ) {
				System.out.println("1 ~ 4번까지 입력하세요");
				continue;
			}
			if(num == 1) {
				System.out.println("위치입력 : ");
				int position = scan.nextInt();
				
				if(ar[position-1]) {
					System.out.println("이미 주차중입니다");
				}else {
					ar[position-1] = true;
					System.out.println(position + "위치에 입차");
				}
			
			}else if (num == 2) {
				System.out.println("위치입력 : ");
				int position = scan.nextInt();
				if(ar[position-1]) {
					System.out.println(position + "에서 출차");
					ar[position-1] = false;
				}else {
					System.out.println("비어있습니다");
				}
			}else if (num == 3) {
				for(int i = 0; i < ar.length; i++) {
					System.out.println((i+1) + "위치 : " + ar[i]);
				}
			}
		}//while
	}
}

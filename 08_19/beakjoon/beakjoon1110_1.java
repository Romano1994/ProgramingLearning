package beakjoon;

import java.util.Scanner;

public class beakjoon1110_1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int num = 0;
		int count = 0;
		
		for(int i=1; x != num; count++) {
			int tmp = (x/10 + x%10)%10;
			num = (x%10)*10 + tmp;		
		}
		
//		while(true) {
//			int tmp = (x/10 + x%10)%10;
//			num = (x%10)*10 + tmp;
//			count += 1;
//			if (num == x) {
//				break;
//			}
//		}
		
	}

}

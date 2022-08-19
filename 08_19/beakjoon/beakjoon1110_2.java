package beakjoon;

import java.util.Scanner;

public class beakjoon1110_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int copy = x;
		int count = 0;
		
		do {
			x = ((x%10)*10) + (((x/10)+(x%10))%10);
			count +=1;
		}while(copy != x);
		System.out.println(count);
//		while(true) {
//			x = ((x%10)*10) + (((x/10)+(x%10))%10);
//			count +=1;
//			
//			if(copy == x) {
//				break;
//			}
//		}
	}

}

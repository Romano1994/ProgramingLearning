package if_;

import java.util.Scanner;

public class if_03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if(a > b) {
			if(a > c) {
				if(b > c) {
					System.out.println(a + " " + b + " " + c);
				}else if(b < c) {
					System.out.println(a + " " + c + " " + b);
				}
			}else if (a < c) {
				System.out.println(c + " " + a + " " + b);
			}
		}else if(c > b) {
			if(c > a) {
				if(a < b) {
					System.out.println(c + " " + b + " " + a);
				}
			}
		}
	}
}

/*if(a <= b && a <= c){
 * 		if(b <= c){
 * 			System.out.println(c + " " + b + " " + a);
 * 		}else if(b >= c){
 * 			System.out.println(b + " " + c + " " + a);
*/

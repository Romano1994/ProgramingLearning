
package for_;

import java.util.Scanner;

public class For02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dan = scan.nextInt();

		for (int j = 1; j <= 9; j++) {
			System.out.println(dan + " * " + j + " = " + dan * j);
		}

	}
}

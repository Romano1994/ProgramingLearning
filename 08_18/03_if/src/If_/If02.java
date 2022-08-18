package If_;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("a의 값을 입력 :");
		int a = scan.nextInt();
		System.out.print("b의 값을 입력 :");
		int b = scan.nextInt();
		
		String result = a > b ? "큰값 = " + a : "큰값 = " + b;
		System.out.println(result);
		System.out.println("큰값 = "+ Math.max(a, b));
		
	}

}

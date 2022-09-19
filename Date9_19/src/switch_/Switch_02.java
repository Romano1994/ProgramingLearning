package switch_;

import java.util.Scanner;

public class Switch_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int scoreA = scan.nextInt();
		int scoreB = scan.nextInt();
		String operator = scan.next();
		
		switch (operator) {
		case "+": System.out.println(scoreA + scoreB);
			break;
		case "-": System.out.println(scoreA - scoreB);
			break;
		case "*": System.out.println(scoreA * scoreB);
			break;
		case "/" : System.out.println((double)scoreA / scoreB);
			break;
		default: System.out.println("잘못된 값을 입력하셨습니다");
			break;
		}
	}
}

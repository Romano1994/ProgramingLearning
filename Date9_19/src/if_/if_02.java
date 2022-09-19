package if_;

import java.util.Scanner;

public class if_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int scoreA = scan.nextInt();
		int scoreB = scan.nextInt();
		int scoreC = scan.nextInt();
		int avg = (scoreA + scoreB + scoreC) / 3;
		
		if((avg >= 60)) {
			if((scoreA >= 40) && (scoreB >= 40) && (scoreC >= 40)) {
				System.out.println("합격");
			}else if ((scoreA < 40) || (scoreB < 40) || (scoreC < 40)) {
				System.out.println("과락으로 불합격");
			}
		}else{
			System.out.println("불합격");
		}
	}
}

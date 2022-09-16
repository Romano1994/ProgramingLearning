package Operator;

import java.util.Scanner;

public class Operator02 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하시오");
		int score = scanner.nextInt();
		
		String result = score >= 80 && score <= 100 ? "합격" : "불합격";
		System.out.println(score >= 80 && score <= 100 ? "합격" : "불합격");
		System.out.println(result);
	}
}

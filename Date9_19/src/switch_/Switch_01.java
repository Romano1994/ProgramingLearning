package switch_;

import java.util.Scanner;

public class Switch_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("월 입력 : ");
		int month = scan.nextInt();
		int day;
		
		switch (month) {
		case 1, 5, 7, 8, 10, 12: day = 31; break;
		case 2 : day = 28; break;
		case 4, 6, 9, 11: day = 30; break;
		default: day = 0;
		}
		System.out.println(day);
	}
}

package If_;

import java.util.Scanner;

public class If01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("객체 =" + scanner);
		// => 객체의 주소가 생성
		
		System.out.print("a의 값을 입력 : ");
		int a = scanner.nextInt();
		// int a = 35;
		String result = a >= 50? a+"는 50보다 크거나 작다" : a+"는 50보다 작다";
		System.out.println(result);
	}

}

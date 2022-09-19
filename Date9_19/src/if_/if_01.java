package if_;

import java.util.Scanner;

public class if_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("데이터 입력 : ");
//		int a = scan.nextInt();
		
//		if (a >= 50) System.out.println(a + "는 50보다 크거나 같다 ");
//		else System.out.println(a + "는 50보다 작다 ");
//		System.out.println();
		
		if(true)
			if (true) System.out.println("A");
			else System.out.println("B");
		System.out.println("C");
		
		if(true)
			if (false) System.out.println("A");
			else System.out.println("B");
		System.out.println("C");
		
		if(false)
			if (false) System.out.println("A");
			else System.out.println("B");
		System.out.println("C");
		
		char ch = 't';
		if(ch >= 'A' && ch <= 'Z') System.out.println((char)(ch+32) + "는 소문자");
		else if(ch >= 'a' && ch <= 'z') System.out.println((char)(ch-32) + "는 대문자");
	}
}

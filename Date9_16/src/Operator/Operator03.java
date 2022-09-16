package Operator;

import java.util.Scanner;

public class Operator03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오");
		int num = scanner.nextInt();
		
		int even = num % 2;
		int odd = num % 3;
		
		String evenCheck = even == 0? "짝수" : "홀수";
		String commonMultiple = even == odd ? "공배수이다" : "공배수가 아니다";
		System.out.println(num + "은 " + evenCheck +"이다.");
		System.out.println(num + "은 2와 3의 " + commonMultiple);
		
//		String even = num%2 == 0? "짝수" : "홀수";
//		String commonMultiple = (num % 2) == (num % 3) ? "공배수이다" : "공배수가 아니다";
//		
//		System.out.println(num + "은 " + even +"이다.");
//		System.out.println(num + "은 2와 3의 " + commonMultiple);
	}
}

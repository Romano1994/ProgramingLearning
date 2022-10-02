package exception;

import java.util.Scanner;

public class ExceptionMain {
	public static void main(String[] args) {
		if(args.length > 0) {
			System.out.println("args[0] = " + args[0]);
			
		}
		System.out.println();
		
		try {
			Scanner scan = new Scanner(System.in);
			
			System.out.print("숫자 입력 : ");
			int num2 = scan.nextInt();
			int num = Integer.parseInt(args[0]);
			
			System.out.println(num +"/"+num2+"="+(num/num2));
			
		} catch (NumberFormatException e){
			System.out.println("숫자만 입력 가능합니다");
			e.printStackTrace();
		} catch(ArithmeticException e2) {
			System.out.println("0보다 큰 숫자만 입력 가능합니다");
			e2.printStackTrace();
		} finally {
			System.out.println("error가 있건 없건 무조건 실행");
		}
	}
}

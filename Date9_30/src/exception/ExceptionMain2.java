package exception;

import java.util.Scanner;

public class ExceptionMain2 {
	public static void main(String[] args) {
		ExceptionMain2 main2 = new ExceptionMain2();
		main2.input();
		main2.output();
		
	}
	int x, y;
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("x의 값 입력 : ");
		x = scan.nextInt();
		System.out.println("y의 값 입력 : ");
		y = scan.nextInt();
	}
	
	public void output() {
		if(y >= 0) {
			int tmp = 1;
			for(int i=1; i<=y; i++) {
				tmp *= x;
			}
			
			System.out.println(x);
		} else {
//			System.out.println("y는 0보다 커야 한다");
			try {
				throw new Exception("y는 0보다 크거나 같아야 한다");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
}

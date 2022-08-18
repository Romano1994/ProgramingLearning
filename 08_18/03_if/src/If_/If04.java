package If_;

import java.util.Scanner;

public class If04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = (int)(Math.random()*100)+1;
		int b = (int)(Math.random()*100)+1;
		System.out.printf("%d + %d = ",a,b);
		int dap = scan.nextInt();
			
		if(dap == a + b) {
			System.out.println("딩동댕");
		}else {
			System.out.printf("틀렸습니다 답은 %d", a+b);
		}
		
	}

}

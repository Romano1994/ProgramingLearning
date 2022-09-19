package for_;

import java.util.Scanner;

public class For07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int a = scan.nextInt();
		int num = 1;
		
		for(int i=1; i <= a; i++) {
			num *= i;
		}
		System.out.print(a + "! = ");
		System.out.println(num);
	}
}
/*
 * For07.java
[문제] 팩토리얼을 구하시오 (for)
- 입력되는 숫자는 1 ~ 10 사이만 입력한다.

[실행결과]
숫자 입력 : 3
3! = 6 (1*2*3)
-------------------------
숫자 입력 : 9
9! = 362880 (1*2*3*...*9)
 */

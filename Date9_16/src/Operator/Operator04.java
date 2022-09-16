package Operator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Operator04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();

		System.out.print("이름 입력 : ");
		String name = scanner.nextLine();
		System.out.print("직급 입력 : ");
		String rank = scanner.nextLine();
		System.out.print("기본급 입력 : ");
		int basicSalary = scanner.nextInt();
		System.out.print("수당 입력 : ");
		int bonus = scanner.nextInt();
		
		int add = basicSalary + bonus;
		double tax2 = add >= 3000000 ? add*0.02 : add*0.01;
		double tax1 = add >= 5000000 ? add*0.03 : tax2;
		System.out.println("*** " + name + " " + rank + " 월급");
		System.out.println("기본급 : " + df.format(basicSalary) );
		System.out.println("수당 : " + df.format(bonus));
		System.out.println("합계 : " + df.format(add));
		System.out.println("세금 : " + df.format((add >= 5000000 ? tax1 : tax2)));
		System.out.println("월급 : " + df.format((add >= 3000000 ? add - tax1 : add - tax2)));
	}
}
/*
단 합계가 5,000,000원 이상이면 3%
       3,000,000원 이상이면 2%
       아니면 1%    
합계 = 기본급 + 수당
세금 = 합계 * 세율
월급 = 합계 - 세금

[실행결과]
이름 입력 : 홍길동
직급 입력 : 부장
기본급 입력 : 4900000
수당 입력 : 200000

*** 홍길동 부장 월급 ***
기본급 : 4,900,000원
수당 : 200,000원
합계 : 5,100,000원
세금 : 153,000원
월급 : 4,947,000원
 */

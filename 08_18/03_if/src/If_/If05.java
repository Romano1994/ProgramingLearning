package If_;

import java.util.Scanner;

public class If05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("이름 입력 :");
		String name = scan.next();
		
		System.out.print("직급 입력 :");
		String position = scan.next();
		
		System.out.print("기본급 입력 :");
		int basePay = scan.nextInt();
		
		System.out.print("수당 입력 :");
		int extraPay = scan.nextInt();
		
		int total = basePay + extraPay;
		int tax;
		if(basePay >= 40000000) {
			tax = (int)(total * 0.03);
		}else {
			tax = (int)(total * 0.02);
		}
		int salary = total - tax;
		
		System.out.println("\t ***" +name+ "월급 명세서 ***");
		System.out.println("직급 : " + position);
		System.out.println("기본급\t수당\t합계\t세금\t월급");
		System.out.println(basePay +"\t"+ extraPay+"\t"+total +"\t"+tax+"\t"+salary );
		
		
	}

}

/*
[문제] 월급 계산
- 이름, 직급, 기본급, 수당을 입력하여 합계, 세금 월급을 계산하시오
-세금은 기본급이 4백만원 이상이면 3%, 아니면 2%

합계 = 기본급 + 수당
세금 = 합계 *0.03 또는 0.02
월급 = 합계 - 세금

[실행결과]
이름 입력 : 홍길동
직급 입력 : 부장
기본급 입력 : 4000000
수당 입력 : 200000

      *** 홍길동 월급 명세서 ***
직급 : 부장
기본급      수당      합계         세금      월급
4000000      200000   4200000      xxx      xxxxx
*/

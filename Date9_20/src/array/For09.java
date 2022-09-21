package array;

import java.util.Scanner;

public class For09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int answer;
		int count =0;
		
		LOOP1: while(true) {
			for(int i = 1; i <= 5; i++) {
				int num1 = (int)(Math.random()*90+1);
				int num2 = (int)(Math.random()*90+1);
				int sum = num1 + num2;
				
				
				for(int j = 1; j <= 2; j++) {
					System.out.println("["+i+"]" + num1 + " + " + num2);
					System.out.print("정답 입력 : ");
					answer = scan.nextInt();
					
					if(answer == sum) {
						count += 20;
						System.out.println("정답입니다");
						System.out.println();
						break;
					}else {
						System.out.println("틀렸습니다 ");
						System.out.println();
					}
					if(j == 2) {
						System.out.println("정답은 : " + sum);
						System.out.println();
					}
				}
				
				if(i == 5) {
					System.out.println("프로그램이 종료됩니다");
					break LOOP1;
				}
			}
		}
		System.out.println("당신의 점수는 : " + count);
	
	}
}
/*
 * 문제] 덧셈 계산 (for, while, 다중 for)
- 10 ~ 99 사이의 난수를 2개 발생하여 합을 구하는 프로그램
- 5문제를 제공한다.
- 1문제당 점수 20점씩 처리한다.
- 틀리면 1번 더 기회를 주고, 2번 다 틀리면 답을 알려준다.

[실행결과]
[1] 25 + 36 = 50
틀렸다
[1] 25 + 36 = 59
틀렸다 정답은 xx

[2] 10 + 25 = 35
딩동뎅

[5] 78 + 95 = 89
틀렸다
[5] 78 + 95 = 173
딩동뎅

당신은 총 x 문제를 맞추어서 점수 xx점 입니다.

또 할래(Y/N) : 
*/

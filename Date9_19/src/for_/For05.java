package for_;

import java.util.Scanner;

public class For05 {
	/**
	 * x와 y를 입력받아 x의 y승을 출력
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();	//x값 입력 
		int a = x;	//	x값을 저장 
		int y = scan.nextInt(); //y값 입력  
		for(int i = 2; i <= y; i++) {
			x *= a;	//저장된 a값을 x에 곱하고 이를 x에 저장하기를 반
		}
		System.out.println("x = " + a);
		System.out.println("y = " + y);
		System.out.print(a +"의 " +y+"승  = " + x + " (");
		for(int i = 1; i <= y-1; i++) {
			System.out.print(a +"*");
		}
		System.out.println(a + ")");
	}

}
/*
 * For05.java
[문제] x의 y승을 구하시오 (for)

[실행결과]
x : 2
y : 5
2의 5승 xx (2*2*2*2*2)
---------------------------
x : 3
y : 4
3의 4승 xx (3*3*3*3)
 * 
 * 
 * */
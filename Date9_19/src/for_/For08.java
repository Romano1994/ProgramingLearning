package for_;

import java.util.Scanner;

public class For08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		String num = "";
		
		for(int i = 1; i <=a; i++) {
			if(a%i == 0) { 	//a값이 i로 나눠지는지 검사 
				num += i + " ";	//나눠지면 i를 string으로 변환해서 num애 저장 
			}
		}
		if(num.equals("1 " + a + " ")) {
			System.out.println(num); 
			System.out.println(a + "는 소수이다");
		}else {
			System.out.println(num);
			System.out.println(a + "는 소수가 아니다");
		}
	}
}
/*
 * For08.java

[문제] 약수와 소수(1과 자기자신의 숫자만 약수로 갖는 수)를 구하기

[실행결과]
숫자 입력 : 12
1  2  3  4  6  12
12는 소수가 아니다

숫자 입력 : 37
1  37
37는 소수이다
 * 
 * 
*/

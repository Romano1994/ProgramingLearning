package If_;

import java.util.Scanner;

public class If06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = (int)((Math.random()*3)+1);
		int player = scan.nextInt();
		
		if(num==1 && player==1) {
			System.out.println("컴퓨터 : 가위, 나 : 가위");
			System.out.println("비겼습니다");
		}else if(num==2 && player==2) {
			System.out.println("컴퓨터 : 바위, 나 : 바위");
			System.out.println("비겼습니다");
		}else if(num==3 && player==3) {
			System.out.println("컴퓨터 : 보자기, 나 : 보자기");
			System.out.println("비겼습니다");
		}else if(num==1 && player==2) {
			System.out.println("컴퓨터 : 가위, 나 : 바위");
			System.out.println("이겼습니다");
		}else if(num==1 && player==3) {
			System.out.println("컴퓨터 : 가위, 나 : 보자기");
			System.out.println("졌습니다");
		}else if(num==2 && player==1) {
			System.out.println("컴퓨터 : 바위, 나 : 가위");
			System.out.println("졌습니다");
		}else if(num==2 && player==3) {
			System.out.println("컴퓨터 : 바위, 나 : 보자기");
			System.out.println("이겼습니다");
		}else if(num==3 && player==1) {
			System.out.println("컴퓨터 : 보자기, 나 : 가위");
			System.out.println("이겼습니다");
		}else if(num==3 && player==2) {
			System.out.println("컴퓨터 : 보자기, 나 : 바위");
			System.out.println("졌습니다");
		}
		
	}

}

/*
[문제] 가위 바위 보 게임
- 가위 == 1
- 바위 == 2
- 보 == 3
으로 설정한다

컴퓨터는 1~3사이의 난수를 발생한다

[실행결과]
가위==1, 바위==2, 보자기==3

컴퓨터 : 가위, 나 : 바위
이겼다
*/
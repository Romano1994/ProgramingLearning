package Operator;

public class Home02 {
	public static void main(String[] args) {
		int dice1 = (int)((Math.random()*6)+1);
		int dice2 = (int)((Math.random()*6)+1);
		String check2 = dice1 == dice2 ? "주시위 1과 주사위 2가 같다" : dice1 < dice2 ? "주사위 2이 " + dice2 + "으로 승" : "주사위 1이 " + dice1 + "으로 승";
		System.out.println(dice1);
		System.out.println(dice2);
		System.out.println(check2);
		System.out.println("합 = " + (dice1 + dice2));
	}
}

/*
[실행결과]
주사위1 : 3   주사위2 : 1
주사위1 이 3으로 승
합 = 4
-----------------------------
주사위1 : 4   주사위2 : 6
주사위2 이 6으로 승
합 = 10
-----------------------------
주사위1 : 3   주사위2 :3
주사위1과 주사위2가 같다
합 = 6
 */

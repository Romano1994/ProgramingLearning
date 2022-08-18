package If_;

import java.util.Scanner;

public class If06_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int com = (int)((Math.random()*3)+1);
		System.out.print("가위:1, 바위:2, 보자기:3 입력:");
		int user = scan.nextInt();
		int money = 1000;
		int batting;
		
		System.out.print("배팅금액을 입력하세요");
		batting = scan.nextInt();
		
		if(com == 1) {
			if(user == 1) {
				System.out.println("컴퓨터 : 가위, 나 : 가위");
				System.out.println("비겼습니다");
				System.out.println("money : " + money);
			}else if (user == 2){
				System.out.println("컴퓨터 : 가위, 나 : 바위");
				System.out.println("이겼습니다");
				money += batting;
				System.out.println("money : " + money);
			}else if(user == 3) {
				System.out.println("컴퓨터 : 가위, 나 : 보자기");
				System.out.println("졌습니다");
				money -= batting;
				System.out.println("money : " + money);
			}
		}else if(com == 2) {
			if(user == 1) {
				System.out.println("컴퓨터 : 바위, 나 : 가위");
				System.out.println("졌습니다");
				money -= batting;
				System.out.println("money : " + money);
			}else if(user == 2) {
				System.out.println("컴퓨터 : 바위, 나 : 바위");
				System.out.println("비겼습니다");
				System.out.println("money : " + money);
			}else if(user == 3) {
				System.out.println("컴퓨터 : 바위, 나 : 보자기");
				System.out.println("이겼습니다");
				money += batting;
				System.out.println("money : " + money);
			}
		}else if(com == 3) {
				if(user == 1) {
					System.out.println("컴퓨터 : 보자기, 나 : 가위");
					System.out.println("이겼습니다");
					money += batting;
					System.out.println("money : " + money);
				}else if(user == 2) {
					System.out.println("컴퓨터 : 보자기, 나 : 바위");
					System.out.println("졌습니다");
					money -= batting;
					System.out.println("money : " + money);
				}else if(user == 3) {
					System.out.println("컴퓨터 : 보자기, 나 : 보자기");
					System.out.println("비겼습니다");
					System.out.println("money : " + money);
				}
			}
		}
	}



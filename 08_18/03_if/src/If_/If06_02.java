package If_;

import java.util.Scanner;

public class If06_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int com = (int)((Math.random()*3)+1);
		int user = scan.nextInt();
		
		if(com == 1) {
			System.out.print("컴퓨터 : 가위, ");
		}else if (com == 2) {
			System.out.print("컴퓨터 : 바위, ");
		}else if (com == 3) {
			System.out.print("컴퓨터 : 보자기, ");
		}
		
		if(user == 1) {
			System.out.println("나 : 가위");
		} else if(user == 2) {
			System.out.println("나 : 바위");
		}else if(user == 3) {
			System.out.println("나 : 보자기");
		}
		
		if(user == com) {
			System.out.println("비겼습니다");
		}else if(user == 1) {
			if(com == 2) {
				System.out.println("졌습니다");
			}else if(com == 3){
				System.out.println("이겼습니다");
			}
		}else if(user == 2){
			if(com == 1){
				System.out.println("이겼습니다");
			}else if(com == 3){
				System.out.println("졌습니다");
			}
		}else if(user == 3){
			if(com == 1){
				System.out.println("졌습니다");
			}else if(com == 2){
				System.out.println("이겼습니다");
			}
		}
	}

}

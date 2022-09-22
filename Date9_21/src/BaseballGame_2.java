import java.util.Scanner;

public class BaseballGame_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] com = new int[3];
		int[] user = new int[3];
		String yesOrNo;
		String str;
		int strike, ball;
		

		while(true){
			System.out.println("게임을 실행하시겠습니까? Y|N");
			yesOrNo = scan.next();
			
			if(yesOrNo.equals("Y") || yesOrNo.equals("y") || yesOrNo.equals("N") || yesOrNo.equals("n")) {
				break;
			}
		} //while
		if(yesOrNo.equals("Y") || yesOrNo.equals("y")) {
			System.out.println("게임을 시작합니다");
			
			//com에 난수 생성 
			for(int i = 0; i < com.length; i++) {
				com[i] = (int)(Math.random() * 9 + 1);
				
				//중복성 체크
				for(int j = 0; j < i; j++) {
					if(com[i] == com[j]) {
						i--;
						break;
					}
				}
			} // for i
			System.out.println(com[0] + ", " + com[1] + ", " + com[2]);
			while(true) {
				
				//user 입력
				System.out.println("숫자 입력 : ");
				str = scan.next();
				
				for(int i = 0; i < user.length; i++) {
					user[i] = str.charAt(i) - 48;
				}
				
				strike = ball = 0;
				for(int i = 0; i < com.length; i++) {
					for(int j = 0; j < user.length; j++) {
						if(com[i] == user[j]) {
							if(i == j) {
								strike++;
							}else {
								ball++;
							}
						}
					} // for j
				} // for i
				
				System.out.println(strike +"스트라이크 " + ball + "볼");
				if(strike == 3) {
					break;
				}
			} // while
		} // if
		System.out.println("프로그램을 종료합니다 ");
	}

}

import java.util.Arrays;
import java.util.Scanner;

public class BaseballGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] com = new int[3];
		int[] user = new int[3];
		int ball = 0;
		int strike = 0;
		String yn;

		LOOP1: while (true) {
			System.out.println("게임을 실행하시겠습니까(Y/N) :");
			yn = scan.next();
			
			while(true) {
				if(yn.equals("n") || yn.equals("N")) {
					break LOOP1;
				}else if(yn.equals("y") || yn.equals("Y")) {
					break;
				}
			}//while
					
			for (int i = 0; i < com.length; i++) {
				com[i] = (int) (Math.random() * 9 + 1);
				for (int j = 0; j < i; j++) {
					if (com[i] == com[j]) {
						i--;
						break;
					}
				} // j for
			} // i for
			System.out.println("숫자 입력 : ");
			for (int i = 0; i < user.length; i++) {
				user[i] = scan.nextInt();
			}
			for (int i = 0; i < 3; i++) {
				
				for(int j = 0; j < 3; j++) {
					if(com[i] == user[j]) {
						
					}
				}
				if (Arrays.asList(com).contains(user[i])) {
					if (com[i] == user[i]) {
						strike++;
					} else {
						ball++;
					}
				}
			} // i for
			System.out.println(ball);
			System.out.println(strike);
		}// while LOOP
//		System.out.println(ball);
//		System.out.println(strike);
	}
}
/*
 * 야구게임 크기가 3개인 정수형 배열을 잡고 1~9사이의 난수를 발생한다 발생한 수를 맞추는 게임 중복은 제거한다
 * 
 * [실행결과] 게임을 실행하시겠습니까(Y/N) : w 게임을 실행하시겠습니까(Y/N) : u 게임을 실행하시겠습니까(Y/N) : y
 * 
 * 게임을 시작합니다
 * 
 * 숫자입력 : 123 0스트라이크 0볼
 * 
 * 숫자입력 : 567 0스트라이크 2볼
 * 
 * 숫자입력 : 758 1스트라이크 2볼 ...
 * 
 * 숫자입력 : 785 3스트라이크 0볼
 */
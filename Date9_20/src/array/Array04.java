package array;

import java.util.Scanner;

public class Array04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean[] arr = new boolean[5];
		int parkingInNum = 0;
		
		while(true) {
			System.out.println("1. 입차 ");
			System.out.println("2. 출차 ");
			System.out.println("3. 리스트 ");
			System.out.println("4. 종료 ");
			int input = scan.nextInt();
			
			if(input == 1) {
				System.out.println("주차 위치 입력 : ");
				parkingInNum = scan.nextInt();
				if(arr[parkingInNum - 1] == true) {
					System.out.println("이미 주차되어 있습니다");
				}else {
					arr[parkingInNum-1] = true;
					System.out.println(parkingInNum + "에 주차");
				}
			}
			
			if(input == 2) {
				System.out.println("위치입력 : ");
				parkingInNum = scan.nextInt();
				if(arr[parkingInNum-1] == true) {
					arr[parkingInNum-1] = false;
					System.out.println(parkingInNum + "에서 출차");
				}else {
					System.out.println("주차되어 있지 않습니다");
				}
			}
			
			if(input == 3) {
				for(int i = 0; i < arr.length; i++) {
					System.out.println(i+1 + "위치 : " + arr[i]);
				}
			}
			
			if(input == 4) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
		}
		
	}
}
/*
주차장 관리 프로그램
**************
   1. 입차      input()
   2. 출차      output()
   3. 리스트      list()
   4. 종료
**************
  메뉴 : 

1번인 경우
위치 입력 : 3
3위치에 입차 / 이미 주차되어있습니다

2번인 경우
위치 입력 : 4
4위치에 출차 / 주차되어 있지않습니다

3번인 경우
1위치 : true
2위치 : false
3위치 : true
4위치 : false
5위치 : false
*/
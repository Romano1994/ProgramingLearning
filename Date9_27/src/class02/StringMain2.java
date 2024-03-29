package class02;

import java.util.Scanner;

public class StringMain2 {
	Scanner scan = new Scanner(System.in);
	int count;
	
	public static void main(String[] args) {
		StringMain2 sm = new StringMain2();
		sm.change();
		
	}
	
	public void change() {
		System.out.print("문자열 입력 : ");
		String input = scan.next(); //문자열 입력
		System.out.print("현재 문자열 입력 : ");
		String originString = scan.next(); //현재 문자열 입력
		System.out.print("바꿀 문자열 입력 : ");
		String changeString = scan.next(); //바꿀 문자열 입력
		
		//문자열 소문자로 변환
		input = input.toLowerCase();
		originString = originString.toLowerCase();
		changeString = changeString.toLowerCase();
		
		for(int j=0; j<input.length(); j++) {
			for(int i=0; i<input.length() / originString.length(); i++) {
			
			}
		}
		
		for(int i=0; i<input.length(); i++) {
			if(input.indexOf(originString) == i) {
				input = input.replace(originString, changeString);
				count++;
			}
		} // for
		System.out.println(input);
		System.out.println(count);
	} // change
}

/*
치환하는 프로그램을 작성하시오 - indexOf(), replace()
String 클래스의 메소드를 이용하시오
대소문자 상관없이 개수를 계산하시오

[실행결과]
문자열 입력 : aabba
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1번 치환

문자열 입력 : aAbbA
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1번 치환

문자열 입력 : aabbaa
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbbdd
2번 치환

문자열 입력 : AAccaabbaaaaatt
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddccddbbddddatt
4개 치환

문자열 입력 : aabb
현재 문자열 입력 : aaaaa
바꿀 문자열 입력 : ddddd
입력한 문자열의 크기가 작습니다
치환 할 수 없습니다

indexOf()
replace()
*/

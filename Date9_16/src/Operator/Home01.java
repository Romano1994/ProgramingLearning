package Operator;


public class Home01 {
	public static void main(String[] args) {
		
		char ch = 'Z';
		
		int result = ch >= 65 ? ch - 32 : ch;
		int result2 = ch < 97 ? ch + 32 : result;
		
		System.out.print(ch + " -> ");
		System.out.println((char)result2);
	}
}
/*
 * [문제] 변수의 값이 대문자이면 소문자로 변환해서 출력, 소문자이면 대문자로 변환해서 출력하시오

[실행결과]
B -> b         e -> E
 */

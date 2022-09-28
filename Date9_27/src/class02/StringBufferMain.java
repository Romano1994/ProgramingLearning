package class02;

import java.util.Scanner;

public class StringBufferMain {
	private int dan;
	
	void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		dan = scan.nextInt();
		
	}
	void output() {
		StringBuffer buffer = new StringBuffer();
		
		for(int i=1; i<=9; i++) {
			//System.out.println(dan +" * "+ i + " = " + dan*i);
			buffer.append(dan);
			buffer.append(" * ");
			buffer.append(i);
			buffer.append(" = ");
			buffer.append(dan*i);
			
			System.out.println(buffer.toString()); // stringBuffer => string으로 변환해서 출력한다
			buffer.delete(0, buffer.length());
		}
	}
	public static void main(String[] args) {
		StringBufferMain strBufferMain = new StringBufferMain();
		strBufferMain.input();
		strBufferMain.output();
		//기존에 문자열에 계속 추가되기 때문에 이전의 문자열도 출력한 후 다음 문자열을 출력한다
	}
}

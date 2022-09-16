package Variable;

import java.util.Random;

public class Variable04 {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("지역변수 a = " + a);
		System.out.println();
		
		Random r; //변수가 아닌 객체라고 부
		r = new Random();
		System.out.println(r);
		System.out.println(r.nextDouble());
		System.out.println(r.nextInt(26) + 65); // 0 ~ 99
		System.out.println();
		
		String b = new String("사과");
		String c = "딸기"; //문자열 리터럴 생성 
		System.out.println(b + "\t" + c);
	}
}

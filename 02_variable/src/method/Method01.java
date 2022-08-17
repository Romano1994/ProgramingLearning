package method;

import java.util.Random;

public class Method01 {

	public static void main(String[] args) {

		
		System.out.println("큰 값 =" + Math.max(25,36));
		System.out.println("작은 값 =" + Math.min(25,36));
		System.out.println((int)(Math.random()*10));
		
		Random r = new Random();
		System.out.println(r.nextDouble());
		System.out.println((char)(r.nextInt(26) + 65));
		
	}

}

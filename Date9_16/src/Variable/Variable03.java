package Variable;

import java.util.Random;

public class Variable03 {
	public static void main(String[] args) {
		System.out.println("큰 값 = " + Math.max(25, 36));
		System.out.println("큰 값 = " + Math.max(78.9, 55.8));
		
		System.out.println(Math.random());
		System.out.println((int)((Math.random()*26)+65));
		System.out.println((char)((Math.random()*26)+65));
		
		System.out.println(new Random().nextDouble());
	}
}
/*
 * a ~ 사이의 난수 발생 => (int)((math.random()*(b-a+1) + a)
*/

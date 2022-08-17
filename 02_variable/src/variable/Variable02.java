package variable;

public class Variable02 {

	public static void main(String[] args) {

		short a = 320;
		short b = 258;
		short sum = (short) (a + b);
		int sub = a - b;
		int mul = a * b;
		double div = (double)a/b;

//		short sum = a + b;			a+b의 결과값이 int형이므로 에러가 발생
		System.out.println(sum);
		
		System.out.println(a +"+"+b +"="+sum);
		System.out.println(a +"-"+b +"="+sub);
		System.out.println(a +"*"+b +"="+mul);
//		System.out.println(a +"/"+b +"="+div);
		System.out.printf("%d / %d = %.2f",a,b,div);
	}

}

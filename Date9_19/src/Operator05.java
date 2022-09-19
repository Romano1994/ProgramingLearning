
public class Operator05 {
	public static void main(String[] args) {
		int a = 5;
		System.out.println(a);
		
//		int b = a++;
//		System.out.println(b);
		int b = ++a;
		System.out.println(b);
		int c = ++a - b--;
		/*
		 * a+1;
		 * int c = a - b;
		 * b--;
		 */
		System.out.println(c);
	}
}

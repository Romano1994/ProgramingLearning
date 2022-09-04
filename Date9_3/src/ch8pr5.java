
public class ch8pr5 {

	public static void main(String[] args) {
		method1();
	}
	
	static void method1() {
		try {
			System.out.println(1);
			method2();
		} catch (ArithmeticException ae) {
			System.out.println(2);
		} finally {
			System.out.println(3);
		}
	}
	static void method2() {
		throw new NullPointerException();
	}
}


public class ch8pr_5_1 {

	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println(5);
		}
	}
	static void method1() throws Exception{
		try {
			method2();
			System.out.println(1);
		}catch (ArithmeticException re) {
			System.out.println(2);
		} finally {
			System.out.println(3);
			throw new Exception();
		}
//		System.out.println(4);
	}
	static void method2() {
		throw new NullPointerException();
	}

}

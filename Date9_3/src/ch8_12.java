
public class ch8_12 {

	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println(1);
		}
	}
	static void method1() throws Exception{
		method2();
	}
	static void method2() throws Exception{
		throw new RuntimeException();
	}

}

package multi;

public class Method2 {
	public static void main(String[] args) {
		output();
		Method2 m = new Method2();
		m.disp();
	}
	public void disp() {
		System.out.println("non-static method");
	}
	public static void output() {
		System.out.println("static method");
	}
	
}

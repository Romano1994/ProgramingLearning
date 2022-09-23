package method;

public class Method01 {
	public static void main(String[] args) {
		int a=25, b=36; // 지역변수 , local veriable
		
		Method01 method01 = new Method01();	//생성
		int sum = method01.add(1, 3);	//호출
		int sub = method01.minus(1, 3);	//호출
		int mul = method01.by(1, 3);	//호출
		double div = method01.div2(1, 3);	//호출
		
		System.out.println(a + " + " + b + " = " + sum);
		System.out.println(a + " - " + b + " = " + sub);
		System.out.println(a + " * " + b + " = " + mul);
		System.out.println(a + " / " + b + " = " + div);
		
	}
	public int add(int a, int b) { //구현, 인수(argument) , 매개변수(parameter)
		return a + b;
	}
	public int minus(int a, int b) {
		return a - b;
	}
	public int by(int a, int b) {
		return a * b;
	}
	public double div2(double a, int b) {
		return a / b;
	}
}

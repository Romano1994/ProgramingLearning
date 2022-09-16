package Variable;

import java.text.DecimalFormat;

public class CalcTest {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		DecimalFormat df = new DecimalFormat();
		short a = 0x140;
		short b = 0x102;
		String q = String.format("%7.5f", cal.div(a, b));
		System.out.println("320 + 258 = " + cal.add(a, b));
		System.out.println("320 - 258 = " + cal.sub(a, b));
		System.out.println("320 * 258 = " + cal.mul(a, b));
		System.out.println("320 / 258 = " + new DecimalFormat().format(q));
	}
}
class Calculator{
	int add(short a, short b) {
		return a + b;
	}
	int sub(short a, short b) {
		return a - b;
	}
	int mul(short a, short b) {
		return a * b;
	}
	double div(double a, short b) {
		return a / b;
	}
}
/*
 * [문제] 변수를 이용하여 320, 258의 합을 구하시오 
 * [실행결과] 
 * 320 + 528 = xx
*/


public class Ch9_13 {
	public static void main(String[] args) {
		double val = 90.7552;
		System.out.println(Math.round(val));
		
		val *= 100;
		System.out.println(Math.round(val));
		
		System.out.println(Math.round(val)/100);
		System.out.println(Math.round(val)/100.0);
		System.out.println();
		System.out.printf("ceil(%3.1f)=%3.1f%n", 1.1, Math.ceil(1.1));
		System.out.printf("floor(%3.1f)=%3.1f%n", 1.1, Math.floor(1.1));
		System.out.printf("round(%3.1f)=%3.1f%n", 1.1, Math.round(1.1));
		System.out.printf("rint(%3.1f)=%3.1f%n", 1.1, Math.rint(1.1));
	}
}

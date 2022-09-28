
import static java.lang.Math.random;
import static java.lang.Math.pow;
import static java.lang.System.out;
import static java.lang.String.format;

public class ImportStatic {
	public static void main(String[] args) {
		out.println("난수 = " + random());
		out.println("제곱 = " + pow(3, 4));
		out.println("소수 이하 둘째 자리 = " + format("%.2f", 43.45678));
	}
}

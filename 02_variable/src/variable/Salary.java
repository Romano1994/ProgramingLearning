package variable;
import java.text.DecimalFormat;

public class Salary {

	public static void main(String[] args) {

		String name = "L";
		int basePay = 2500000;
		int tax = (int)(basePay * 0.033); 
		int saraly = basePay - tax;
		DecimalFormat dFormat = new DecimalFormat();
		
		System.out.println("***"+name+"의 월급***");
		System.out.println("기본급: "+dFormat.format(basePay));
		System.out.println("세금: "+dFormat.format(tax));
		System.out.println("총 금액: "+dFormat.format(saraly));
		

	}

}

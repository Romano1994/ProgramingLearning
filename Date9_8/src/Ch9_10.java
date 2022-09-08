
public class Ch9_10 {
	public static void main(String[] args) {
		int iVal = 100;
		String strVal = String.valueOf(iVal);
		
		double dVal = 200.0;
		String strVal12 = dVal + "";
		
		double sum = Integer.parseInt("+" +strVal) + Double.parseDouble(strVal12);
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal12);
		
		System.out.println(String.join("",strVal," + ",strVal12," = ") + sum);
		System.out.println(strVal +" + "+ strVal12 +" = "+ sum2);
	}
}
 
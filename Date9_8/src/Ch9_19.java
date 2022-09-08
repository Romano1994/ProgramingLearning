
public class Ch9_19 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("1234567890");
		sb.replace(3, 6, "AB");
		System.out.println(sb);	//123AB7890

	}
}

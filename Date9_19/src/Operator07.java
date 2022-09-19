
public class Operator07 {
	public static void main(String[] args) {
		boolean a = 25 > 26;
		System.out.println("a = " + a);
		System.out.println("!a = " + !a);
		System.out.println();
		
		String b = "apple";	//literal 생성 
		String c = new String("apple");
		
		System.out.println("b == c : " + (b == c? "같다" : "다르다"));
		System.out.println("b.equals(c) : " + (b.equals(c) ? "같다" : "다르다"));
	}
}

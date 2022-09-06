
public class Ch9_6 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		System.out.println();
		
		String str3 = new String("abc");
		String str4 = new String("abc");
		
		System.out.println("String str3 = " + str3);
		System.out.println("String str4 + " + str4);
		System.out.println("str3 == str4 : " + (str3 == str4));
		System.out.println("str3.equals(str4) : " + str3.equals(str4));
		
		Name n1 = new Name("pan");
		Name n2 = new Name("pan");
		System.out.println(n1.equals(n2));
		System.out.println(n1 == n2);
	}
}
class Name{
	String cup;
	Name(String cup){
		this.cup = cup;
	}
}

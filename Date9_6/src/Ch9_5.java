
public class Ch9_5 {
	public static void main(String[] args) {
		Card2 c1 = new Card2();
		Card2 c2 = new Card2("HEART", 10);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}
class Card2{
	String kind;
	int number;
	
	public Card2(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	Card2(){
		this("SPADE", 1);
	}
	public String toString() {
		return "kind : " + kind + ", number : " + number;
	}
}
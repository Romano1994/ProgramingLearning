import java.util.Objects;

public class Ch9_4 {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		String str = new String();
		
	}
}
class Card{
	String kind;
	int number;
	
	public Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	public Card() {
		this("SPADE", 1);
	}
	public int hashCode() {
		return Objects.hash(kind, number);
	}
}
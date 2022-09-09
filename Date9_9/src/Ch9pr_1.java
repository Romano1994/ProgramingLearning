
public class Ch9pr_1 {
	public static void main(String[] args) {
		Sutda c1 = new Sutda(3, true);
		Sutda c2 = new Sutda(3, true);
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println(c1.equals(c2));
		Poker p1 = new Poker(3, true);
		
		System.out.println(c1.equals(p1));
	}
}

class Sutda {
	int num;
	boolean isKwang;

	Sutda(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	Sutda() {
		this(1, true);
	}

	public boolean equals(Object obj) {
		if(obj instanceof Sutda) {
			Sutda c = (Sutda)obj;
			return c.isKwang == isKwang && c.num == num;
		}
		return false;
	}

	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

class Poker extends Sutda{
	Poker(int num, boolean isKwang){
		super(num, isKwang);
	}
}
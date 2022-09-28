enum Color{
	RED, GREEN, BLUE;
	
}
class Final{
	public final String FRUITE = "사과";
	public final String FRUITE2;
	public static final String ANIMAL = "사자";
	public static final String ANIMAL2;
//	public static final int RED = 0;	
//	public static final int GREEN = 1;	
//	public static final int BLUE = 2;	

	
	
	static {
		ANIMAL2 = "기린";
	}

	public Final() {
		FRUITE2 = "딸기";
	}
	
}
public class FinalMain {
	public static void main(String[] args) {
		final int AGE = 10;
		
		Final f = new Final();
		System.out.println(f.FRUITE);
		System.out.println(Final.ANIMAL);
		System.out.println(Final.ANIMAL2);
		
		System.out.println(Color.RED.ordinal());
		
		
		for(Color data : Color.values()){
			System.out.println(data.ordinal() + " : " + data);
		}
	}

}

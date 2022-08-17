package variable;

public class Variable01 {

	public static void main(String[] args) {

		boolean a;
		a = 25 > 36;
		System.out.println(a);
		System.out.println();
		
		char b;
		b = 'A';
		System.out.println(b);
		
		char c;
		c = 65;
		System.out.println();
		System.out.println();
		
		byte d;
		//d = 300;   - 	error
		
		int e;
		e = 65;		// 0x41
		System.out.println(e);
		
		float g;
		//g = 43.8;
		g = 43.8f;
		g = (float) 43.8;
	}

}

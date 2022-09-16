package Variable;

public class Variable01 {
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);

		boolean a;
		a = false;
		System.out.println("a = " + a);

		char b = 'A';
		
//		byte d = 128;  byte는 127까지 담을 수 있기 때문에 넘어가는 숫자는 int로 인식함 
		
		int c = 65;
		
		int d = 'A';
		int e = 0x41; // 바로 16진수로 입력할 수도 있다 
		System.out.println(d);
		System.out.println(e);
		
		long f = 96L; //k와 같은 값이지만 g는 태어날때부터 long
		long g = 96; // k는 int형으로 태어난 후 형변환 
		System.out.println(f);
		
		float h = 43.8f; //태어날 때부터float
		float j = (float)43.8; // double로 태어나서 float으로 형변환 
		
	}
	
}

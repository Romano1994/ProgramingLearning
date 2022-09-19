package Boxing;

public class Boxing {
	public static void main(String[] args) {
		int a = 25;
		double b = (double)a / 3; // casting
		System.out.println(b);
		
		String c = "25";
		int d = Integer.parseInt(c); // String이 객체형이기 때문에 Integer라는 클래스가 와서 casting해야 한다
		System.out.println(d);
		
		int e = 5;
		Integer f = e; //autoBoxing
		Integer g = new Integer(e);	// 예전에는 이런식으로 했다
		
		Integer h = 5;
		int i = e;	//autoUnboxing
		int j = h.intValue();	//예전에는 이런식으로 했다
	}
}


class This{
	private int a;
	
	public void setA(int a){
		this.a = a;
	}
	
	public int getA() {
		System.out.println(this);
		return a;
	}
}
//----------------------------------
public class ThisMain {
	public static void main(String[] args) {
		This t = new This();
		System.out.println(t);
		t.setA(10);
		System.out.println(t.getA());
		
		This s = new This();
		System.out.println(s);
		s.setA(10);
		System.out.println(s.getA());
	}
}

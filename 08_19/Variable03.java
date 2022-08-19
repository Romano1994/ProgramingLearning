public class Variable03 {
	int a; //필드
	static int b;
	
	
	public static void main(String[] args) {

		int a  =10;
		
		System.out.println("지역변수 : " + a);  //지역변수 : 10
		
		System.out.println("static 필드 : " + Variable03.b); //static 필드 : 0
		System.out.println("static 필드 : " + b);
		Variable03 v1 = new Variable03();
		System.out.println("필드 a = " + v1.a); //필드 a = 0
		System.out.println("객체 v = " + v1);   //객체 v = variable.Variable03@515f550a
		v1.gar();
	}
	void gar() {
		b = 2;
		System.out.println("static 필드 : " + Variable03.b);
	}

}

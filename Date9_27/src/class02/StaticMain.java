package class02;

class StaticTest{
	private int a; //필드, 인스턴스 변수 
	private static int b; //필드, 클래스 변수 
	
	static {
		System.out.println("초기화 영역");
		b = 7;
	}
	public StaticTest() {
		System.out.println("기본 생성자");
	}
	
	public void calc() {
		a++;
		b++;
	}
	public void disp() {
		System.out.println("a= " + a+"\t"+ "b= " + b);
	}
	public static void output() {
		System.out.println("static method");
		//System.out.println("a= " + a + "\t" + "b= " + b); 스태틱 메소드 안에는 스태틱 변수만 사용 가능하기 때문에 에러 발생
	}
}
//-----------------------
public class StaticMain {
	public static void main(String[] args) {
		StaticTest st = new StaticTest();
		st.calc();
		st.disp();
		System.out.println();
		
		StaticTest st2 = new StaticTest();
		st2.calc();
		st2.disp();
		System.out.println();
		
		StaticTest st3 = new StaticTest();
		st3.calc();
		st3.disp();
		System.out.println();
		
		StaticTest.output(); // 클래스명.메소드();
		st.output(); //객체명.메소드();
	}
}

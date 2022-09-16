package Variable;

public class Variable02 {
	int a; // 전역변수 / 필드라고 함
	static int b;
	
	public static void main(String[] args) {
		int a = 5; // local variable (지역변수)
//		System.out.println(a); 내 구역에 있는 변수가 먼저 찍힌다 
		System.out.println(a);
		System.out.println(Variable02.b);
//		Variable02 val = new Variable02();
		System.out.println(new Variable02().a);;
		
	}
}
class ClTest{
	static int y = 10;
}
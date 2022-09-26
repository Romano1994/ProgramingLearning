package inheritance;

public class Sub extends Super{
	protected String name;
	protected int age;
	
	public Sub(String name, int age, double weight, double height) {
		this.name = name;
		this.age = age;
		super.weight = weight;
		super.height = height;
		
	}
	public void output() {
		System.out.println(this.name + " "+ this.age);
		System.out.println(this.weight +" "+ this.height);
		
	}
	public Sub() {
		System.out.println("Sub 기본 생성자");
	}
	public static void main(String[] args) {
		Child aa = new Child("홍길동", 15, 60, 180);
		aa.disp();
//		System.out.println();
//		aa.output();   
		System.out.println("----------------------------");
		Super cc = new Super();
		cc.disp();
		
	}
}

package inheritance;

public class Child extends Super{
	protected String name;
	protected int age;
	
	
	public Child(double weight, double height) {
		super(weight, height);
//		System.out.println("Super 기본생성자");
	}
	
	public Child(String name, int age, double weight, double height) {
		System.out.println("Child 생성자");
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	public void disp() {
		System.out.println("child disp");
//		System.out.println("이름 : " + name);
//		System.out.println("나이 : " + age);
//		System.out.println("몸무게 : " + weight);
//		System.out.println("키 : " + height);
	}
}

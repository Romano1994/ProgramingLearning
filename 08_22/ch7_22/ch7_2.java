package ch7_22;

public class ch7_2 {
	public static void main(String[] args) {
		Child child = new Child();
		child.method();
	}
}
class Parent{ 
	int x = 10;
}
class Child extends Parent{
	int x = 20;
	int y;
	Child(int y, int x){
		this.y = y;
	}
	void method() {
		System.out.println("x = " +x);
		System.out.println("this.x = " +this.x);
		System.out.println("super.x = " +super.x);
	}
}

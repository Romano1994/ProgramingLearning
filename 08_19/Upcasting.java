
public class Upcasting {
	public static void main(String[] args) {
		Parent p1 = new Child("chan", 29);

		System.out.println(p1.name);
		// System.out.println(p1.age); 에러 발생 : 부모와 자식 클래스 중 공통된 속성만 사용 가능하기 때문


		
	}
}

class Parent{
	String name;
	Parent(String name){
		this.name = name;
	}
}

class Child extends Parent{
	int age;
	Child(String name, int age){
		super(name);
		this.age = age;
	}
}
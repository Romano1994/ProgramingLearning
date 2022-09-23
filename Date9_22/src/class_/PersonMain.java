package class_;

class Person{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setData(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void setData() {
	}
	
}
//---------------
public class PersonMain {
	public static void main(String[] args) {
		Person aa = new Person();
		System.out.println(aa);
		
		aa.setName("홍길동");
		aa.setAge(25);
		
		System.out.println("이름 = " + aa.getName() + "/ 나이 = " + aa.getAge());
		
		Person bb = new Person();
		System.out.println(bb);
		bb.setName("코난");
		bb.setAge(13);
		System.out.println("이름 = " + bb.getName() + "/ 나이 = " + bb.getAge());
		
		Person cc = new Person();
		System.out.println();
		cc.setData("둘리", 100);
		System.out.println("이름 = " +cc.getName() + "/ 나이 = " + cc.getAge());
		
		Person dd = new Person();
		System.out.println();
		cc.setData();
		System.out.println("이름 = " +dd.getName() + "/ 나이 = " + dd.getAge());
		
	}
}

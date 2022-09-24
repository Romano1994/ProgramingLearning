package contructor;

class Hello{
	private String name;
	private int age;
	
	public Hello(String name) {
		this.name = name;
	}
	public Hello(int age) {
		this(); //오버로드된 다른 생성자를 호출할 수 있다
		this.age = age;
	}
	public Hello(String name, int age) {
		this.age = age;
		this.name = name;
	}
	public Hello() {
		System.out.println("기본생성자 ");
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}

//------------------
public class ContructorMain {
	public static void main(String[] args) {
		Hello aa = new Hello();
		Hello bb = new Hello("홍길동");
		Hello cc = new Hello(25);
		Hello dd = new Hello("김찬영", 29);
		System.out.println(bb.getName() + " / " + bb.getAge());
		System.out.println(cc.getName() + " / " + cc.getAge());
		System.out.println(dd.getName() + " / " + dd.getAge());
	}
}

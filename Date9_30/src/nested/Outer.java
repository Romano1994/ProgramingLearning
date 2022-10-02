package nested;

public class Outer {
	private String name;
	
	public void output() {
		Inner inner = new Inner();
		
//		System.out.println("이름 = " + name + "\t나이 = " + age); // age는 내부클래스의 변수이기 때문에 접근 불가
		System.out.println("이름 = " + this.name + "\t나이 = " + inner.age); //age는 private이지만 내부클래스의 멤버이기 때문에 getter 사용 안해도 됨
	}
	
	class Inner {
		private int age;
		
		public void disp() {
			System.out.println("이름 = " + Outer.this.name + "\t나이 = " + this.age);
		}
	}
	
	public static void main(String[] args) {
		Outer outer = new Outer();
//		outer.age = 3; //outer 객체를 생성하면 inner 객체를 생성하지 않는다
		outer.name ="홍길동";
		outer.output();
		
		Outer.Inner in2 = outer.new Inner();
		
		in2.age = 10;
		in2.disp();
		
		Outer.Inner in3 = outer.new Inner();
		in3.age = 30;
		in3.disp();
//		in3.name;	//	내부클래스에서 외부 멤버로 접근할 수 있는 것은 내부클래스를 선언할 때만
		
		Outer.Inner in4 = new Outer().new Inner();
		in4.age = 5;
		in4.disp();
		
	}
}

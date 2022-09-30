package collection;

class GenericTest<T> {
	private T a;

	public void setA(T a) {
		this.a = a;
	}

	public T getA() {
		return a;
	}
}

public class Generic {
	public static void main(String[] args) {
		GenericTest<String> aa = new GenericTest <String>();
		
		aa.setA("홍길동");
		System.out.println(aa.getA());
	}
}

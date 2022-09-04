class InvalodNumberException extends Exception{}
class NotANumberException extends Exception{}
class NumberException extends Exception{}

public class ch8pr_3 {
	public static void main(String[] args) {
	}
}

class Parent{
	int a;
	int b;
	
	Parent(){
		this(0,0);
	}
	Parent(int a, int b){
		this.a = a;
		this.b = b;
	}
	void add(int a, int b) throws InvalodNumberException, NotANumberException{}
}
class Child extends Parent{
	Child(){}
	Child(int a, int b){
		super(a, b);
	}
	void add(int a, int b) throws InvalodNumberException, NotANumberException{}
}
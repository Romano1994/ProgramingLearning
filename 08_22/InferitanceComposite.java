
public class InferitanceComposite {
	public static void main(String[] args) {
		child c = new child();
		System.out.println(c.x);
		System.out.println(c.com.x);
		System.out.println(c.toString() );
	}
}

class child extends inheritance{
	composite com = new composite();
}
class inheritance{
	int x = 0;
}

class composite{
	int x = 1;
}
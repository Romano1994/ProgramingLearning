package abstract_;

public class AbstractMain extends AbstractTest{
	
	@Override
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		AbstractTest at = new AbstractMain(); //메모리 생성은 AbstractMain, 객체 참조는 AbstractTest
		
	}
}

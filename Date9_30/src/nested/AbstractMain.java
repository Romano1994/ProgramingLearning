package nested;

public class AbstractMain {
	
	public static void main(String[] args) {
		
		AbstractTest at = new AbstractTest() { //익명 이너클래스
			
			@Override
			public void setName(String name) {
				
			}
		};
		
		InterA ia = new InterA() { // 인터페이스를 new 한 게 아니라 익명 클래스를 new 한 
			
			@Override
			public void bb() {
			}
			
			@Override
			public void aa() {
			}
		};
		
		AbstractExam ae = new AbstractExam() { 
			//AbstractExam에는 추상메소드가 없기 때문에 모든 메소드를 구현해야할 필요는 없다
			//원하는 것만 구현할 수 있다
		};
	}



}

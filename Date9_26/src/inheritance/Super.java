package inheritance;

public class Super {
	protected double weight, height;
	
	public Super() {
//		System.out.println("Super 기본생성자");
	}
	
	public Super(double weight, double height) {
//		System.out.println("Super 생성자");
		this.weight = weight;
		this.height = height;
		System.out.println(weight);
		System.out.println(height);
	}
	
	public void disp() {
		System.out.println("super disp");
//		System.out.println("몸무게 : " + weight);
//		System.out.println("키 : " + height);
	}
	
}

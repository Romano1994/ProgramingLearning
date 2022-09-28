import java.util.Scanner;

public class Mul implements Compute{

	int x,y;
	
	public Mul() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("x의 값을 입력 : ");
		x = scan.nextInt();
		System.out.println("x의 값을 입력 : ");
		y = scan.nextInt();
	}
	@Override
	public void disp() {
		System.out.println(x + " * " + y +" = "+ (x*y));
	}

}

import java.util.Scanner;

public class Div implements Compute{


	double x,y;
	
	public Div() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("x의 값을 입력 : ");
		x = scan.nextInt();
		System.out.println("x의 값을 입력 : ");
		y = scan.nextInt();
	}
	@Override
	public void disp() {
		System.out.println(x + " / " + y +" = "+ String.format("%.2f", (x/y)));
	}

}

import java.util.Scanner;

public class ComputeMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Compute[] comArr = new Compute[3];
		
		for(int i=0; i< comArr.length; i++) {
			comArr[i] = new Compute();
			
			System.out.print("x 입력 : ");
			comArr[i].setX(scan.nextInt());

			System.out.print("y 입력 : ");
			comArr[i].setY(scan.nextInt());
			
			comArr[i].calc();
		}
		System.out.println("X\tY\tSUM\tSUB\tMUL\tDIV\t");
		for(int i=0; i<comArr.length; i++) {
			System.out.println(comArr[i].getX() +"\t"+
							comArr[i].getY() +"\t" +
							comArr[i].getSum() +"\t" +
							comArr[i].getSub() +"\t" +
							comArr[i].getMul() +"\t" +
							comArr[i].getDiv() +"\t");
		}
	}
}

import java.util.Scanner;

public class beakjoon2469 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for(int i=1; i <= n; i++) {
			for(int x=1; x <= n-i; x++) {
				System.out.print(" ");
			}
			for(int j=1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

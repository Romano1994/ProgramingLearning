import java.util.Scanner;

public class beakjoon11022 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for(int i=1; i <= t; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			System.out.printf("Case #%d: %d + %d = %d%n",i,a,b,a+b);
		}
	}

}

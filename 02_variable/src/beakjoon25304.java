import java.util.Scanner;

public class beakjoon25304 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int totalPrice = scanner.nextInt();
		int count = scanner.nextInt();
		int sum = 0;
		
		for(int i=1; i <= count; i++) {
			int priceA = scanner.nextInt();
			int countB = scanner.nextInt();
			sum += priceA * countB;
		}
		
		if(sum == totalPrice) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}

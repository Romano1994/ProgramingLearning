import java.util.Scanner;

public class beakjoon3052 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int count = 0;
		boolean bl;
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
			a[i] = (scanner.nextInt())%42;
		}
		for(int i=0; i < 10; i++) {
			bl = false;
			for(int j = i+1; j < 10; j++) {
				if(a[i] == a[j]) {
					bl = true;
					break;
				}	
			}
			if(bl == false) {
				count++;
			}
		}
		System.out.println(count);
	}

}

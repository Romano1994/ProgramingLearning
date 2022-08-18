package beakjoon;

import java.util.Scanner;

public class Beakjoon10871 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int x = scanner.nextInt();
		int[] nums = new int[n];
		
		for(int i=0; i<n; i++) {
			nums[i] = scanner.nextInt();
			}
		for(int i = 0; i < n; i++) {
			if(x > nums[i]) {
				System.out.print(nums[i]+ " ");
			}
		}
	}
}

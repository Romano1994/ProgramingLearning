import java.util.Arrays;
import java.util.Scanner;

public class LottoArrays {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] lotto = new int[6];
		
		System.out.print("현금입력 : ");
		int money = scan.nextInt();
		
		for(int i = 1; i <= money/1000; i++) {
			
			for(int k = 0; k < lotto.length; k++) {
				lotto[k] = (int)(Math.random() * 45 + 1);
				
				for(int j = 0; j < k; j++) {
					if(lotto[k] == lotto[j]) {
						--k;
						break;
					}
					
				} // j for
				
			}// k for
			Arrays.sort(lotto);
			for(int data : lotto) {
				System.out.print(String.format("%4d", data));
			}
			
			if(i%5 == 0) System.out.println();
			System.out.println();
		}// i for
	}
}

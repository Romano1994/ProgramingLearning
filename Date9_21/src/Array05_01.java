import java.util.Random;

public class Array05_01 {
	public static void main(String[] args) {
		Random r = new Random();
		char[] ar = new char[50];
		int[] count = new int[26];
		
		for(int i = 0; i < ar.length; i++) {
			ar[i] = (char)(r.nextInt(26) + 65);
			System.out.println(ar[i] + " ");
			if((i + 1)%10 == 0) {
				System.out.println();
			}
		}
		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j < count.length; j++) {
				if(ar[i] == j + 65) {
					count[j] ++;
				}
			}
		}
		
		
	}
}

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] ar = {35, 48, 25, 72, 50};
		int count = 0;
		
		System.out.println("정렬 전 : ");
		for(int data : ar) {
			System.out.print(data + " ");
			
		}
		System.out.println();
		
		for(int i = 0; i < ar.length; i++) {
			for(int j = i; j < ar.length; j++) {
				if(ar[i] > ar[j]) {
					int tmp = ar[i];
					ar[i] = ar[j];
					ar[j] = tmp;
				}
			}
		}
		
		System.out.println("정렬 후 : ");
		for(int data : ar) {
			System.out.print(data + " ");
		}
		System.out.println();
	}
}

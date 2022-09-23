package multi;

public class MultiArray02 {
	public static void main(String[] args) {
		int[][] arr = new int[10][10];
		
		int num=0;
		
//		for(int i=0; i < arr.length; i++) {
//			for(int j=0; j < arr[i].length; j++) {
//				num += 1;
//				arr[i][j] = num;
//			}
//		}
//		for(int i=0; i < arr.length; i++) {
//			for(int j=0; j < arr[i].length; j++) {
//				num ++;
//				arr[i][j] = num;
//			}
//		}
		for(int i=arr.length-1; i>=0; i--) {
			for(int j=arr[i].length-1; j>=0 ; j--) {
				num ++;
				arr[i][j] = num;
			}
		}
		
		for(int i=0; i < arr.length; i++) {
			for(int j=0; j < arr[i].length; j++) {
				System.out.print(String.format("%-4d", arr[i][j]));
			}
			System.out.println();
		}
	}
}

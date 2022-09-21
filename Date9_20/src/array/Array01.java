package array;

public class Array01 {
	public static void main(String[] args) {
		int [] ar; //배열 선언 
		ar = new int [5]; //생성 
		ar[0] = 25;
		ar[1] = 78;
		ar[2] = 30;
		ar[3] = 43;
		ar[4] = 52;
		
		
		for(int i = 0; i < ar.length; i++) {
			if(ar[i]%2 == 0) {
				System.out.println(ar[i]);
			}
		}
		for(int i  : ar) {
			System.out.println(i);
		}
	}
}

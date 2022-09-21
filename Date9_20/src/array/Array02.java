package array;

public class Array02 {
	public static void main(String[] args) {
		String[] ar = { "사자","코끼리", "호랑이", "카멜레온", "오리너구리", "기린"};
		for(int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
			System.out.println(ar[i].length());
			System.out.println(ar[i].charAt(0));
			System.out.println(ar[i].charAt(ar[i].length()-1));
		}
		for(String st : ar) {
			System.out.println(st);
		}
	}
}

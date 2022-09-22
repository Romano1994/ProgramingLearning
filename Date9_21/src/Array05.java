
public class Array05 {
	public static void main(String[] args) {
		char[] charArr = new char[50];
		int[] count = new int[26];
		
		for(int i = 0; i < charArr.length; i++) {
			charArr[i] = (char)(Math.random() * 26 + 65);
		}
		
		for(int i = 0; i < charArr.length; i+=10) {
			for(int j = i; j <= i + 9; j++) {
				System.out.print(charArr[j] + "  ");
			}
			System.out.println();
		}
		
		for(int i = 0; i < charArr.length; i++) {
			for(int j = 0; j < count.length; j++) {
				if(charArr[i] == (char)(j+65)) {
					count[j] += 1;
				}
			}
		}
		
		for(int i = 0; i < count.length; i+=5) {
			for(int j = i; j <= i+5; j++) {
				System.out.print(((char)(j+65)) + " : " + count[j] + "  ");
			}
			System.out.println();
		}
		
	}
}

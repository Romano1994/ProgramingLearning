
import java.util.Scanner;



public class StringHomework {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		System.out.println("문자열 입력 : ");
		String input = scan.next();
		System.out.println("현재 문자열 입력 : ");
		String targetStr = scan.next();
		System.out.println("바꿀 문자열 입력 : ");
		String changeStr = scan.next();
		
//		for(int i=0; i<input.length(); i++) {
//			if(input.indexOf(targetStr, num) == i) {
//				num += i + targetStr.length();
//			}
//		}
		if(input.length() < targetStr.length()) {
			System.out.println("입력한 문자열의 크기가 작습니다");
		} else {
			input = input.toLowerCase();
			targetStr = targetStr.toLowerCase();
			changeStr = changeStr.toLowerCase();
			
			int count = 0;
			int index = 0;
			
			while ( (index = input.indexOf(targetStr, index)) != -1) {
				count++;
				index = index + targetStr.length();
			}
			
			System.out.println(input.replace(targetStr, changeStr));
		}
	}
}

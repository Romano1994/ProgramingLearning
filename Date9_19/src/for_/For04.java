package for_;

public class For04 {
	public static void main(String[] args) {
		int count = 0;
		for(int i = 1; i <= 100; i++) {
			char ch = (char)((Math.random() * 26) + 65);
			System.out.print(ch + " ");
			if (i % 10 == 0) {
				System.out.println();
			}
			if(ch == 'A') {
				count++;
			}
		}
		System.out.println("A의 개수는 " + count);
	}
}

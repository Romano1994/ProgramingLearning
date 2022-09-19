package for_;

public class For01 {
	public static void main(String[] args) {

//		for(int i = 1; i <= 10; ++i) {
//			System.out.println("Hello Java" + i);
//		}
		
		for(int i = 10 ; i <= 10; i++) {
			for(int j = 0; j <= 9; j++) {
				System.out.print(i - j + " ");
			}
		}
		System.out.println();
		
		for(int i = 10; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(char i = 'A'; i <= 'Z'; i++) {	//명시적으로 A라고 표기하는게 정수 65로 바꿔서 표기하는 것보다 가독성이 좋다
			System.out.print(i + " ");
		}
	}
}

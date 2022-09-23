package class_;

public class SungJukMain {
	public static void main(String[] args) {
		SungJuk hong = new SungJuk();
		
		hong.setData("홍길동", 90, 95, 100);
		hong.calc();
		for(int i=1; i<=55; i++) {
			System.out.print("-");
		}
		System.out.println();
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
		
		for(int i=1; i<=55; i++) {
			System.out.print("-");
		}
		System.out.println();
		
		hong.getData();
		
	}
}


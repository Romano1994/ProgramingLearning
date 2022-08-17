package variable;

public class Sungjuk {

	public static void main(String[] args) {
		
		String name = "홍길동";
		int kor = 90;
		int eng = 85;
		int math = 100;
		
		int tot = kor + eng + math;
		double avg = (double)tot / 3;
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.printf("%s    %d      %d       %d    %d     %.2f",name,kor,eng,math,tot,avg);
	}

}

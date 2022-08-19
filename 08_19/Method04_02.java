import java.util.Scanner;

class Score{
	String name;
	int kor, eng, math, tot, avg;
	
	void setData(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	void calc() {
		tot = kor + eng + math;
		avg = tot / 3;
	}
	void display() {
		System.out.println(name + "\t" +
				kor + "\t" +
				eng + "\t" +
				math + "\t" +
				tot + "\t" +
				avg + "\t");
	}
}

public class Method04_02 {

	public static void main(String[] args) {
		int tot = 1;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 입력:");
		String name = scan.next();
		System.out.print("국어 점수 입력:");
		int kor = scan.nextInt();
		System.out.print("영어 점수 입력:");
		int eng = scan.nextInt();
		System.out.print("수학 점수 입력:");
		int math = scan.nextInt();
		Score s1 = new Score();
		s1.setData(name, kor, eng, math);
		s1.calc();
		s1.display();		
		
		String str = "1"+2+3;
		System.out.println(str);
	

	}

}

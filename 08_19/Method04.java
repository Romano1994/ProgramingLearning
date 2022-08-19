import java.util.Scanner;

class Sungjuk{
	int sum(int kor, int eng, int math) {
		int total = kor + eng + math;
		return total;
	}
	int avg(int total) {
		int avg = total / 3;
		return avg;
	}
	void display(String name, int kor, int eng,int math, int sum, int avg) {
		System.out.println("이름 : " + name);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총합 : " + sum);
		System.out.println("평균 : "+ avg);
	}
}

public class Method04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("이름 입력:");
		String name = scan.next();
		System.out.print("국어 점수 입력:");
		int kor = scan.nextInt();
		System.out.print("영어 점수 입력:");
		int eng = scan.nextInt();
		System.out.print("수학 점수 입력:");
		int math = scan.nextInt();
		
		Sungjuk s1 = new Sungjuk();
		int total = s1.sum(kor, eng, math);
		int avg = s1.avg(total);
		s1.display(name, kor, eng, math, total, avg);
	}
}

//[문제] 이름, 국어, 영어, 수학 점수를 입력받아서 총점과 평균을 구하시오
//메소드: setData(?,?,?,?)
// 		calc - 총점과 평균을 계산
//		display
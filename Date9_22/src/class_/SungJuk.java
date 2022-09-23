package class_;

public class SungJuk {
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	private char grade;
	
	
	void setData(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	void calc() {
		tot = kor+eng+math;
		avg = tot / 3.0; 
		if(avg > 90) {
			grade = 'A';
		}else if(avg > 80) {
			grade = 'B';
		}else if(avg > 70) {
			grade = 'C';
		}else if(avg > 60) {
			grade = 'D';
		}else{
			grade = 'F';
		}
	}
	void getData() {
		System.out.print(name + "\t");
		System.out.print(kor + "\t");
		System.out.print(eng + "\t");
		System.out.print(math + "\t");
		System.out.print(tot + "\t");
		System.out.print(String.format("%.3f", avg) + "\t");
		System.out.print(grade + "\t");
	}
}

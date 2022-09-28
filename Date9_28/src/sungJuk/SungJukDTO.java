package sungJuk;

import java.util.Scanner;

public class SungJukDTO {
	private String name;
	private int num, kor, eng, math, tot, avg;
	Scanner scan = new Scanner(System.in);
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public String getName() {
		return name;
	}
	public int getNum() {
		return num;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public int getTot() {
		return tot;
	}
	public void setTot() {
		this.tot = this.math + this.eng + this.kor;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg() {
		this.avg = this.tot/3;
	}	
	
}

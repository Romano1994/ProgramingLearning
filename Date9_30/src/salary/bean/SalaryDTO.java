package salary.bean;

import java.util.Scanner;

public class SalaryDTO implements Comparable<SalaryDTO>{
	private double taxRate;
	private int num, basicSalary, bonus, salary;
	private String name, rank;
	
	Scanner scan = new Scanner(System.in);

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public Scanner getScan() {
		return scan;
	}

	public void setScan(Scanner scan) {
		this.scan = scan;
	}
	
	public double getTaxRate() {
		return taxRate;
	}
	
	public void calc() {
		if((basicSalary + bonus) > 4000000) {
			taxRate = 0.03;
		}else if((basicSalary + bonus) <= 4000000 && (basicSalary + bonus) > 2000000) {
			taxRate = 0.02;
		}else if((basicSalary + bonus) < 2000000) {
			taxRate = 0.01;
		}
		salary =(int)(basicSalary + bonus - ((basicSalary + bonus) * taxRate));
		
	}
	public int getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return num + "\t" + name + "\t" + rank + "\t" + basicSalary + "\t" + bonus + "\t" + taxRate + "\t" + salary;
	}

	@Override
	public int compareTo(SalaryDTO s) {
		return this.getName().compareTo(s.getName());
	}
	
}

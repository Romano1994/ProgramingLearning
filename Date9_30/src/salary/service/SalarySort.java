package salary.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import salary.bean.SalaryDTO;

public class SalarySort implements Salary{
	Comparator<SalaryDTO> com = new Comparator<SalaryDTO>() {
		@Override
		public int compare(SalaryDTO o1, SalaryDTO o2) {
			if(o1.getSalary() > o2.getSalary()) return 1;
			else if(o1.getSalary() < o2.getSalary()) return -1;
			else return 0;
		}
	};

	@Override
	public void execute(ArrayList<SalaryDTO> list) {
		System.out.println("1. 이름으로 오름차순 ");
		System.out.println("2. 월급으로 내림차순");
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		
		if(input == 1) {
			Collections.sort(list);
		}if(input == 2) {
			Collections.sort(list, com);
		}
	}


}

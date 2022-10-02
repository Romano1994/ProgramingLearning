package salary.service;

import java.util.ArrayList;
import java.util.Scanner;

import salary.bean.SalaryDTO;

public class SalarySearch implements Salary{
	Scanner scan = new Scanner(System.in);
	private String name;
	int sw;
	
	@Override
	public void execute(ArrayList<SalaryDTO> list) {
		System.out.print("검색할 사원 이름 입력 : ");
		name = scan.next();
		for(int i=0; i<list.size(); i++) {
			if(name.equals(list.get(i).getName())) {
				//사원이름이 일치하는 경우가 있을 경우 출력
				System.out.println("이름\t직급\t기본급\t수당\t세율\t월급");
				break; //출력후 바로 break
			}
		}
		for(int i=0; i<list.size(); i++) {
			if(name.equals(list.get(i).getName())) {
				System.out.println(list.get(i).getName() +"\t"
									+list.get(i).getRank() +"\t"
									+list.get(i).getBasicSalary() +"\t"
									+list.get(i).getBonus() +"\t"
									+list.get(i).getTaxRate()+"\t"
									+list.get(i).getSalary());
				sw = 1;
			}
		}
		if(sw == 0) {
			System.out.println("검색한 직원이 없습니다");
		}
	}

}

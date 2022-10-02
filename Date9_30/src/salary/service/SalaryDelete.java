package salary.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import salary.bean.SalaryDTO;

public class SalaryDelete implements Salary{
	int num;
	
	@Override
	public void execute(ArrayList<SalaryDTO> list) {
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 사원 번호 입력 : ");
		num = scan.nextInt();
		int count = 0;
		
		Iterator<SalaryDTO> iterator = list.iterator();
				
		while(iterator.hasNext()) {
			SalaryDTO salaryDTO = iterator.next();
			if(salaryDTO.getNum() == num) {
				iterator.remove();
				count++;
				System.out.println("삭제되었습니다");
			}
		}
		if(count == 0) {
			System.out.println("삭제할 사원이 없습니다");
		}		
	}

}

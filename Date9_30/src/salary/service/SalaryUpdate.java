package salary.service;

import java.util.ArrayList;
import java.util.Scanner;

import salary.bean.SalaryDTO;

public class SalaryUpdate implements Salary{
	
	Scanner scan = new Scanner(System.in);
	private int basicSalary, bonus, num;
	private String rank;
	int sw;
	
	@Override
	public void execute(ArrayList<SalaryDTO> list) {
		System.out.print("수정할 사원 번호 입력 : ");
		num = scan.nextInt();
		
		for(int i=0; i < list.size(); i++) {
			if(num == list.get(i).getNum()) { //입력한 번호가 갖다면
				System.out.print("수정할 직급 입력 : ");
				rank = scan.next();
				list.get(i).setRank(rank);
				
				System.out.print("수정할 기본급 입력 : ");
				basicSalary = scan.nextInt();
				list.get(i).setBasicSalary(basicSalary);
				
				System.out.println("수정할 수당 입력 : ");
				bonus = scan.nextInt();
				list.get(i).setBonus(bonus);
				System.out.println("수정을 완료했습니다");
				
				//업데이트할 정보를 입력받고 스위치 변수에 1저장
				sw = 1;
				
				list.get(i).calc();
			}
		}
		
		if(sw == 0) { //스위치 변수가 1로 바뀌지 않고 종료되면 출력
			System.out.println("수정할 직원이 없습니다");
		}
	}

}

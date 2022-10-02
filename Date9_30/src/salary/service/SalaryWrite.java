package salary.service;

import java.util.ArrayList;
import java.util.Scanner;

import salary.bean.SalaryDTO;

public class SalaryWrite implements Salary{
	Scanner scan = new Scanner(System.in);
	int num, basic, bonus, sw;
	String name, rank;
	SalaryDTO salaryDTO = new SalaryDTO();

	@Override
	public void execute(ArrayList<SalaryDTO> list) {
		
		while(true) {
			
			System.out.println();
			System.out.print("번호 입력 : ");
			num = scan.nextInt();
			
			for(int i=0; i < list.size(); i++) {
				if(num == list.get(i).getNum()) { //압력된 번호와 갖고 있는 번호 비교
					System.out.println("이미 있는 번호입니다"); // 같으면 출력
					sw = 1; // 스취이 변수 1로 바꿈
					break;
				}
			}	
			if(sw == 1) { //이미 있는 번호라면
				sw = 0; //새로운 while문을 위해 스위치 변수를 다시 0으로 저장
				continue;
			}else {
				//스위치 변수가 1이 아니라면 정상적으로 입력 받음
				salaryDTO.setNum(num);
				
				System.out.print("이름 입력 : ");
				name = scan.next();
				salaryDTO.setName(name);
				
				System.out.print("직급 입력 : ");
				rank = scan.next();
				salaryDTO.setRank(rank);
				
				System.out.print("기본급 입력 : ");
				basic = scan.nextInt();
				salaryDTO.setBasicSalary(basic);
				
				System.out.print("수당 입력 : ");
				bonus = scan.nextInt();
				salaryDTO.setBonus(bonus);
				
				System.out.println("입력되었습니다");
				
				salaryDTO.calc();
				list.add(salaryDTO);
				return;
			}
			
		}
	}
}

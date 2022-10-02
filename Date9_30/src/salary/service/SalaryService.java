package salary.service;

import java.util.ArrayList;
import java.util.Scanner;

import salary.bean.SalaryDTO;

public class SalaryService {
	
	Salary salary;
	public void menu() {
		ArrayList<SalaryDTO> list = new ArrayList<SalaryDTO>();
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println();
			System.out.println("*************");
			System.out.println("1. 등록 ");
			System.out.println("2. 출력 ");
			System.out.println("3. 수정 ");
			System.out.println("4. 검색 ");
			System.out.println("5. 삭제 ");
			System.out.println("6. 정렬 ");
			System.out.println("7. 종료 ");
			System.out.println("*************");
			System.out.print(" 번호 : ");
			int num = scan.nextInt();
			
			if(num == 7) break;
			if(num == 1) {
				salary = new SalaryWrite();
			}else if(num == 2) {
				salary = new SalaryPrint();
			}else if(num == 3) {
				salary = new SalaryUpdate();
			}else if(num == 4) {
				salary = new SalarySearch();
			}else if(num == 5) {
				salary = new SalaryDelete();
			}else if(num == 6){
				salary = new SalarySort();
			}else {
				System.out.println("번호를 다시 입력하세요");
				continue;
			}
			
			salary.execute(list);
		} //while
	}

}

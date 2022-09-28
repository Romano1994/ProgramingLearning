package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukService {
	SungJuk sungjuk;
	Scanner scan = new Scanner(System.in);
	private ArrayList<SungJukDTO> list = new ArrayList<SungJukDTO>();

//	public void setList() {
//		this.list.add(new SungJukDTO());
//	}
//	
//
//	public ArrayList<SungJukDTO> getList() {
//		return list;
//	}


	public void menu() {
		
			int num;
			while(true) {
				System.out.println();
				System.out.println("*************");
				System.out.println("1. 성적 입력 ");
				System.out.println("2. 리스트 출력 ");
				System.out.println("3. 성적 업데이트 ");
				System.out.println("4. 종료 ");
				System.out.println("*************");
				System.out.print(" 번호 : ");
				num = scan.nextInt();
				
				if(num == 4) break;
				if(num == 1) {
					System.out.println("INSERT");
					sungjuk = new SungJukInsert();
				}else if(num ==2) {
					System.out.println("LIST");
					sungjuk = new SungJukList();
				}else if(num ==3) {
					System.out.println("UPDATE");
					sungjuk = new SungJukUpdate();
				}else if(num == 4) {
					
				}
				sungjuk.execute(list);
			}
	}
}

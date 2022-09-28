package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukUpdate implements SungJuk{
	Scanner scan = new Scanner(System.in);
	int inputNum, updateKor, updateEng, updateMath;
	String updateName;
	
	public void execute(ArrayList<SungJukDTO> list) {
		System.out.println("번호 입력 : ");
		inputNum = scan.nextInt();
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNum() != inputNum) {
				if((list.size()-1) == i) {
					System.out.println("잘못된 번호 입니다.");
					return;
				}
			} else if(list.get(i).getNum() == inputNum){
				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
				System.out.print(list.get(i).getNum() + "\t");
				System.out.print(list.get(i).getName() + "\t");
				System.out.print(list.get(i).getKor() + "\t");
				System.out.print(list.get(i).getEng() + "\t");
				System.out.print(list.get(i).getMath() + "\t");
				System.out.print(list.get(i).getTot() + "\t");
				System.out.println(list.get(i).getAvg() + "\n");
				
				System.out.print("수정할 이름 입력 : ");
				updateName = scan.next();
				list.get(i).setName(updateName);
				System.out.print("수정할 국어 입력 : ");
				updateKor = scan.nextInt();
				list.get(i).setKor(updateKor);
				System.out.print("수정할 영어 입력 : ");
				updateEng = scan.nextInt();
				list.get(i).setEng(updateEng);
				System.out.print("수정할 수학 입력 : ");
				updateMath = scan.nextInt();
				list.get(i).setMath(updateMath);
				System.out.println("수정하였습니다");
				list.get(i).setTot();
				list.get(i).setAvg();
			}
		}
	}
}

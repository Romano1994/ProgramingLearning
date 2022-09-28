package sungJuk;

import java.util.ArrayList;

public class SungJukList implements SungJuk{
//	SungJukService service = new SungJukService(); 
	
	public void execute(ArrayList<SungJukDTO> list) {
		
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i).getNum() + "\t");
			System.out.print(list.get(i).getName() + "\t");
			System.out.print(list.get(i).getKor() + "\t");
			System.out.print(list.get(i).getEng() + "\t");
			System.out.print(list.get(i).getMath() + "\t");
			System.out.print(list.get(i).getTot() + "\t");
			System.out.println(list.get(i).getAvg() + "\t");
		}
	}
}

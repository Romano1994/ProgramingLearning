package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukInsert implements SungJuk{
	Scanner scan = new Scanner(System.in);
	String name;
	int num, kor, eng, math, tot, avg;
	
	public void execute(ArrayList<SungJukDTO> list) {
		SungJukDTO sung = new SungJukDTO();
		
		System.out.print("번호 입력 : ");
		num = scan.nextInt();
		sung.setNum(num);
		
		System.out.print("이름 입력 : ");
		name = scan.next();
		sung.setName(name);
		
		System.out.print("국어 점수 입력 : ");
		kor = scan.nextInt();
		sung.setKor(kor);
		
		System.out.print("영어 점수 입력 : ");
		eng = scan.nextInt();
		sung.setEng(eng);
		
		System.out.print("수학 점수 입력 : ");
		math = scan.nextInt();
		sung.setMath(math);
		sung.setTot();
		sung.setAvg();
		list.add(sung);
	}
	


}

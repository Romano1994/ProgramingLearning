import java.util.ArrayList;
import java.util.Scanner;

public class SungJukUpdate2 implements SungJuk2{
	Scanner scan = new Scanner(System.in);
	int num;
	
	@Override
	public void execute(ArrayList<SungJukDTO2> list) {
		System.out.println();
		System.out.print("번호 입력 : ");
		num = scan.nextInt();
		
		int sw = 0;
		for(SungJukDTO2 sungJukDTO2 : list) {
			if(sungJukDTO2.getNo() == num) {
				sw = 1;
				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
				System.out.print(sungJukDTO2.toString() + "\t");
				
				System.out.println();
				System.out.println("수정할 이름 입력 : ");
				String name = scan.next();
				System.out.println("수정할 국어 입력 : ");
				int kor = scan.nextInt();
				System.out.println("수정할 영어 입력 : ");
				int eng = scan.nextInt();
				System.out.println("수정할 수학 입력 : ");
				int math = scan.nextInt();
				
				sungJukDTO2.setName(name);
				sungJukDTO2.setKor(kor);
				sungJukDTO2.setEng(eng);
				sungJukDTO2.setMath(math);
				sungJukDTO2.calc();
			}
		} //for
		
		if(sw == 0)System.out.println("잘못된 번호입니다");
	}

}

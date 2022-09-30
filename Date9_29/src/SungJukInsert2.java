import java.util.ArrayList;
import java.util.Scanner;


public class SungJukInsert2 implements SungJuk2{
	Scanner scan = new Scanner(System.in);
	int num;
	private String name;
	private int kor;
	private int eng;
	private int math;

	@Override
	public void execute(ArrayList<SungJukDTO2> list) {
		System.out.println();
		System.out.print("번호 입력 : ");
		num = scan.nextInt();
		
		System.out.print("이름 입력 : ");
		name = scan.next();
		
		System.out.print("국어 점수 입력 : ");
		kor = scan.nextInt();
		
		System.out.print("영어 점수 입력 : ");
		eng = scan.nextInt();
		
		System.out.print("수학 점수 입력 : ");
		math = scan.nextInt();
		
		SungJukDTO2 sungJukDTO = new SungJukDTO2(num, name, kor, eng, math);
//		sungJukDTO.calc();
		
		list.add(sungJukDTO);
		System.out.println("입력되었습니다");
	}

}

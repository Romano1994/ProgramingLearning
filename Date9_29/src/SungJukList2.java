import java.util.ArrayList;

public class SungJukList2 implements SungJuk2 {

	@Override
	public void execute(ArrayList<SungJukDTO2> list) {
		
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i).getNo() +"\t"
//					+list.get(i).getNo() +"\t"
//					+list.get(i).getName() +"\t"
//					+list.get(i).getKor() +"\t"
//					+list.get(i).getEng() +"\t"
//					+list.get(i).getMath() +"\t"
//					+list.get(i).getTot() +"\t"
//					+list.get(i).getAvg() +"\t");
//		} //for
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}

}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SungJukDelete2 implements SungJuk2{

	@Override
	public void execute(ArrayList<SungJukDTO2> list) {
		Scanner scan = new Scanner(System.in);
		int count=0;
		
		System.out.println("삭제할 이름 입력 : ");
		String name =scan.next();
		
		Iterator<SungJukDTO2> iterator = list.iterator();
		
//		iterator.next(); //현재의 객체를 버퍼에 저장하고 다음으로 넘어간다
		while(iterator.hasNext()) {
			SungJukDTO2 sungJukDTO2 = iterator.next(); //Iterator생성할 때 제너릭을 안걸어주면 SungJukDTO2로 캐스팅 해야 함
			if(sungJukDTO2.getName().equals(name)) {
				iterator.remove(); //remove()는 반드시 next()가 반환하는 항목을 지운다
				count++;
			}
		}
		
//		for(int i=0; i<list.size(); i++) {
//			if(list.get(i).getName().equals(name)) {
//				list.remove(i);
//				--i; // list.size()가 줄어들기 때문에 i도 줄여준다
//				count++;
//			}
//		}
		if(count == 0) {
			System.out.println("삭제할 이름이 없습니다");
		}else {
			System.out.println("모든 데이터를 삭제했습니다");
		}
	}

}

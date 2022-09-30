package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMain {
	public static void main(String[] args) {
		Collection<String> coll = new ArrayList<String>(); //부모 객체를 참조해서 자식객체 생성
		coll.add("호랑이");
		coll.add("사자");
		coll.add("호랑이");
//		coll.get(0); // collection을 참조하고 있기 때문에 자식객체가 갖고 있는 .get();을 호출할 수 없음
		
		Iterator<String> it = coll.iterator(); 	//Collection에 저장된 객체들을 iterator하는 메서
		
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}

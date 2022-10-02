package collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorMain {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		
		System.out.println("벡터의 크기 : " + v.size()); //vector에 저장된 항목의 크기
		System.out.println("벡터의 용량 : " +v.capacity()); //vector의 기본 용량은 10개, 10개가 초과되면 10개 단위로 늘어난다
		System.out.println();
		
		System.out.println("항목 추가");
		for(int i=1; i<=10; i++) {
			v.add(i + "");
			System.out.println(v.get(i-1));
		}
		
		System.out.println("벡터의 크기 : " + v.size()); //vector에 저장된 항목의 크기
		System.out.println("벡터의 용량 : " +v.capacity()); //vector의 기본 용량은 10개, 10개가 초과되면 10개 단위로 늘어난다
		System.out.println();
		
		v.addElement(5 +"");	//vector는 중복 허용한다
		System.out.println(v.get(10));
		System.out.println("벡터의 크기 : " + v.size()); //vector에 저장된 항목의 크기
		System.out.println("벡터의 용량 : " +v.capacity()); //vector의 기본 용량은 10개, 10개가 초과되면 10개 단위로 늘어난다
		
		System.out.println("마지막 항목 삭제");
		v.remove("5"); //맨 앞에 있는 5가 삭제된다
		v.remove(10); // index 10번의 5가 삭제된다
		
		Iterator it = v.iterator();
		
		while(it.hasNext()) { // 내가 있는 위치에서 항목이 있으면 true, 없으면 false
			it.next(); //항목은 꺼내서 버퍼(임시공간)에 저장하고 다음 위치로 이동
		}
	}
}

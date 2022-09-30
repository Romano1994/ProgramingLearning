package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>(); //set은 중복허용 안됨 , 순서가 없음
		set.add("호랑이");
		set.add("사자");
		set.add("호랑이");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}

package collection;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("bool101", "백설공주");
		map.put("bool102", "인어공주");
		map.put("bool103", "백설공주"); // valu 중복 허용
		map.put("bool101", "엄지공주");//key중복 허용, 하지만 원래의 value를 덮어 씌운다
		
		System.out.println();
		
		
//		Map<String, int> map2 = new HashMap<String, int>(); //객체를 담아줘야 하기 때문에 int 못온다
		Map<String, Integer> map2 = new HashMap<String, Integer>(); //객체를 담아줘야 하기 때문에 int 못온다
		map2.put("book", 10);
		System.out.println(map2.get("book"));
	}
}

import java.util.ArrayList;

public class CollectionMain2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("호랑이");
		list.add("사자");
		list.add("호랑이");
//		list.add('a');
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		for(String data : list) {
			System.out.println(data);
		}
		
	}
}

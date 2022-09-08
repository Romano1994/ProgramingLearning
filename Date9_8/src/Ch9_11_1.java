import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringJoiner;

public class Ch9_11_1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(new Integer(100));
		
		int i = list.get(0);
//		int i  = list.get(0).intValue();
	}

}

import java.util.Iterator;
import java.util.StringJoiner;

public class Ch9_9 {


	public static void main(String[] args) {
		String animals = "dog , cat , pig , cow";
		String[] arr = animals.split(",");
		
		System.out.println(String.join("-", arr));
		
		StringJoiner sj = new StringJoiner("/", "[", "]");
		
		for(String s : arr) {
			sj.add(s);
		}
		System.out.println(sj);
	}
}

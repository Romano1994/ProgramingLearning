
public class Ch9_16 {
	public static void main(String[] args) {
		int i = 10;
		
		Integer intg = (Integer)i;
//		Integer intg = Integer.valueOf(i);
		
		Long lng = 100l;
		
		int i2 = intg + 10;
		long l = intg + lng;
		
		Integer intg2 = new Integer(20);	
		int i3 = (int)intg2;	
		
		String str = "123";
		System.out.println(String.valueOf(i) + i2);
		
	}
}

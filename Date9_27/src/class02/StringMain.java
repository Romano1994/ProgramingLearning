package class02;

public class StringMain {
	public static void main(String[] args) {
		String a = "apple";
		String b = "apple";
		
		String c = new String("apple");
		String d = new String("apple");
		
		String e = new String("apple");
		String f = e;
		
		System.out.println(e == f);
		System.out.println(e.equals(f));
		
		String g = "오늘 날짜는 " + 2022 + 9 + 27;
		System.out.println(e.length());
		System.out.println("부분 문자열 추출 : " + g.substring(7, 11));
		for(int i=0; i<g.length(); i++) {
			System.out.println(i +":" +g.charAt(i));
			
		}
		System.out.println("문자열 치환 : " + g.replace("날짜" , "일짜"));
	}
}

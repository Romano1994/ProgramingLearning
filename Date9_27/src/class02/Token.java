package class02;

import java.util.StringTokenizer;

public class Token {
	public static void main(String[] args) {
		String str = "학원, 집,,게임방";
		
		StringTokenizer st = new StringTokenizer(str, ",");
		System.out.println("토큰 개수 : " + st.countTokens()); // 빈 문자열은 count로 치지 않는다
		
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken()); // 토큰을 꺼내주고 다음 토큰으로 이동한다 (2가지 역할을 함)
		}
		System.out.println("-----------------------");
		String[] ar = str.split(",");
		for(String a : ar) {
			System.out.println(a);
		}
	}
}

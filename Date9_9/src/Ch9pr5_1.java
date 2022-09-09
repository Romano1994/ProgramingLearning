/*
 * delchar는 이용자가 입력한 값에서 제한된 문자열들을 제거하는 메서드입니다
 * 이용자가 문자열들을 src, 출력이 제힌된 문자열들을 delCh라고 정의합니다 
 */
public class Ch9pr5_1 {
	static String delchar(String src, String delCh) {
		StringBuffer sb = new StringBuffer(src.length());	// 입력된 문자열 src를 개별 문자로 나눠서 StringBuffer로 저장한 후 변수명을 sb라고 합니	
		
		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);	//문자열 src에서 i번째의 문자를 저장하고 문자형 변수 ch에 저장합니다 
			
			if(delCh.indexOf(ch) == -1) {	//만약 ch가 delCh에 포함되어 있지 않다면 
				sb.append(ch);	//	ch를 StringBuffer sb에 저장합니다 
			}
		}
		return sb.toString();	//sb를 String의 형태로 변환합니다 
	}
	public static void main(String[] args) {
		System.out.println(delchar("(1!2@3^4~5)" , "~!@#$%^&*()"));
		System.out.println(delchar("(1 2 3 4\t5)", " \t"));
	}

}

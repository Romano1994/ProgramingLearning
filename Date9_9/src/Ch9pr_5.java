public class Ch9pr_5 {
	/*
	 * delchar 메서드는 String src와 delch를 매개변수로 받으며
	 * 매개변수 src에서 delch에 포함되는 문자형 변수들을 삭제합니다
	 * 
	 *  String src는 사용자가 입력되는 String내용이고
	 *  String delch는 출력되어서는 안되는 제거 문자들 입니다 
	 */
	static String delchar(String src, String delCh) {
		StringBuffer srcSb = new StringBuffer(src); // src의 개별 문자들 StringBuffer srcSb에 담습니다
		
		for(int i = 0; i < delCh.length(); i++) {
			int num = src.indexOf(delCh.charAt(i)); // src에서 delCh의 i번째 변수가 포함된 index를 num이라고 정의합니다 
			if(num == -1) {
				continue;	//del의 i번째 문자가 src에 포함되어 있지 않으면 continue합니다 
			}else {
				src = new String(srcSb.deleteCharAt(num));	// del의 i번째 문자가 src에 포함되어 있다면 해당 문자를 srcSb에서 지운 뒤 src로 다시 형변환 저장합니다 
			}
		}
		src = new String(srcSb);
		return src;
	}
	public static void main(String[] args) {
//		System.out.println("(1!2@3^4~5) -> " + delchar("(1!2@3^4~5)", "~!@#$%^&*()"));
		System.out.println("(1 2 3 4\t5) -> " + delchar("(1 2 3 4\t5)", " \t"));
	}
}

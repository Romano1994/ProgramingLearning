import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author mac
 * 문자열 배열을 입력받아 전화번호를 주어진 배열에서 찾아서 출력하는 프로그램 
 */
public class Ch9pr_6 {

	public static void main(String[] args) {
		String[] phoneNumberArr = {	//저장된 전화번호 리스트. 입력된 전화번호의 일부가 해당 배열에 있으면 찾아서 출력함 
				"012-3456-7890",
				"099-2456-7980",
				"088-2346-9870",
				"013-3456-7890"
		};
		
		ArrayList list = new ArrayList();
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println(">>");
			String input = s.nextLine().trim();	//.trim은 양 끝에 있는 공백을 자른 결과를 반환한다. 중간 공백은 제거하지 않는다 
			
			if(input.equals("")) {
				continue;
			}else if (input.equalsIgnoreCase("Q")) {	// String.equalsIgnoreCase는 String에 해당 문자가 포함되어 있는지 대소문자 구분 없이 비교 
				System.exit(0);	// 무조건 종료 
			}
			String regex = ".*"+input+".*";
			Pattern pattern = Pattern.compile(regex);
			
			for(int i = 0; i < phoneNumberArr.length; i++) {
				String phoneNumber = phoneNumberArr[i];
				String tmp = phoneNumber.replace("-", "");
				
				Matcher matcher = pattern.matcher(tmp);
				if(matcher.find()) {
					list.add(phoneNumber);
				}
			}
//			Pattern pattern = Pattern.compile("^[0-9]*$");	//비교에 이용할 정규식 저장 
//			Matcher matcher = pattern.matcher(input); //비교에 이용할 input값을 저장 
//			matcher.find();
//			if(matcher.matches()) {
//				for(int i = 0; i < phoneNumber.length; i++) {
//					if(phoneNumber[i].indexOf(matcher.group()) != -1) {
//						list.add(phoneNumber[i]);
//					}
//				}
//			}
			if(list.size() > 0) {
				System.out.println(list);
				list.clear();
			} else {
				System.out.println("일치하는 번호가 없습니다 ");
			}
		}
	}
}


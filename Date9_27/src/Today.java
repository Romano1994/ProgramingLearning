import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Today {
	public static void main(String[] args) throws ParseException {
		Date date = new Date(); //오늘 날짜를 가져온다
		System.out.println("오늘 날짜 : " + date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("y년 MM월 dd일 E요일 HH:mm:ss"); //원하는 시간 format으로 표시한다
		System.out.println("오늘 날짜 : " + sdf.format(date));
		System.out.println();
		
		//내 생일 - 1991 / 07/ 15 10:35:15
		SimpleDateFormat input = new SimpleDateFormat("yyyyMMddHHmmss");
		Date birth = input.parse("19910716103515"); // String -> Date타입으로 변환
		
		System.out.println("내생일 : " + birth);
		System.out.println(sdf.format(birth));
		
		
	}
}

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class NumberMain {
	public static void main(String[] args) {
		
//	NumberFormat nf = new NumberFormat(); // 추상 클래스이기 때문에 직접적으로 생성할 수 없다
		DecimalFormat df = new DecimalFormat(); // 추상 클래스이기 때문에 직접적으로 생성할 수 없다
		
		System.out.println(df.format(12345678.456789));
		System.out.println(df.format(12345678));
		System.out.println();
		
		NumberFormat nf2 = new DecimalFormat("#,###.##원");
		System.out.println(nf2.format(12345678.456789));
		System.out.println(nf2.format(12345678));
		System.out.println();
		
		NumberFormat nf3 = new DecimalFormat("#,###.00원");
		System.out.println(nf3.format(12345678.456789));
		System.out.println(nf3.format(12345678));
		System.out.println();
		
		NumberFormat nf4 = NumberFormat.getInstance(Locale.US);
		NumberFormat nf5 = NumberFormat.getCurrencyInstance(Locale.US);
		
		nf4.setMaximumFractionDigits(5); // 소수이하 5째 자리까지 표시한다
		nf4.setMinimumFractionDigits(2); // 정수로 소수점이 없을 때 소수점 아래 2자리까지 반환한다
		System.out.println(nf4.format(12345678.456789));
		System.out.println(nf4.format(12345678));
		System.out.println();
		
//		Calendar cal = new Calendar(); Calendar는 추상 클래스이기 때문에 객체 생성 불가
		
		Calendar cal = new GregorianCalendar(); // Sub 클래스를 이용하여 생성
		//메소드를 이용하여 생서
		Calendar cal2 = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		String weekString ="";
		switch(week) {
		case 1: weekString = "일"; break;
		case 2: weekString = "월"; break;
		case 3: weekString = "화"; break;
		case 4: weekString = "수"; break;
		case 5: weekString = "목"; break;
		case 6: weekString = "금"; break;
		case 7: weekString = "토"; break;
		}
		System.out.println(year + "년 " + month + "월 " + date + "일 " + weekString +"요일 " + hour + " : " + minute + " : " + second);
		
	}
}

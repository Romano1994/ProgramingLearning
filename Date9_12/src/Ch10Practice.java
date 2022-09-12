import java.util.Calendar;

public class Ch10Practice {
	public static void main(String[] args) {
		System.out.println(getDayDiff("20010103", "20010101"));
	}

	/**
	 * @param yyyymmdd1 비교에 사용할 날짜를 입력 
	 * @param yyyymmdd2 비교에 사용할 날짜를 입력 
	 * @return 첫번째 매개변수와 두번째 매개변수의 시간 차이를 반환 
	 */
	static int getDayDiff(String yyyymmdd1, String yyyymmdd2) {
		int diff = 0;
		try {
			int year1 = Integer.parseInt(yyyymmdd1.substring(0, 4));	//입력받은 첫번째 매개변수에서 년도를 추출 
			int month1 = Integer.parseInt(yyyymmdd1.substring(4, 6)) - 1; 
			//입력받은 첫번째 매개변수에서 년도를 추출. Calender.MONTH로 추출했을 때는 배열의 형태로 출력되기 때문에 -1을 해줘야 한다 
			int day1 = Integer.parseInt(yyyymmdd1.substring(6, 8));	//입력받은 첫번째 매개변수에서 년도를 추출 

			int year2 = Integer.parseInt(yyyymmdd1.substring(0, 4));
			int month2 = Integer.parseInt(yyyymmdd2.substring(4, 6)) - 1;
			int day2 = Integer.parseInt(yyyymmdd2.substring(6, 8));

			Calendar date1 = Calendar.getInstance();
			Calendar date2 = Calendar.getInstance();
			date1.set(year1, month1, day1);
			date2.set(year2, month2, day2);

			diff = (int) ((date1.getTimeInMillis() - date2.getTimeInMillis()) / (24 * 60 * 60 * 1000));
		} catch (Exception e) {	//예외가 발생했을 때는 diff의 값을 0으로 반환한다 
			diff = 0;
		}
		return diff;
	}
}

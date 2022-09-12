import java.util.Calendar;

public class Ch10_3 {
	public static void main(String[] args) {
		final int[] TIME_UNIT = {3600, 60, 1};
		final String[] TIME_UNIT_NAME = {"시간 ", "분 ", "초 "};
	
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		
		time1.set(Calendar.HOUR_OF_DAY, 10);
		time1.set(Calendar.MINUTE, 20);
		time1.set(Calendar.SECOND, 30);
		
		time2.set(Calendar.HOUR_OF_DAY, 20);
		time1.set(Calendar.MINUTE, 30);
		time1.set(Calendar.SECOND, 10);
		
		System.out.println(time1.get(Calendar.HOUR_OF_DAY) +"시 " + time1.get(Calendar.MINUTE) + "분 " + time1.get(Calendar.SECOND) + "초");
		System.out.println(time2.get(Calendar.HOUR_OF_DAY) +"시 " + time2.get(Calendar.MINUTE) + "분 " + time2.get(Calendar.SECOND) + "초");
		
		long difference = Math.abs(time2.getTimeInMillis() - time1.getTimeInMillis()) / 1000;
		System.out.println(difference);
		
		String tmp = "";
		for(int i = 0; i < TIME_UNIT.length; i++) {
			//거스름돈 문제와 같다
			tmp += difference / TIME_UNIT[i] + TIME_UNIT_NAME[i]; //시간을 나누고
			difference %= TIME_UNIT[i]; //계산 후 남은 값을 저장해서 다음 분 혹은 초 계산을 위해 저장한다
		}
		System.out.println(tmp);
	}
}

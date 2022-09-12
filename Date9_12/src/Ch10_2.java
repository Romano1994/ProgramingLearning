import java.util.*;


public class Ch10_2 {

	public static void main(String[] args) {
		final String[] DAY_OF_WEEK = {"" , "일", "월", "화", "수", "목","금", "토"};
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.set(2022, 3, 29);
		System.out.println("date1은 "+ toString(date1) +DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일");
		System.out.println("date2은 "+ toString(date2) +DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "요일");
		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis())/ 1000;
		System.out.println(difference);
		System.out.println(difference / (60*60));
		System.out.println(difference / (60*60*24));
		
	}
	static String toString(Calendar date) { 
		return date.get(Calendar.YEAR) + "년 " + date.get(Calendar.MONTH) + "월 " + date.get(Calendar.DATE) + "일 ";  
	}

}

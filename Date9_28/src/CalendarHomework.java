import java.util.Calendar;
import java.util.Scanner;

public class CalendarHomework {
	private int year, month, week, lastDay;
	
	public CalendarHomework() {
		Scanner scan = new Scanner(System.in);
		System.out.println("연도 입력 : ");
		year = scan.nextInt();
		System.out.println(" 입력 : ");
		month = scan.nextInt();
	}
	
	public void calc() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		
		week = cal.get(Calendar.DAY_OF_WEEK);
		lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
	}
	
	public void display() {
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		for(int i=1;  i<week; i++) {
			System.out.print("\t");
		}
		for(int i=1 ; i<=lastDay; i++) {
			System.out.print(i + "\t");
			if(week%7 == 0) {
				System.out.println();
			}
			week++;
		}
	}
	public static void main(String[] args) {
		CalendarHomework calendarHomework = new CalendarHomework();
		calendarHomework.calc();
		calendarHomework.display();
	}
}

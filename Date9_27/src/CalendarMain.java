
import java.util.Calendar;
import java.util.Scanner;

public class CalendarMain {
	Scanner scan = new Scanner(System.in);
	Calendar cal = Calendar.getInstance();
	int firstDay;
	int lastDate;
	String year;
	String month;
	int date;
	
	public static void main(String[] args) {
		CalendarMain calmain = new CalendarMain();
		calmain.calc();
		calmain.display();
	}
	
	CalendarMain(){
		System.out.println("년도 입력 : ");
		year = scan.next();
		System.out.println("월 입력 : ");
		month = scan.next();
		
		cal.set(Integer.parseInt(year) ,Integer.parseInt(month)-1 , 1);
	}
	
	public void calc() {
		firstDay = cal.get(Calendar.DAY_OF_WEEK); //1일의 요일 저장
		lastDate = cal.getActualMaximum(Calendar.DAY_OF_MONTH); //마지막날 리턴
	}
	
	public void display() {
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int i=1; i<firstDay; i++) {
			System.out.print("\t");
		} //1일의 요일까지 탭 출력
		while(true) {
			System.out.print(cal.get(Calendar.DATE) + "\t");
			
			//토요일에서 줄바꿈
			if(cal.get(Calendar.DAY_OF_WEEK) == 7) {
				System.out.println();
			}
			
			// 마지막 날에 도달하면 break
			if(cal.get(Calendar.DATE) == lastDate) {
				break;
			}
			cal.add(Calendar.DATE, 1);
		}
	}
}
/*
[문제] 만년달력
- 년도, 월을 입력하여 달력을 작성하시오
- 기본생성자 : 입력
- 메소드 : calc() -> 매달 1일의 요일이 무엇인지? (Calendar에 메소드 준비)
                -> 매달 마지막이 28, 29, 30, 31 무엇인지? (Calendar에 메소드 준비)
         display() 출력

[실행결과]
년도 입력 : 2002
월 입력 : 10   

일   월   화   수   목   금   토
      		1   2   3   4   5
6    7   8    9   10   11   12
13  14  15  16  17  18  19
20  21  22  23  24  25  26
27  28  29  30  31

.getActualMaximum(Calendar.DAY_OF_MONTH); =>말일 리턴

 */
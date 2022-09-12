import java.util.Calendar;

public class Ch10_5 {
	/**
	 * @param args	arg[0]의 값을 년으로 입력하고 arg[1]의 값을 월으로 입력 
	 */
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Usage : java Ex1-_5 2019 9");	//arg에 충분한 값이 입력되지 않았을 경우 sout 출력 후 종료 
			return;
		}
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int START_DAY_OF_WEEK = 0;
		int END_DAY = 0;

		Calendar sDay = Calendar.getInstance();	// 정상 달력
		Calendar eDay = Calendar.getInstance();	// 끝 날짜에 사용할 다음 달의 달력 

		sDay.set(year, month - 1, 1);	
		eDay.set(year, month, 1);

		eDay.add(Calendar.DATE, -1);	//마지막 날을 구하기 위해 한달 후의 달력에서 -1일을 한다 

		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);	//시작 날짜의 요일 

		END_DAY = eDay.get(Calendar.DATE);	//마지막일 저장 

		System.out.println("      " + args[0] + "년 " + args[1] + "월 ");
		System.out.println(" SU MO TU WE TH FR SA");

		for (int i = 1; i < START_DAY_OF_WEEK; i++) {
			System.out.print("   ");	//처음의 요일-1 만큼 빈문자열을 출력 
		}
		for (int i = 1, n = START_DAY_OF_WEEK; i <= END_DAY; i++, n++) {
			System.out.print((i < 10) ? "  " + i : " " + i);
			if(n%7 == 0) {	//요일이 7로 나눠진다면 토요일 => 줄바꿈 
				System.out.println();
			}
		}
	}
}


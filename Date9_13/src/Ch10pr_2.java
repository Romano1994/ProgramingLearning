import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ch10pr_2 {
    /**
     * 입력받은 날짜의 요일을 반환하는 메서드
     * 날짜 입력은 "yyyy/MM/dd"의 형식으로 받으며
     * 양식에 맞지 않은 날짜를 입력히면
     * 입력을 요구하는 창이 다시 뜬다
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pattern = "yyyy-MM-dd";
        DateFormat dateFormat = new SimpleDateFormat(pattern);
        String[] days = {"", "일", " 월", "화", "수", "목", "금", "토"};
        Date inputDate = null;

        System.out.println("날짜를 " + pattern + "의 형식으로 입력하세요");
        while (scanner.hasNextLine()) {
            try {
                inputDate = dateFormat.parse(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("날짜를 " + pattern + "의 형식으로 입력하세요");
            }
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(inputDate);
        System.out.println("입력하신 날찌는 " + days[calendar.get(Calendar.DAY_OF_WEEK)]+"요일 입니다.");

    }
}

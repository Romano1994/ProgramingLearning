import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ch10_10 {
    public static void main(String[] args) {
        String pattern = "yyyy/MM/dd";
        DateFormat df = new SimpleDateFormat(pattern);
        Scanner s = new Scanner(System.in);

        Date inDate = null;

        System.out.println("날짜를 " + pattern + "형식으로 입력해 주세요");

        while (s.hasNextLine()){
            try{
                inDate = df.parse(s.nextLine());
                break;
            } catch (Exception e){
                System.out.println("날짜를 " + pattern + "형식으로 다시 입력해 주세요");
            }
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(inDate);
        Calendar today = Calendar.getInstance();

        long day = (today.getTimeInMillis() - cal.getTimeInMillis())/(60 * 60 * 1000);
        System.out.println("입력하신 시간은 현재 시간과 " + day + "차이가 있습니다");
    }
}

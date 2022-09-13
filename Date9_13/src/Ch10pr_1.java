import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ch10pr_1 {
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();
        today.set(2023, 1 , 8);
        System.out.println(today.get(Calendar.WEEK_OF_MONTH));
        System.out.println(today.get(Calendar.DAY_OF_WEEK));

//        for(int i = 1; i < 365; i++){
//            if((today.get(Calendar.WEEK_OF_MONTH) == 2) && (today.get(Calendar.DAY_OF_WEEK) == 1)){
//                System.out.println(today.get(Calendar.DATE));
//            }
//            today.add(Calendar.DATE, 1);
//        }
    }
}

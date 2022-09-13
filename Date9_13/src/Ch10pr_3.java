import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ch10pr_3 {
    public static void main(String[] args) {
        Calendar fromCal = Calendar.getInstance();
        Calendar toCal = Calendar.getInstance();

        fromCal.set(2020, 0, 1);
        toCal.set(2020,0, 1);
        printResult(fromCal, toCal);

        fromCal.set(2020, 0, 21);
        toCal.set(2020, 0, 21);
        printResult(fromCal, toCal);

        fromCal.set(2020, 0, 1);
        toCal.set(2020, 2, 1);
        printResult(fromCal, toCal);

        fromCal.set(2020, 0, 1);
        toCal.set(2020, 2 , 23);
        printResult(fromCal, toCal);

        fromCal.set(2020, 0, 23);
        toCal.set(2020, 2, 23);
        printResult(fromCal, toCal);

        fromCal.set(2020, 0, 22);
        toCal.set(2020, 2, 21);
        printResult(fromCal, toCal);
    }

    static int paycheckCount(Calendar from, Calendar to){
        int monDiff;
        monDiff = to.get(Calendar.MONTH) - from.get(Calendar.MONTH);
        if(from == null || to == null){
            monDiff = 0;
        }else if((from == to) && (from.get(Calendar.DATE) == 21)){
            monDiff = 1;
        }
        if(monDiff < 0){
            monDiff = 0;
        } else if ((from.get(Calendar.DAY_OF_MONTH) <= 21) && (to.get(Calendar.DAY_OF_MONTH) >= 21)) {
            monDiff += 1;
        }else if((from.get(Calendar.DAY_OF_MONTH) > 21) && (to.get(Calendar.DAY_OF_MONTH) < 21)){
            monDiff -= 1;
        }
        return monDiff;
    }
    static void printResult(Calendar from, Calendar to){
        Date fromDate = from.getTime();
        Date toDate = to.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.print(sdf.format(fromDate) + " ~ " + sdf.format(toDate) + ":");
        System.out.println(paycheckCount(from, to));
    }

}

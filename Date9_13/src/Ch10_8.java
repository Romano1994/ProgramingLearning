import java.text.SimpleDateFormat;
import java.util.Date;

public class Ch10_8 {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat sdf1, sdf2, sdf3, sdf4, sdf5, sdf6, sdf17, sdf8;

        sdf1 = new SimpleDateFormat("D번쩨 날입니다");
        sdf5 = new SimpleDateFormat("d번째 날입니다");
        sdf2 = new SimpleDateFormat("w번째 주입니다");
        sdf3 = new SimpleDateFormat("W번재 주입니다");
        sdf4 = new SimpleDateFormat("F번쩨 E요일 입니다");

        System.out.println(sdf1.format(today));
        System.out.println(sdf5.format(today));
        System.out.println(sdf2.format(today));
        System.out.println(sdf3.format(today));
        System.out.println(sdf4.format(today));
    }
}

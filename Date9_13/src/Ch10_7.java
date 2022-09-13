import java.text.DecimalFormat;

public class Ch10_7 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###.##");
        DecimalFormat df2 = new DecimalFormat("#.###E0");
        NumberChange nc = new NumberChange();
        nc.numChange(df, df2);
    }
}
class NumberChange{
    /**
     * Number의 형식으로 입력된 숫자를 1차 DecimalFormat으로 바꾸고 출력
     * 이를 double의 형식으로 바꾼 다음에 출력
     * 다시 다른 DecimalFormat으로 바꾼 다음에 출력한다
     *
     * @param df 1차 가공에 사용할 DecimalFormat
     * @param df2 2차 가공에 사용할 DecimalFormat
     * @return  바뀌는 과정을 System.out.print으로 나타낸다
     */
    void numChange(DecimalFormat df, DecimalFormat df2) {
        try{
            Number num = 1234567.89; //
            String change1 = df.format(num);
            System.out.print(change1 + " -> ");

            double d = num.doubleValue();
            System.out.print(d + " -> ");

            String change2 = df2.format(d);
            System.out.println(change2);
        } catch (Exception e){
        }
    }
}

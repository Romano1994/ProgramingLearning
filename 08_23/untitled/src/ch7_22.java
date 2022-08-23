public class ch7_22 {
    public static void main(String[] args) {
    Time time = new Time();
    time.setHour(20);
    }
}
class Time{
    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (0 <= hour && hour <= 23){
            this.hour = hour;
            System.out.printf("hour = %d", hour);
        } else{
            return;
        }
    }
}
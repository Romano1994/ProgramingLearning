import java.util.Arrays;

public class ch05_05 {
    public static void main(String[] args) {
        int[] ball = new int[45];

        for(int i=0; i < ball.length; i++){
            ball[i] = i+1;
        }

        for(int i=0; i < 6; i++){
            int j = (int)(Math.random() * ball.length);
            int tmp = ball[i];
            ball[i] = ball[j];
            ball[j] = tmp;
            System.out.printf("ball [%d] = %d%n", i, ball[i]);
        }
    }
}

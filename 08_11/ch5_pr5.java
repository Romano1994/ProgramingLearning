import java.util.Arrays;

public class ch5_pr5 {
    public static void main(String[] args) {
        int[] ballArr = {1,2,3,4,5,6,7,8,9};
        int[] ball3 = new int[3];

        for(int i=0; i < ballArr.length; i++){
            int j = (int)(Math.random()*ballArr.length);
            int tmp = 0;
            
            tmp = ballArr[i];
            ballArr[i] = ballArr[j];
            ballArr[j] = tmp;
        }
        for(int i=0; i<=2; i++){
            ball3[i] = ballArr[i];
        }
        System.out.println(Arrays.toString(ball3));

    }
}

import java.util.Arrays;

public class ch05_04 {
    public static void main(String[] args) {
        int[] numArr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(numArr));

        for(int i=0; i < numArr.length; i++){
            int j = (int)(Math.random()*numArr.length);
            int tmp = numArr[j];
            numArr[j] = numArr[i];
            numArr[i] = tmp;
        }
        System.out.println(Arrays.toString(numArr));
    }
}

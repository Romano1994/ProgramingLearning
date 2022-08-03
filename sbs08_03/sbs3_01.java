/**
 * sbs3_01
 */
public class sbs3_01 {
    public static void main(String[] args) {
        for (int  i = 1; i <= 5; i++){
            int k = 5;
            while(k-i > 0) {
                System.out.print(" ");
                k--;
            }
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//      *
//     **
//    ***
//   ****
//  *****
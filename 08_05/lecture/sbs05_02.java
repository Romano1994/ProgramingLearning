public class sbs05_02 {
    public static void main(String[] args) {
        int [][] sc = {{90, 100}, {78, 98}, {82, 90}};
        for(int i = 0; i <= sc.length; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(sc[i][j]);
            }
            System.out.println();
        }
    }
}

// public class Lec0805 {
//     public static void main(String[] args) {
        
//         int[][] score = {{90, 100}, {78, 98}, {82, 90}}; 
//         for(int i = 0; i < score.length; i++){
//             int[] inScore = score[i];
//             for(int j = 0; j < inScore.length; j++){
//                 System.out.print(inScore[j]+"\t");
//             }
//             System.out.println();
//         }
//     }
// }

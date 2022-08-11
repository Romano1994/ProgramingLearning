public class ch05_09 {
    public static void main(String[] args) {
        int[][] score = {
            {100,100,100},
            {20,20,20},
            {30,30,30},
            {40,40,40},
            {50,50,50}
        };
        int korTotal = 0, engTotal = 0, mathTotal = 0;

        System.out.println("번호 국어 영어 수학 총점 평균");
        System.out.println("=============================");

        for(int i=0; i < score.length; i++){
            int sum = 0;
            int avg = 0;
            int count = 0;
            System.out.print (i+1 + "    ");
            for(int j=0; j< score[i].length; j++){
                System.out.print (score[i][j] + "    ");
                sum += score[i][j];
                count += 1;
            }
            System.out.print(sum + " ");
            System.out.println(sum/count);
            korTotal += score[i][0];
            engTotal += score[i][1];
            mathTotal += score[i][2];
        }
        System.out.println("=============================");
        System.out.printf("총점: %d %d %d",korTotal,engTotal,mathTotal);

    }
}

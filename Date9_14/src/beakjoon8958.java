import java.util.Scanner;

public class beakjoon8958 {
    /**
     * 입력된 답들의 총점을 매긴다
     * 만약 정답을 표현하는 "O"의 앞에 "O"이 있다면 +1을 한다
     * 예) OOOXXOO => 1+2+3+1+2 =>9점
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();  //채점식의 갯수를 입력
        String[] answerArr = new String[count]; //채점식을 저장하기 위한 String 배열
        int score = 0;  //각각 배열 단위의 점수
        int sumScore = 0;   //연속 점수 저장

        for (int i = 0; i < answerArr.length; i++){    //입력된 채점식의 수만큼 반복
            answerArr[i] = scanner.next();
        }
        for (int j = 0; j < count; j++ ){
            sumScore = 0;
            score = 0;
            for (int i = 0; i < answerArr[j].length(); i++){
                if(answerArr[j].charAt(i) == 'O'){
                    sumScore++;
                }else {
                    sumScore = 0;
                }
                score += sumScore;
            }
            System.out.println(score);
        }
    }
}
//                if (answerArr[j].charAt(i) == 'O'){ //만약 채점 결과가 'O'일 경우
//                    score ++;   // score에 1점 추가
//                    score += sumScore;  //score에 sumScore에 저장된 int 추가
//                    sumScore++; //sumScore에 1점 추가
//                } else {    //만약 채점 결과가 'O'이 아닐 경우
//                    sumScore = 0;  //sumScore에 0 저장
//                }
//                if(answerArr[j].charAt(i - 1) == 'O'){
//                    sumScore++;
//                }

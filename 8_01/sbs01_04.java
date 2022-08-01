import java.util.Scanner;
public class sbs01_04 {
    public static void main(String[] args) {
        System.out.println("점수를 입력하세요");
        String scholarship = " ";
        int scoreMath = 0;
        int scoreEng = 0;
        Scanner scanner = new Scanner(System.in);
        scoreMath = scanner.nextInt();
        scoreEng = scanner.nextInt();

        if(scoreEng >= 90 && scoreMath >= 90) {
            scholarship = "전액 장학금입니다";
        } else if (scoreEng >= 90 || scoreMath >=90) {
            scholarship = "반액장학금입니다";
        } else {
            scholarship = "이번학기 장학생이 아닙니다";
        }
        System.out.println(scholarship);
    }
}

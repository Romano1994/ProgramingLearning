import java.util.Scanner;

public class ch4_8 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';
        char opt = '0';

        System.out.println("점수를 입력해 주세요");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();
        System.out.printf("당신의 점수는 %d 입니다.%n", score);

        if (score >= 90) {
            grade = 'A';
            if (score >= 98) {
                opt = '+';
            } else if (score <= 93) {
                opt = '-';
            }
        } else if (score >= 80) {
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if (score <= 83) {
                opt = '-';
            }
        } else if (score >= 70) {
            grade = 'C';
            if (score >= 78) {
                opt = '+';
            } else if (score <= 73) {
                opt = '-';
            }
        } else if (score >= 60 ){
            grade = 'D';
            if (score >= 68) {
                opt = '+';
            } else if (score <= 63) {
                opt = '-';
            }
        } else{ 
            grade = 'F';
        }
       
        System.out.printf("%c%c", grade, opt);
    }
}

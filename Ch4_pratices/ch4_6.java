import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class ch4_6 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';
        System.out.println("점수를 입력하세요.");
        
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();
        

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println(grade);
    }   
}

import java.util.Arrays;
import java.util.Scanner;

public class ch05_10 {
    public static void main(String[] args) {
        String [][] words = {
            {"chair", "의자"},
            {"computer", "컴퓨터"},
            {"integer","정수"}
        };
        System.out.println(words[0][0]);
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i < words.length; i++){
            System.out.printf("%s의 뜻은?", words[i][0]);
            String answer = scanner.nextLine();
            if(words[i][1].equals(answer)){
                System.out.println("정답입니다");
            } else {
                System.out.println("오답입니다");
                break;
            }
        }
    }
}

import java.util.Scanner;

public class Error {
	public static void main(String[] args) {
		      Scanner sc = new Scanner(System.in);
		      
		      int count = 0;
		      int score;
		      
		      for( int round = 1; round<=5; round++){
		         int a=(int)(Math.random()* 90 + 10); //10~99 사이
		         int b=(int)(Math.random()* 90 + 10); //10~99 사이
		         
		         for(int j=1; j<=2; j++) {
		            
		            System.out.print("["+ round +"]" + a + " + " + b + " = ");
		            int answer = sc.nextInt();
		            if (answer == (a+b)) {
		               System.out.println("딩동댕");
		               count++;
		               break;         
		            }
		            else System.out.println("틀렸다");
		            if(j == 2) System.out.println("정답은" + (a+b));
		            System.out.println();
		                     
		         }//for j
//		         System.out.println("또 할래(Y/N) : ");
//		         String go = sc.next();
//		         if(go.equals("N") && go.equals("n")) {
//		            System.out.println("프로그램을 종료합니다.");
//		         }
		      }// for round
		      score = 20*count;
		      System.out.println("당신은 총" + count + "문제를 맞추어서 점수는" + score + "입니다");
		      

		      
		      


	}

}

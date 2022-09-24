package contructor;

import java.util.Scanner;

public class ExamMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		Exam hong = new Exam();
				
		hong.compare();
		
		System.out.println("이름\t1 2 3 4 5\t점수");
		System.out.print(hong.getName() + "\t");
		for(int i=0; i<hong.getOx().length; i++) {
			System.out.print(hong.getOx()[i] + " ");
		}
		System.out.print("\t");
		System.out.println(hong.getScore());
	}
}

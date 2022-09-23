package multi;

import java.util.Scanner;

public class MultiArray05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("인원수 : ");
		int cnt = scan.nextInt();
		String[][] subject = new String[cnt][];
		int[][] jumsu = new int[cnt][];
		int[] tot = new int[cnt];
		double[] avg = new double[cnt];
		String[] name = new String[cnt];
		
		for(int i=0; i<cnt; i++) {
			System.out.print("이름입력 : ");
			name[i] = scan.next();
			
			System.out.println("과목수 입력 : ");
			int subjectCnt = scan.nextInt();
			
			subject[i] = new String[subjectCnt];
			for(int j=0; j<subjectCnt; j++) {
				System.out.print("과목명 입력 : ");
				subject[i][j] = scan.next();
			}
			
			jumsu[i] = new int[subjectCnt];
			for(int j=0; j<subjectCnt; j++) {
				System.out.print("점수 입력 : ");
				jumsu[i][j] = scan.nextInt();
			}
			
			for(int j=0; j<subject[i].length; j++) {
				tot[i] += jumsu[i][j];
			}
			avg[i] = tot[i]/subjectCnt;
			
			System.out.println("----------------------------------------");
		} // for
		
		for(int i=0; i < cnt; i++) {
			System.out.print("이름\t");
			for(int j=0; j<subject[i].length; j++) {
				System.out.print(subject[i][j] + "\t");
			}
			System.out.print("총점" + "\t");
			System.out.println("평균");
			System.out.print(name[i] + "\t");
			for(int j=0; j<subject[i].length; j++) {
				System.out.print(jumsu[i][j] + "\t");
			}
			System.out.print(tot[i] + "\t");
			System.out.println(avg[i]);
			
		}
		
	}
}

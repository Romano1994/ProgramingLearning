package contructor;

import java.util.Scanner;

public class Exam {
	Scanner scan = new Scanner(System.in);
	
	private String name;
	private String dap;
	private char[] ox = new char[5];
	private int score;
	private final String JUNG="11111";
	
	public Exam() {
		
		System.out.print("이름 입력 : ");
		this.name = scan.next();
		System.out.print("답 입력 : ");
		this.dap = scan.next();
		ox = new char[dap.length()];
	}
	public void compare() {
		for(int i=0; i<5; i++) {
			if(JUNG.charAt(i) == dap.charAt(i)) {
				this.ox[i] = 'O';
				score += 20;
			}else {
				this.ox[i] = 'X';
			}
		}
	}
	public String getName() {
		return name;
	}
	public char[] getOx() {
		return ox;
	}
	public int getScore() {
		return score;
	}
}

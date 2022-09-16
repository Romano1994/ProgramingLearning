package Operator;

import java.text.DecimalFormat;

public class Operator01 {
	public static void main(String[] args) {
		int money = 5730;
		
		int one = (((money%1000)%100)%10);
		int ten = ((money%1000)%100) / 10;
		int hundred = (money%1000) / 100;
		int thousand = money / 1000;
		
		DecimalFormat df = new DecimalFormat();
		System.out.println(df.format(money));		
		System.out.println("천의 자리 : " + thousand);
		System.out.println("백의 자리 : " + hundred);
		System.out.println("십의 자리 : " + ten);
		System.out.println("일의 자리 : " + one);
	}
}

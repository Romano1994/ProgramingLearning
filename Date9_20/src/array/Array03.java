package array;

import java.util.Scanner;

public class Array03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("배열의 크기 입력 : ");
		int size = scan.nextInt();
		
		int[] arr = new int[size];
		int max;
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.println("정수 값 입력 : ");
			arr[i] = scan.nextInt();
			sum += arr[i];
		}
		max = arr[0];
		for(int num : arr) {
			System.out.print(num + "  ");
			if(max < num) {
				max = num;
			}
		}
		System.out.println();
		System.out.println("합 : " + sum);
		System.out.println("최대값 : " + max);
	}
}

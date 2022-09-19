package for_;

public class For06 {
	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
//		for(int i=1; i <= 10; i++) {
//			
//			if(i%2 != 0) {
//				num = i * -1;
//				System.out.print(num+"");
//			}else {
//				num = i;
//				System.out.print("+"+num);
//			}
//			sum += num;
//		}
//		System.out.println(" = " + sum);
		
		for(int i = 1; i <= 10; i++) {
			if (i%2 != 0) {
				System.out.print("-" + i);
				sum -= i;
			}else {
				System.out.print("+" + i);
				sum += i;
			}
		}
		System.out.println(" = "+ sum);
	}
}
/*
 * For06.java
[문제] 결과화면과 똑같이 출력하시오 (for, if)

[실행결과]
-1+2-3+4-5+6-7+8-9+10 = 5
 */

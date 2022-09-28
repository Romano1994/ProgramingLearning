
public class FruiteMainHomework {
	public static void main(String[] args) {
		Fruite fruite = new Fruite();
		fruite.calcTot();
		fruite.display();
		fruite.output();
	}
}
class Fruite{
	int jan, feb, mar, tot, sumJan, sumFeb, sumMar;
	String[] pum = {"사과", "포도", "딸기"};
	int[] apple = {100, 80, 75,0};
	int[] grape = {30, 25, 10,0};
	int[] straw = {25, 30, 90,0};
	
	
	
	public Fruite() {
	}
	public void calcTot() {
		for(int i=0; i<apple.length-1; i++) {
			apple[3] += apple[i];
		}
		for(int i=0; i<grape.length-1; i++) {
			grape[3] += grape[i];
		}
		for(int i=0; i<straw.length-1; i++) {
			straw[3] += straw[i];
		}
		sumJan = apple[0] + grape[0] + straw[0];
		sumFeb = apple[1] + grape[1] + straw[1];
		sumMar = apple[2] + grape[2] + straw[2];
		
	}
	public void display() {
		System.out.println("---------------------------------");
		System.out.println("PUM\tJAN\tFEB\tMAR\tTOT");
		System.out.println("---------------------------------");
		System.out.print(pum[0] +"\t");
		
		for(int j=0; j<apple.length; j++) {
			System.out.print(apple[j] +"\t");
		}
		System.out.println();
		
		
		System.out.print(pum[1]+"\t");
		for(int j=0; j<grape.length; j++) {
			System.out.print(grape[j] +"\t");
		}
		System.out.println();
		
		System.out.print(pum[2]+"\t");
		for(int j=0; j<straw.length; j++) {
			System.out.print(straw[j] +"\t");
		}
		System.out.println();
		
	
		System.out.println("---------------------------------");
	}
	public void output() {
		System.out.print("\t");
		System.out.print(sumJan + "\t");
		System.out.print(sumFeb + "\t");
		System.out.print(sumMar + "\t");
	}
}
/*
과일 판매량 구하기
월별 매출합계도 구하시오

클래스 : Fruit
pum, jan, feb, mar, tot
sumJan, sumFeb, sumMar

생성자
calcTot()
display()
output() - static


클래스 : FruitMain


[실행결과]
---------------------------------
PUM      JAN   FEB   MAR      TOT
---------------------------------
사과    100    80    75     255
포도     30    25    10     xxx
딸기     25    30    90     xxx
---------------------------------
        xxx   xxx   xxx            output()로 처리
*/
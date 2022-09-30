
class Fruit{
	private String pum;
	private int jan, feb, mar, tot;
	private static int sumJan, sumFeb, sumMar; // static변수로 잡아서 모든 객체가 공유할 수 있게 만든다
	
	public Fruit(String pum, int jan, int feb, int mar) {
		this.pum = pum;
		this.jan =jan;
		this.feb = feb; 
		this.mar = mar;
	}
	public void calcTot() {
		tot = jan + feb + mar;
		sumJan += jan;
		sumFeb += jan;
		sumMar += jan;
	}
	public void display() {
		System.out.println(pum + "\t"+ jan +"\t"+ feb + "\t" +mar + "\t" + tot);
	}
	public static void output() {
		System.out.println("\t"+sumFeb+"\t"+sumJan+"\t"+sumMar);
	}
}
public class FruiteHomework {
	public static void main(String[] args) {
		Fruit[] arr = {new Fruit("사과", 100, 80, 75),
						new Fruit("포도", 30, 25, 10),
						new Fruit("딸기", 25, 30, 90)
						};
//		Fruit apple = new Fruit("사과", 100, 80, 75);
//		Fruit grape = new Fruit("포도", 30, 25, 10);
//		Fruit straw = new Fruit("딸기", 25, 30, 90);
		System.out.println("---------------------------------");
		System.out.println("PUM\tJAN\tFEB\tMAR\tTOT");
		System.out.println("---------------------------------");
		for(int i=0; i<arr.length; i++) {
			arr[i].calcTot();
			arr[i].display();
		}
		System.out.println("---------------------------------");
		Fruit.output();
//		apple.calcTot();
//		grape.calcTot();
//		straw.calcTot();
//		
//		apple.display();
//		grape.display();
//		straw.display();
//		
//		apple.output();
//		grape.output();
//		straw.output();
	}
}

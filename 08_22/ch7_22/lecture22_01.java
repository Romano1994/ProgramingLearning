package ch7_22;

public class lecture22_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Item{
	String color;
	String size;
	int  amount;
	
	Item(){}
	Item(String color, String size, int amount){
		System.out.println(color);
		System.out.println(size);
		System.out.println(amount);
	}
}


//public class Sample {
//
//    public static void main(String[] args) {
//        Cloth od1 = new Cloth();
//        Cloth od2 = new Cloth("Red");
//        Cloth od3 = new Cloth("Red", "Large");
//    }
//}
//
//class Cloth{
//    String color;
//    String size;
//    int amount;
//
//    Cloth(){
//        this("Black", "Medium", 1);
//    }
//    Cloth(String color){
//        this(color, "Medium", 1);
//    }
//    Cloth(String color, String size){
//        this(color, size, 1);
//    }
//
//    Cloth(String color, String size, int amount){
//        System.out.println(color);
//        System.out.println(size);
//        System.out.println(amount);
//    }
//}
public class sbs_prac {
    public static void main(String[] args) {
        Cloth1 od1 = new Cloth1();
        System.out.println(od1.amount);
        Cloth1 od2 = new Cloth1("large");
        System.out.println(od2.size);

    }
}

class Cloth1{
    String color;
    String size;
    int amount;

    Cloth1(String color, String size, int amount){
        this.color = color;
        this.size = size;
        this.amount = amount;
    }
    Cloth1(String color){
        this(color, "Medium", 20);
    }
    Cloth1(int amount){
        this("Black", "Medium", amount);
    }
    Cloth1(String color, int amount){
        this(color, "Medium", 20);
    }
    Cloth1(){
        this("Black", "large", 50);
    }

    
}
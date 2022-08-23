public class sbs22_02 {
    public static void main(String[] args) {

    }
}

class Cloth{
    String size;
    String  color;
    int amount;

    Cloth(String size, String color, int amount){
        this.size = size;
        this.color = color;
        this.amount = amount;
    }
    Cloth(){
        this("Large", "Black", 20);
    }
    Cloth(String size){
        this(size, "Blcak", 20);
    }
    Cloth(int amount){
        this("Large", "Black", amount);
    }
    Cloth(String size, int amount){
        this(size, "Black", amount);
    }
}

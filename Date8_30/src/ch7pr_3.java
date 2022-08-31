class Product{
    int price;
    int bonusPoint;

    Product(){}
    Product(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}
class Tv extends Product{
    Tv(){}
    Tv(int price){
        super(price);
    }
    public String toString(){
        return "Tv";
    }
}

public class ch7pr_3 {
    public static void main(String[] args) {
        Product tv = new Tv(10000);
        System.out.println(tv.price);
    }
}

public class ch7_28 {
    public static void main(String[] args) {
        Buyer b1 = new Buyer();
        b1.buy(new Tv());
        System.out.println(b1.money);
        System.out.println(b1.bonusPoint);
    }
}
class Product {
    int price;
    int bonusPoint;
}
class Tv extends Product {
    Tv(){
        price = 5000;
        bonusPoint = 1000;
    }
}
class Computer extends Product {
    Computer(){
        price = 3000;
        bonusPoint = 500;
    }
}
class Buyer {
    int money = 10000;
    int bonusPoint = 0;
    void buy(Product p) {
        money = money - p.price;
        bonusPoint = bonusPoint + p.bonusPoint;
    }
}

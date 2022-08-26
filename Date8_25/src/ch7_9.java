class Product2{
    int price;
    int bonusPoint;

    Product2(int price){
        this.price = price;
        bonusPoint = (int)(price / 10.0);
    }
    Product2(){}
}
class Tv2 extends Product2{
    Tv2(){
        super(100);
    }
    public String toString(){return "Tv";}
}

class Computer2 extends Product2{
    Computer2(){
        super(200);
    }
    public String toString(){return "Computer";}
}
class Audio2 extends Product2{
    Audio2(){
        super(50);
    }
    public String toString(){return "Audio";}
}
class Buyer2{
    int money = 1000;
    int bonusPoint =0;
    Product2[] cart = new Product2[10];
    int i = 0;

    void buy(Product2 p){
        if(money < p.price){
            System.out.println("잔액이 부족합니다");
            return;
        }else{
            money -= p.price;
            bonusPoint += p.bonusPoint;
            cart[i++] = p;
            System.out.println(p + "를 구입하셨습니다");
        }
    }
    void summary(){
        int sum = 0;
        String  itemList ="";
        for(int i=0; i < cart.length; i++){
            if(cart[i] == null){
                break;
            }else {
                sum += cart[i].price;
                itemList += cart[i] + ",";
            }
        }
        System.out.println("구입하신 총 금액은 " +sum+" 입니다");
        System.out.printf("구입하신 제품은 %s 입니다%n", itemList);
    }
}
public class ch7_9 {
    public static void main(String[] args) {
        Buyer2 b2 = new Buyer2();
        b2.buy(new Tv2());
        b2.buy(new Computer2());
        b2.buy(new Audio2());
        b2.summary();
    }
}

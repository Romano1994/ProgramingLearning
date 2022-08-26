public class ch7_8 {
    public static void main(String[] args) {
        Buyer1 b = new Buyer1();
        b.buy(new Tv1());
        //Product1 t = new Tv1();
        //b.buy(t);
        //b.buy(new Tv1());는 위의 두줄과 같은 원리
        b.buy(new Computer1());
        System.out.println(b.money);
        System.out.println(b.bonusPoint);
    }
}
class Product1{
    int price;
    int bonusPoint;

    Product1(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}
class Tv1 extends Product1{
    Tv1(){
        super(100);
    }
    public String toString(){ return "Tv";}
}
class Computer1 extends Product1{
    Computer1(){
        super(100);
    }
    public String toString() {return "Computer";}
}
class Buyer1{
    int money = 1000;
    int bonusPoint = 0;
    void buy(Product1 p){
        if(money < p.price){
            System.out.println("잔액이 부족하여 구매할 수 없습니다");
            return;
        }else{
            money -= p.price;
            bonusPoint += p.bonusPoint;
            System.out.println(p + "를 구입하셨습니다");
        }
    }
}
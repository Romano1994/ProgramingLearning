package lecture;

public class sbs09_03 {
    public static void main(String[] args) {
        Order cus1 = new Order();
        cus1.dishes = 3;
        cus1.price = 10000;

        cus1.finPrice();
    }
}

class Order{
    String name;
    int total = 0;
    int dishes;
    int price;

    int finPrice(){
        for(int i=1; i <= dishes; i++){
            total += price;
        }
        System.out.println(total);
        return total;
    }   
}

// 입금 & 출금 & 잔액

// public class Sample {
//     public static void main(String[] args) {
//         Order cus1 = new Order();

//         cus1.name = "짜장면";
//         cus1.qua = 3;

//         cus1.result();

//     }
// }

// class Order {
//     String name;
//     int cost = 5000;
//     int qua;
//     int res;

//     void result(){
//         res = cost * qua;
//         System.out.println(res);
//     }
// }
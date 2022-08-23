public class lecture22_02 {
    public static void main(String[] args) {
        Item item = new Item();
        System.out.println(item.name + item.price);
    }
}

class Item{
    String name;
    int price;

    Item(String name, int price){
        this.name = name;
        this.price = price;
    }
    Item(){
        this("이름 없음", -1);
    }
}
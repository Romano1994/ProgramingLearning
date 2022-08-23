/**
 * sbs_lecture_01
 */
public class sbs_lecture_01 {

    public static void main(String[] args) {
        Item item = new Item("마법사", 20);
        System.out.println(item.name+ item.price);
    }
}
class Item{
    String name;
    int price;

    Item(String name, int price){
        this.name = name;
        this.price = price;
    }
}
package lecture;

/**
 * sbs10_01
 */
public class sbs10_01 {

    public static void main(String[] args) {
        Bank cus1 = new Bank("chan", 010, "seoul");
        System.out.println(cus1.name);
        
    }
}

class Bank{
    String name;
    int num;
    String address;
    int bal = 0;

    Bank(String name, int num, String address){
        this.name = name;
        this.num = num;
        this.address = address;
    }
}
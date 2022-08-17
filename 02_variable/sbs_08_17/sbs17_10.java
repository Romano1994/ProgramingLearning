import java.util.ArrayList;

/**
 * sbs17_10
 */
public class sbs17_10 {

    public static void main(String[] args) {
        ArrayList<Bank> customer = new ArrayList<Bank>();
        customer.add(new Bank("김찬영", 29));
        System.out.println(customer.get(0));
        
    }
}

class Bank{
    private int balance = 0;

    String name;
    int age;

    Bank(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getBalance(){
        return balance;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
}
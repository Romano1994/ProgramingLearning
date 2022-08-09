package lecture;

public class sbs09_01 {
    public static void main(String[] args) {
        Bank b = new Bank();
        
        b.name = "홍길동";
        b.accno = "01-011";
        b.info();
        b.add(10000);
        b.result();
        b.subt(8000);
        b.result();
    }
}

class Bank{
    String corp = "SBS";
    String name;
    String accno;
    int balance = 0;

    void add(int amount){
        balance += amount;
    }
    void subt(int amount){
        balance -= amount;
    }
    void result(){
        System.out.println(balance);
    }
    void info(){
        System.out.println(corp +" "+ name +" "+ accno +" "+ balance);
    }
}
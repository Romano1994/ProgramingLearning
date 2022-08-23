public class sbs22_03 {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setBalance(1000);
        System.out.println(acc.money);
        acc.setBalance(-500);
        System.out.println(acc.money);
    }
}
class Account{
    int accountNum;
    String name;
    private int balance = 0;
    int money = balance;

    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        if(balance > 0){
            this.balance += balance;
            money = this.balance;
        } else if (balance < 0){
            this.balance =- balance;
            money = this.balance;
        }
    }
}

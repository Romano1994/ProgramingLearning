public class Account {
    String accountNo;
    String ownerName;
    int balance;

    int deposit(int amount){
        balance += amount;
        return balance;
    }
    int withdraw(int amount)throws Exception{
        if(balance < amount){
            throw new Exception("잔액이 부족합니다");
        }else {
            balance -= amount;
        }
        return amount;
    }
}

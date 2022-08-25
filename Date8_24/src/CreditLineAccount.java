public class CreditLineAccount extends Account{
    int limit;
    CreditLineAccount(String accountNo, String ownerName, int balance, int limit) {
        super(accountNo, ownerName, balance);
        this.limit = limit;
    }
    int withdraw(int amount) throws Exception {
        if (balance + limit < amount){
            throw new Exception("인출할 수 없습니다.");
        } else {
            limit -= amount;
            return amount;
        }
    }
}

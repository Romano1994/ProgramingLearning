public class InheritanceExample {
    public static void main(String[] args) {
        CheckingAccount obj = new CheckingAccount();
        obj.accountNo = "111-22-333333";
        obj.ownerName = "ghfrlfehd";
        obj.cardNo = "5555-6666-7777-8888";
        obj.deposit(100000);

        try {
            int paidAmount = obj.pay("5555-6666-7777-8888", 47000);
            System.out.println("지불액 : " +paidAmount);
            System.out.println("잔액: " + obj.balance);
        }
        catch (Exception e){
            String msg = e.getMessage();
            System.out.println(msg);
        }
    }
}

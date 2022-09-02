public class ch8_5 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        try{
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
        } catch(ArithmeticException ae){
            ae.printStackTrace();
            System.out.println("예외메세지 : " + ae.getMessage());
        }
        System.out.println(6);
    }
}
/*
1
2
3
java.lang.ArithmeticException: / by zero
	at ch8_5.main(ch8_5.java:8)
예외메세지 : / by zero
6
 */
public class ch8_4 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try{
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
        }catch(ArithmeticException ae){
            System.out.println("true");
            System.out.println("ArithmeticException");
        }catch (Exception e){
            System.out.println("Exception");
        }
        System.out.println(6);
    }
}
/* 0/0으로 ArithmeticException이 발생해서 catch가 실행되고
맞는 catch를 찾을 때 먼저 ArithmeticException를 먼저 찾았기 때문에
ArithmeticException에 해당하는 catch 블럭을 실행된다
만약 해당 catch가 ArithmeticException이 아닌 다른 catch블럭이었다면
Exception catch가 실행됐을 것
 */

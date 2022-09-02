public class ch8_1 {
    public static void main(String[] args) {
        System.out.println(1);
        try{
            System.out.println(2);
            System.out.println(3);
        }catch(Exception e){
            System.out.println(4);
        }
        System.out.println(5);
    }
}

/*예외가 발생하지 않으면 try문 종료후 catch문을 뛰어 넘고 5를 출력
 */
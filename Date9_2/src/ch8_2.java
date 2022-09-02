public class ch8_2 {
    public static void main(String[] args) {
        System.out.println(1);
        try{
            System.out.println(0 / 0);
            System.out.println(2);
        }catch(ArithmeticException e){
            System.out.println(3);
        }
        System.out.println(4);
    }
}
/* try문 안에서 예외가 발생했기 때문에 예외 지점 아래에 있는 코드들을 실행을 안하고
해당 catch문으로 이동해서 코드 실행
 */
public class ch8_12 {
    public static void main(String[] args) {
        try{
            method1();
        }catch (Exception e){
            System.out.println("main에서 예외처리");
        }
    }
    static void method1() throws Exception{
        try{
            throw new Exception();
        }catch(Exception e){
            System.out.println("method1에서 예외 처리");
            throw e;
        }
    }
}

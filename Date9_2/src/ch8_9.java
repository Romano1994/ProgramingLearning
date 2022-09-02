public class ch8_9 {
    public static void main(String[] args) throws Exception{
        try{
            method1();
        }catch (Exception e){
            System.out.println("예외 발생");
        }
    }
    static void method1() throws Exception{
        method2();
    }
    static void method2() throws Exception{
        throw new Exception();
    }
}

/*
처음 예외가 발생한 method2는 throws Exception으로 자신을 호출한 method1에 예외를 넘기고
예외를 받은 method1은 다시 throws Exception으로 자신을 호출한 main 메서드에 예외를 넘긴 후
main메서드에 try - catch문으로 예외가 처리 된다
 */

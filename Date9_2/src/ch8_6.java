public class ch8_6 {
    public static void main(String[] args) {
        Exception e = new Exception("고의로 발생시킴");

        try{
            throw e;
        }catch (Exception a){
            System.out.println("에러메세지 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 종료");
    }
}
/*
예외 클래스의 객체를 발생시킨 다음에
throw로 객체를 던지면 catch문으로 객체를 받는다

에러메세지 : 고의로 발생시킴
프로그램 종료
java.lang.Exception: 고의로 발생시킴
	at ch8_6.main(ch8_6.java:4)
 */
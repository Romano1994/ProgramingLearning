public class Ex8_1 {
}

class MyException extends Exception{
    private final int ERR_CODE;

    MyException(String msg, int errCode){
        super(msg); //예외가 발생하면 예외 메세지를 넣기 때문에 생성자를 만들어서 매개변수로 메세지를 입력해주는 것이 대부분
        ERR_CODE = errCode;
    }
    MyException(String msg){
        this(msg, 100);
    }
    public int getErrCode(){
        return ERR_CODE;
    }
}

public class ch8_11 {
    public static void main(String[] args) {
        try{
            startInstall();
            copyFiles();
        }catch (SpaceException se){
            System.out.println("에러 메세지 : " + se.getMessage());
            se.printStackTrace();
        }catch (MemoryException me){
            System.out.println("에러메세지 : " + me.getMessage());
            me.printStackTrace();
        }
    }
    static void startInstall() throws SpaceException, MemoryException{
        if(!enoughMemory())
            throw new MemoryException("메모리가 부족합니다");
        if(!enoughSpace())
            throw new SpaceException("공간이 부좁합니다");
    }
    static void copyFiles(){ /*파일들을 복사하는 코드를 넣는다*/}
    static void deleteTemFile(){/*임시저장 파일을 삭제하는 코드를 넣는다*/}

    static boolean enoughSpace(){
        /*섪치에 필요한 공간이 있는지 확인하는 코드를 넣는다*/
        return false;
    }
    static boolean enoughMemory(){
        /*섪치에 필요한 메모리가 있는지 확인하는 코드를 넣는다*/
        return true;
    }
}
class SpaceException extends Exception{
    SpaceException(String msg){
        super(msg);
    }
}
class MemoryException extends Exception{
    MemoryException(String msg){
        super(msg);
    }
}
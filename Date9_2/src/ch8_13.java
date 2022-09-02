public class ch8_13 {
    public static void main(String[] args) {
        try{
            install();
        }catch (InstallException2 ie){
            ie.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    static void install() throws InstallException2{
        try{
            startInstall();
            copyFiles();
        }catch (SpaceException2 se){
            InstallException2 ie = new InstallException2("설치중 오류가 발생했습니다");
            ie.initCause(se);
            throw ie;
        }catch (MemoryException2 me){
            InstallException2 ie = new InstallException2("설치중 오류가 발생했습니다");
            ie.initCause(me);
            throw ie;
        }finally {
            deleteEmpFiles();
        }
    }
    static void startInstall() throws SpaceException2, MemoryException2{
        if(!enoughMemory()){
            throw new MemoryException2("설치할 매모리가 부족합니다");
        }
        if(!enoughSpace()){
            throw new SpaceException2("설치할 공간이 부족합니다");
        }

    }
    static void copyFiles(){/*피일들을 복사하는 코드*/}
    static void deleteEmpFiles(){/*임시파일을 삭제하는 코드*/}

    static boolean enoughSpace(){
        //충분한 공간이 있는지 확인한다
        return false;
    }
    static boolean enoughMemory(){
        //충분한 메모리가 있는지 확인한다
        return true;
    }
}
class InstallException2 extends Exception{
    InstallException2(String msg){
        super(msg);
    }
}
class SpaceException2 extends Exception{
    SpaceException2(String msg){
        super(msg);
    }
}
class MemoryException2 extends Exception{
    MemoryException2(String msg){
        super(msg);
    }
}

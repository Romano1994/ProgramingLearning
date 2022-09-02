public class ChainedException {
    public static void main(String[] args) {
        try {
            install();
        }catch (InstallException ie){
            ie.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    static void install() throws InstallException{
        System.out.println("설치");
        try{
            startInstall();
            copyFile();
        }catch (SpaceException1 se){
            InstallException ie = new InstallException();
            ie.initCause(se);
            throw ie;
        }catch (MemoryException1 me){
            InstallException ie = new InstallException();
            ie.initCause(me);
            throw ie;
        }
    }
    static boolean startInstall() throws SpaceException1{
        System.out.println("설치를 시작합니다");
        throw new SpaceException1();
    }
    static void copyFile() throws MemoryException1{
        System.out.println("파일 복사");
        throw new MemoryException1();
    }
}
class InstallException extends RuntimeException{

}
class SpaceException1 extends Exception{


}
class MemoryException1 extends Exception{

}
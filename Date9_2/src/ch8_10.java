import java.io.File;

public class ch8_10 {
    public static void main(String[] args) {
        try{
            File file = creatFile(null);
            System.out.println(file.getName() + "파일이 성공적으로 생성됐습니다");
        }catch (Exception e){
            System.out.println(e.getMessage() + " 다시 입력해 주십시오");
        }
    }
    static File creatFile (String fileName) throws Exception{
        if (fileName==null || fileName.equals(""))
            throw new Exception("파일 이름이 유효하지 않습니다");
        File file = new File(fileName);
        file.createNewFile();
        return file;
    }
}
/*
creatFile 메서드로 파일을 생성하고 메서드를 살행할 떄의 매개변수를
생성되는 파일의 이름으로 정한다
매개변수가 null 이거나 빈 문자열일때 호출스택으로 예외를 던진다
호출된 스택에 try - catch 문으로
"다시 입력해 주십시오"가 출력된다
 */

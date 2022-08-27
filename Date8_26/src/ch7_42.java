class AA{
    int i = 100;
    class BB{   //BB는 AA의 내부 클래스
        void method(){
            System.out.println(i);  //AA의 인스턴스 변수 i를 객체 생성 없이 사용 가능
        }
    }

}
class CC{

}

public class ch7_42 {
    public static void main(String[] args) {
        AA aa = new AA();

    }
}

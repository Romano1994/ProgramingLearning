public class ch7_14 {
    private int outerIv = 0;
    static int outerCv = 0;

    class InstanceInner{
        int iiv = outerIv;  //외부클래스의 private멤버도 접근 가능하다
        int iiv2 = outerCv;
    }
    static  class StaticInner{
//        int siv = outerIv;  // 내부 static 클래스는 외부의 인스턴스 멤버에 접근할 수 없다
            static int scv = outerCv;
    }
    void myMethod(){
        int lv = 0;
        final int LV =1;
        class LocalInner{
            int liv = outerIv;
            int liv2 = outerCv;
            int liv3 = lv;
            int liv4 = LV;
        }
    }
}

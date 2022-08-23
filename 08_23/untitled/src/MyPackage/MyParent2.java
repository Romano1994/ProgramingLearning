package MyPackage;
import pkg1.Myparent;
class child extends Myparent{
    public void printMembers(){
//        System.out.println(prv);
//        System.out.println(dft); // 접근 제어자 default는 같은 패키지 안에서만 사용할 수 있음
        System.out.println(ptd);
        System.out.println(pbl);
    }

}

public class MyParent2 {
    public static void main(String[] args) {
        Myparent mp = new Myparent();
//        System.out.println(mp.prv);
//        System.out.println(mp.dft);
//        System.out.println(mp.ptd); // 접근제어자 protected는 같은 패키지, 자손 클래스에서만 사용 가능
        System.out.println(mp.pbl);
    }
}

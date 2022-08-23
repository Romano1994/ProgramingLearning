package pkg1;
public class Myparent{
    private  int prv;
    int dft;
    protected  int ptd;
    public int pbl;
    public void printMembers(){
        System.out.println(prv);
        System.out.println(dft);
        System.out.println(ptd);
        System.out.println(pbl);
    }
}
class ch7_21Test {
    public static void main(String[] args) {
    Myparent mp = new Myparent();
//        System.out.println(mp.prv); // private은 같은 클래스 내에서만 쓸 수 있기 때문에 에러
        System.out.println(mp.dft);
        System.out.println(mp.ptd);
        System.out.println(mp.pbl);
    }
}

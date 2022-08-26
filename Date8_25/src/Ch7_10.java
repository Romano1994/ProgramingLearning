public class Ch7_10 {
    public static void main(String[] args) {
        Unit1[] group = {new Marine1(), new Tank1(), new Dropship1()};
//        Unit1[] group1 = new Unit1[3];
//        group[0] = new Marine1();
//        group[1] = new Tank1();
//        group[2] = new Dropship1();
        for (int i =0; i < group.length; i++){
            group[i].move(100, 200);
        }
        Marine1 ma = (Marine1) group[0];
        ma.stimpack();
        Tank1 ta = (Tank1) group[1];
        ta.changeMode();
        Dropship1 dr = (Dropship1) group[2];
        dr.load();
        dr.unload();
    }
}
abstract class Unit1{
    int x, y;
    abstract void move(int x, int y);
    void stop(){
        System.out.println("현재 위치에 정지");
    }
}
class Marine1 extends Unit1{
    void move(int x, int y){
        System.out.println("Marine : "+ x +" , "+ y +"로 이동");
    }
    void stimpack(){
        System.out.println("스팀팩 사용");
    }
}
class Tank1 extends Unit1{
    void move(int x, int y){
        System.out.println("Tank : "+x +" , "+ y +"로 이동");
    }
    void changeMode(){
        System.out.println("시즈모드 변경");
    }
}
class Dropship1 extends Unit1{
    void move(int x, int y){
        System.out.println("Dropship : "+x +" , "+ y +"로 공중 이동");
    }
    void load(){
        System.out.println("load");
    }
    void unload(){
        System.out.println("unload");
    }
}
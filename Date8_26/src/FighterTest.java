abstract class Unit2{
    int x, y;
    abstract void move(int x, int y);
    void stop (){
        System.out.println("멈춥니다.");
    }
}
interface Fightable{
    void move(int x, int y);
    void attack(Fightable f);
}
class Fighter extends Unit2 implements Fightable{
    public void move(int x, int y){
        System.out.println(x + ", " + y +" 으로 이동");
    };
    void stop (){
        System.out.println("멈춥니다.");
    }
    public void attack(Fightable f){
        System.out.println(f + " 를 공격");
    }
    void celebration(){
        System.out.println("celebration");
    }
    Fightable getFighterbla(){
        Fightable f = new Fighter();
        return f;
    }
}

public class FighterTest {
    public static void main(String[] args) {
    Fightable fable = new Fighter();
    Unit2 unit2 = new Fighter();
    Fighter fighter = new Fighter();
    fable.attack(fighter);
    fable.move(100, 200);
    Fightable f2 = fighter.getFighterbla();

    }
}

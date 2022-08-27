abstract class StarUnit{
    int x, y;
    abstract void move(int x, int y);
}
interface Repairable{
    public abstract void repair();
}
abstract class AirUnit extends StarUnit{
    void move(int x, int y){
        System.out.println(x +", "+ y+"로 공중 이동");
    }
    abstract void airAttack();
}
abstract class GroundUnit extends StarUnit{
    void move(int x, int y){
        System.out.println(x +", "+ y +"로 ground 이동");
    }
    abstract void groundAttack();
}
class Marine extends GroundUnit{
    void groundAttack(){
        System.out.println("3만큼 지상 공격");
    }
    void cure(){
        System.out.println("1만큼 회복");
    }
}
class SCV extends GroundUnit implements Repairable{
    void groundAttack(){
        System.out.println("1만큼 지상 공격");
    }
    public void repair(){
        System.out.println("1민큼 회복");
    }
}
class Troopship extends AirUnit implements Repairable{
    void airAttack(){
        System.out.println("5만큼 공중공격");
    }
    public void repair(){
        System.out.println("5만큼 회복");
    }
}

public class StarCraftInterface {
}

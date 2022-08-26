public class ch7_33 {
}
abstract class Unit{
    int x ,y;
    Unit(int x, int y){
        this.x = x;
        this.y = y;
    }
    abstract void move(int x, int y);
    void stop(){}
}
class Marine extends Unit{
    Marine(int x, int y){
        super(x,y);
    }
    void move(int x, int y){}
    void stimPack(){}
}
class Tank extends Unit{
    Tank(int x, int y){
        super(x, y);
    }
    void move(int x, int y){}
    void changeMode(){}
}
class DropShip extends Unit{
    DropShip(int x, int y){
        super(x ,y);
    }
    void move(int x, int y){}
    void load(){}
    void unload(){}
}

package lecture;

public class sbs11_02 {
    public static void main(String[] args) {
        Avengers thor = new Avengers("토르", 150);
        Avengers thanos = new Avengers("타노스", 160);
        thor.punch(thanos);
        // 1
        // 2
    }
}

class Avengers{
    String name;
    int hp;

    Avengers(String _name, int _hp){
        name = _name;
        hp = _hp;
    }

    void punch(Avengers enemy){
        System.out.printf("%s의 펀치!", name);
        enemy.hp -= 10;
        System.out.printf("-> %s의 체력: %d", enemy.name ,enemy.hp);
    }
}

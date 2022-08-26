abstract class PlayerTest {
    abstract void play(int pos);

    abstract void stop();
}
class AudioPLayer extends PlayerTest {
    void play(int pos) {
        System.out.println(pos + " 위치부터 play 합니다.");
    }
    void stop() {
        System.out.println("stop합니다");
    }
}
public class Player {
    public static void main(String[] args) {
//        Player p = new Player();
        PlayerTest ap = new AudioPLayer();
        ap.play(100);
    }
}

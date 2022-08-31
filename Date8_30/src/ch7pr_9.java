import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ch7pr_9 {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.addWindowListener(new WindowAdapter() {
            void widowClosing(WindowEvent e) {
                e.getWindow().setVisible(false);
                e.getWindow().dispose();
                System.exit(0);
            }
        });
    }
}

//class EventHandler extends WindowAdapter{
//    public void widowClosing(WindowEvent e){
//        e.getWindow().setVisible(false);
//        e.getWindow().dispose();
//        System.exit(0);
//    }
//}

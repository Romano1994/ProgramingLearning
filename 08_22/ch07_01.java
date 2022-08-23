/**
 * 07_01
 */
public class ch07_01 {
  public static void main(String[] args) {
    SmartTv stv = new SmartTv();
    stv.channel = 10;
    stv.channelUp();
    System.out.println(stv.channel);
    stv.displayCaption("Hello World");
    stv.caption = true;
    stv.displayCaption("Hello World2");
  }
}
class Tv{
  boolean power;
  int channel;

  void power(){
    power = !power;
  }
  void channelUp(){
    channel++;
  }
  void channelDown(){
    channel--;
  }
}

class SmartTv extends Tv{
  boolean caption;
  void displayCaption(String text){
    if(caption){
      System.out.println(text);
    }
  }
}


class Point{
  int x;
  int y;
}

class Circle{
  Point pt = new Point();
  int r;
}
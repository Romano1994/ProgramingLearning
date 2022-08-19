/**
 * UpcastingSpeaker
 */
class Speaker{
    public void powerOn(){
        System.out.println("Speaker_powerOn");
    }
    public void connect(){
        System.out.println("Speaker_connect");
    }
    public void volum(){
        System.out.println("Speaker_volum");
    }
}
class SpeakerA extends Speaker{
    public void powerOn(){
        System.out.println("SpeakerA_powerOn");
    }
    public void connect(){
        System.out.println("SpeakerA_connect");
    }
    public void volum(){
        System.out.println("SpeakerA_volum");
    }
}
class SpeakerB extends Speaker{
    public void powerOn(){
        System.out.println("SpeakerB_powerOn");
    }
    public void connect(){
        System.out.println("SpeakerB_connect");
    }
    public void volum(){
        System.out.println("SpeakerB_volum");
    }
}
class SpeakerC extends Speaker{
    public void powerOn(){
        System.out.println("SpeakerC_powerOn");
    }
    public void connect(){
        System.out.println("SpeakerC_connect");
    }
    public void volum(){
        System.out.println("SpeakerC_volum");
    }
}
class TestClass{
    public void volumOn(Speaker what){
        what.powerOn();
        what.connect();
    }
}
public class UpcastingSpeaker {

    public static void main(String[] args) {
        TestClass t = new TestClass();
        Speaker a = new SpeakerA();
        Speaker b = new SpeakerB();
        Speaker c = new SpeakerC();
        Speaker[] arr = {a, b, c};
        for(int i=0; i < arr.length; i++){
            t.volumOn(arr[i]);
        }
    }
}
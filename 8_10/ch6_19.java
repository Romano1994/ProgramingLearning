/**
 * ch6_18
 */
public class ch6_19 {

    public static void main(String[] args) {
        MyTv tv = new MyTv();
        tv.channel = 99;
        System.out.println(tv.channel);
        tv.channelUp();
        System.out.println(tv.channel);
        System.out.println(tv.isPowerOn);
        tv.turnOnOff();
        System.out.println(tv.isPowerOn);
        tv.channel = 1;
        tv.channelDown();
        System.out.println(tv.channel);
    }
}

class MyTv{
    boolean isPowerOn;
    int channel;
    int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 0;
    
    void turnOnOff(){
        if(isPowerOn == true){
            isPowerOn = false;
        }else{
            isPowerOn = true;
        }
    }
    void volumeUp(){
        if(MAX_VOLUME > volume){
            volume += 1;
        } 
    }
    void volumeDown(){
        if(MIN_VOLUME < volume){
            volume -= 1;
        }
    }
    void channelUp(){
        if(channel == MAX_CHANNEL){
            channel = MIN_CHANNEL;
        }else{
            channel += 1;
        }
    }
    void channelDown(){
        if(channel == MIN_CHANNEL){
            channel = MAX_CHANNEL;
        } else{
            channel-= 1;
        }
    }
}
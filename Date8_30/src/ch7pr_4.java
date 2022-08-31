class MyTv{
    private boolean isPowerOn;
    private int channel;
    private int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 0;

    public int getVolume(){
        return volume;
    }
    public void setVolume(int volume){
        this.volume = volume;
    }

    public boolean getIsPowerOn(){
        return isPowerOn;
    }
    public void setIsPowerOn(){
        if(this.isPowerOn == true){
            this.isPowerOn = false;
        }else{
            this.isPowerOn = true;
        }
    }

    public int getChannel() {
        return channel;
    }
    public void setChannel(int channel) {
        this.channel = channel;
    }
}

public class ch7pr_4 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println(t.getChannel());
        t.setVolume(20);
        System.out.println(t.getVolume());
        System.out.println(t.getIsPowerOn());
        t.setIsPowerOn();
        System.out.println(t.getIsPowerOn());
    }
}

public class ch7pr_5 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println(t.getChannel());
        t.setChannel(20);
        System.out.println(t.getChannel());
        t.gotoPrevChannel();
        System.out.println(t.getChannel());
        t.gotoPrevChannel();
        System.out.println(t.getChannel());
    }
}

class MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevchannel;

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
        if(channel > MAX_CHANNEL || channel < MIN_CHANNEL){
            return;
        }else {
            prevchannel = this.channel;
            this.channel = channel;
        }
    }
    public void gotoPrevChannel(){
        int tmp = channel;
        channel = prevchannel;
        prevchannel = tmp;
    }
}

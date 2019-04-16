package rocks.zipcode.io.objectorientation;

public class Television {

    private boolean isOn;
    TVChannel channel;

    public Television(){
        this.isOn = false;

    }

    public void turnOn() {
        this.isOn = true;
    }

    public void setChannel(Integer channel) {
        if(!isOn){
            throw new IllegalStateException("TV is Off....duh");
        }
        this.channel = TVChannel.getByOrdinal(channel);
    }

    public TVChannel getChannel() {
        return this.channel;
    }
}

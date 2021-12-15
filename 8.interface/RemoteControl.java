public interface RemoteControl {
    // constant field
    public int MAX_VALUE = 10;
    public int MIN_VOLUME = 0;

    // abstract method
    public void turnOn();
    public void turnOff();
    public void setVolume(int volume);

    // default method
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("mute");
        } else {
            System.out.println("unmute");
        }
    }

    static void changeBattery() {
        System.out.println("change dry cell");
    }
}

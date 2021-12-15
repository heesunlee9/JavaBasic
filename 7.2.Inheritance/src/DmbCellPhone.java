public class DmbCellPhone extends CellPhone {
    int channel;

    public DmbCellPhone(String model, String color, int channel) {
        this.model = model;
        this.color = color;
        this.channel = channel;
    }

    void turnOnDmb() {
        System.out.println("Start " + channel);
    }

}

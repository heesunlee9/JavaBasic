public class DmbCellPhoneExample {
    public static void main(String[] args) {
        DmbCellPhone dmbCellPhone = new DmbCellPhone("javaphone", "black", 10);

        System.out.println("Model: " + dmbCellPhone.model);
        System.out.println("Color: " + dmbCellPhone.color);

        System.out.println("Channel: " + dmbCellPhone.channel);

        dmbCellPhone.powerOn();

        dmbCellPhone.turnOnDmb();
    }
}

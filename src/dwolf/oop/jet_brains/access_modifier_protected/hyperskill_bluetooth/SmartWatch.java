package dwolf.oop.jet_brains.access_modifier_protected.hyperskill_bluetooth;

// Objects of this class have access to the pintNotification method of MobileGadget,
// because they are in the same package.
public class SmartWatch extends MobileGadget {

    private int avgHeartRate;
    private Laptop connectedLaptop;

    public SmartWatch() {
        this.avgHeartRate = 75;
        this.connectedLaptop = new Laptop();
    }

    // This method can not be accessed form any other class.
    // Not even from its "brother" class SmartPhone.
    private int countHeartRate() {
        System.out.println("Counting heart rate");
        return avgHeartRate;
    }

    private void sendInfoToLaptop(String data) {
        printNotification("Sending data to laptop : "  + data);
        connectedLaptop.receiveInfo(data);
    }
}
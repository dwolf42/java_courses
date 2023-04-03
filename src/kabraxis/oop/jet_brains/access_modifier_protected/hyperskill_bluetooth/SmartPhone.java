package kabraxis.oop.jet_brains.access_modifier_protected.hyperskill_bluetooth;

// Objects of this class have access to the pintNotification method of MobileGadget,
// because they are in the same package.
public class SmartPhone extends MobileGadget {

    private Laptop connectedLaptop;

    public SmartPhone() {
        this.connectedLaptop = new Laptop();
    }

    private void sendInfoToLaptop(String data) {
        printNotification("Sending data to laptop : "  + data);
        connectedLaptop.receiveInfo(data);
    }
}
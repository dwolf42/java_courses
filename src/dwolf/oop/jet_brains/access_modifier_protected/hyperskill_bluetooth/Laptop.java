package dwolf.oop.jet_brains.access_modifier_protected.hyperskill_bluetooth;

// Can get a message form any via BlueTooth connected device.
public class Laptop {

    // Can't be accessed directly, but all classes from the same package can access it invoking the receiveInfo method
    private String info;

    void receiveInfo(String info) {
        this.info = info;
    }

}
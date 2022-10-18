public class ParentQuestion1 {
    public int serialNumber;
    public String manufacturer, colour;

    public ParentQuestion1(int serialNumber, String manufacturer, String colour) {
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
        this.colour = colour;
    }

    // & Checks whether the Accessory serialNumber is equal to the given serial
    // & number
    public boolean containsSerialNumber(int serialNum) {
        return (serialNumber == serialNum);
    }
}

public class ParentQuestion1 {
    public String serialNumber, manufacturer, colour;

    public ParentQuestion1(String serialNumber, String manufacturer, String colour) {
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
        this.colour = colour;
    }

    // & Checks whether the Accessory serialNumber is equal to the given serial
    // & number
    public boolean containSerialNumber(String serialNum) {
        return (serialNumber.equals(serialNum));
    }

    public String toString() {
        return String.format("%s, %s, %s", this.serialNumber, this.manufacturer, this.colour);
    }
}

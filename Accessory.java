/*
 * A program about information of an accessory 
 * Author: Awonke Mnotoza
 * Date: 06 October 2022
 * Student number: MNTAWO002
 */

public class Accessory {
    public int serialNumber;
    public String manufacturer, colour;

    public Accessory(int serialNumber, String manufacturer, String colour) {
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
        this.colour = colour;
    }

    // & Checks whether the Accessory serialNumber is equal to the given serial
    // & number
    public boolean containsSerialNumber(int serialNumber) {
        return (this.serialNumber == serialNumber);
    }

    public String toString() {
        return String.format("Accessories: %d, %s, %s", this.serialNumber, this.manufacturer, this.colour);
    }
}

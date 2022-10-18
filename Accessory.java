/*
 * A program about information of an accessory 
 * Author: Awonke Mnotoza
 * Date: 06 October 2022
 * Student number: MNTAWO002
 */

public class Accessory extends ParentQuestion1 {

    public Accessory(int serialNumber, String manufacturer, String colour) {
        super(serialNumber, manufacturer, colour);
    }

    public String toString() {
        return String.format("Accessories: %d, %s, %s", serialNumber, manufacturer, colour);
    }
}

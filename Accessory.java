/*
 * A program about information of an accessory 
 * Author: Awonke Mnotoza
 * Date: 06 October 2022
 * Student number: MNTAWO002
 */

public class Accessory extends ParentQuestion1 {

    public Accessory(String serialNumber, String manufacturer, String colour) {
        super(serialNumber, manufacturer, colour);
    }

    @Override
    public String toString() {
        return String.format("Accessories: %s, %s, %s", serialNumber, manufacturer, colour);
    }
}

/*
 * A program about information of a screen
 * Author: Awonke Mnotoza
 * Date: 06 October 2022
 * Student number: MNTAWO002
 */

public class Screen extends ParentQuestion1 {
    public int size;

    public Screen(int serialNumber, String manufacturer, String colour, int size) {
        super(serialNumber, manufacturer, colour);
        this.size = size;
    }

    @Override
    public String toString() {
        return String.format("Screen: %d, %s, %s, %d", this.serialNumber, this.colour, this.manufacturer, this.size);
    }
}

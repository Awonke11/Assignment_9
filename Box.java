/*
 * A program about information of a box
 * Author: Awonke Mnotoza
 * Date: 06 October 2022
 * Student number: MNTAWO002
 */

public class Box extends ParentQuestion1 {
    public int amountOfMemory;

    public Box(int serialNumber, String manufacturer, String colour, int amountOfMemory) {
        super(serialNumber, manufacturer, colour);
        this.amountOfMemory = amountOfMemory;
    }

    @Override
    public String toString() {
        return String.format("Box: %d, %s, %s, %d", this.serialNumber, this.manufacturer, this.colour,
                this.amountOfMemory);
    }
}

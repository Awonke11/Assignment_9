import java.util.Scanner;
import java.util.ArrayList;

/*
 * A program that stores information about a product
 * Author: Awonke Mnotoza
 * Date: 06 October 2022
 * Student number: MNTAWO002
 */

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<ParentQuestion1> accessoryList = new ArrayList<ParentQuestion1>(); // & Stores all the Accessory
                                                                                     // objects

        System.out.println("Welcome to Great International Technology");
        String userInput; // & Stores the user input
        ParentQuestion1 accessory;
        do {
            System.out.println("MENU: add (B)ox, add (S)creen, add (A)ccessories, (D)elete, (L)ist, (Q)uit");
            userInput = input.nextLine();
            if (!userInput.equals("q")) {
                if (!userInput.equals("d") && !userInput.equals("l")) {
                    System.out.println("Enter the serial number");
                    int serialNumber = input.nextInt();
                    System.out.println("Enter the manufacturer");
                    input.nextLine();
                    String manufacturer = input.nextLine();
                    System.out.println("Enter the colour");
                    String colour = input.nextLine();

                    switch (userInput) {
                        case "b":
                            System.out.println("Enter the amount of memory (MB)");
                            int amountOfMemory = input.nextInt();
                            input.nextLine();
                            accessory = new Box(serialNumber, manufacturer, colour, amountOfMemory);
                            accessoryList.add(accessory);
                            break;

                        case "s":
                            System.out.println("Enter the screen size in inches");
                            int size = input.nextInt();
                            input.nextLine();
                            accessory = new Screen(serialNumber, manufacturer, colour, size);
                            accessoryList.add(accessory);
                            break;

                        case "a":
                            accessory = new Accessory(serialNumber, manufacturer, colour);
                            accessoryList.add(accessory);
                            break;

                    }
                    System.out.println("Done");
                }
                switch (userInput) {
                    case "d":
                        System.out.println("Enter the serial number");
                        int serialNumber = input.nextInt();
                        input.nextLine();

                        boolean deleted = false;
                        for (int i = 0; i < accessoryList.size(); i++) { // & Deleting the object with the given serial
                                                                         // & number
                            if (!accessoryList.get(i).containsSerialNumber(serialNumber)) {
                                accessoryList.remove(i);
                                deleted = true;
                            }
                        }

                        if (!deleted) {
                            System.out.println("Not found");
                        } else {
                            System.out.println("Done");
                        }
                        break;
                    case "l":
                        for (ParentQuestion1 a : accessoryList) {
                            System.out.println(a.toString());
                        }

                        System.out.println("Done");
                        break;
                }
            }

        } while (!userInput.equals("q"));

        input.close();
    }
}

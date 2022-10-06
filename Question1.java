import java.util.Scanner;

/*
 * A program that stores information about a product
 * Author: Awonke Mnotoza
 * Date: 06 October 2022
 * Student number: MNTAWO002
 */

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Accessory[] accessoryList = new Accessory[50]; // & Stores all the Accessory objects

        System.out.println("Welcome to Great International Technology");
        String userInput; // & Stores the user input
        Accessory accessory = null;
        int listIndex = 0;
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
                            break;

                        case "s":
                            System.out.println("Enter the screen size in inches");
                            int size = input.nextInt();
                            input.nextLine();
                            accessory = new Screen(serialNumber, manufacturer, colour, size);
                            break;

                        case "a":
                            accessory = new Accessory(serialNumber, manufacturer, colour);
                            break;

                    }
                    System.out.println("Done");
                }
                switch (userInput) {
                    case "d":
                        Accessory[] newAccessoryList = new Accessory[accessoryList.length];
                        System.out.println("Enter the serial number");
                        int serialNumber = input.nextInt();
                        input.nextLine();
                        for (Accessory item : accessoryList) {
                            if (item != null) {
                                if (item.containsSerialNumber(serialNumber)) {
                                    System.out.println("Done");
                                    break;
                                } else {
                                    System.out.println("Not found");
                                    break;
                                }
                            }
                        }
                        for (int i = 0; i < accessoryList.length; i++) { // & Deleting the object with the given serial
                                                                         // & number
                            if (accessoryList[i] != null) {
                                if (!accessoryList[i].containsSerialNumber(serialNumber)) {
                                    newAccessoryList[i] = accessoryList[i];
                                }
                            }
                        }
                        accessoryList = newAccessoryList;
                        break;
                    case "l":
                        for (Accessory item : accessoryList) {
                            if (item != null) {
                                System.out.println(item);
                            }
                        }
                        System.out.println("Done");
                        break;
                }
            }

            accessoryList[listIndex] = accessory;
            listIndex++;

        } while (!userInput.equals("q"));

        input.close();
    }
}

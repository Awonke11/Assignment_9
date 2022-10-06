import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Accessory[] accessoryList = new Accessory[50];

        String a = s.nextLine();
        while (!a.equals("q")) {
            if (a.equals("d") || a.equals("l")) {
                if (a.equals("d")) {
                    System.out.println("Enter the amount of memory (MB)");
                    int amountOfMemory = s.nextInt();
                    s.nextLine();
                } else if (a.equals("l")) {
                    for (Accessory item : accessoryList) {
                        if (item != null) {
                            System.out.println(item);
                        }
                    }
                    System.out.println("Done");
                }

            } else {
                System.out.println("Enter the serial number");
                int serialNumber = s.nextInt();
                System.out.println("Enter the manufacturer");
                s.nextLine();
                String manufacturer = s.nextLine();
                System.out.println("Enter the colour");
                String colour = s.nextLine();

                if (a.equals("b")) {
                    System.out.println("Enter the amount of memory (MB)");
                    int amountOfMemory = s.nextInt();
                    s.nextLine();
                } else if (a.equals("")) {

                }

                System.out.println("Done");
            }
        }
        s.close();
    }
}

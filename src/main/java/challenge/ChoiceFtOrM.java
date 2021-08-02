package challenge;

import java.util.Scanner;

public class ChoiceFtOrM {
    public static void main(String[] args) {
        System.out.print("Enter f for feet or m for meters: ");
        Scanner in = new Scanner(System.in);
        String choice = in.nextLine();
        if (choice.equals("f")) {
            feet();
        }
        else if (choice.equals("m")) {
            meters();
        }
        else {
            System.out.println("Please enter either f or m");
            System.exit(0);
        }
    }

    public static void feet() {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        String len = in.nextLine();

        // (challenge) validating input, user can't proceed if value is not numeric
        double length = 0;
        try {
            length = Double.parseDouble(len);
        } catch(NumberFormatException e) {
            System.out.println("Please enter a numeric value!");
            System.exit(0);
        }

        System.out.print("What is the width of the room in feet? ");
        String wid = in.nextLine();

        // (challenge) validating input, user can't proceed if value is not numeric
        double width = 0;
        try {
            width = Double.parseDouble(wid);
        } catch(NumberFormatException e) {
            System.out.println("Please enter a numeric value!");
            System.exit(0);
        }

        System.out.printf("You entered dimensions of %.2f feet by %.2f feet.\n", length, width);

        double conversion = 0.09290304;
        double metSq = (length * width) * conversion;
        System.out.printf("The area is \n%.2f square feet", length * width);
    }

    public static void meters() {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the length of the room in meters? ");
        String len = in.nextLine();

        // (challenge) validating input, user can't proceed if value is not numeric
        double length = 0;
        try {
            length = Double.parseDouble(len);
        } catch(NumberFormatException e) {
            System.out.println("Please enter a numeric value!");
            System.exit(0);
        }

        System.out.print("What is the width of the room in meters? ");
        String wid = in.nextLine();

        // (challenge) validating input, user can't proceed if value is not numeric
        double width = 0;
        try {
            width = Double.parseDouble(wid);
        } catch(NumberFormatException e) {
            System.out.println("Please enter a numeric value!");
            System.exit(0);
        }

        System.out.printf("You entered dimensions of %.2f feet by %.2f meters.\n", length, width);

        double conversion = 0.09290304;
        double metSq = (length * width) * conversion;
        System.out.printf("The area is\n%.3f square meters", metSq);
    }
}

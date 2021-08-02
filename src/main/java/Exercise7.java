/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Umran Jameel
 */

import java.util.*;

public class Exercise7 {
    public static void main(String[] args)
    {
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
        System.out.printf("The area is \n%.2f square feet\n%.3f square meters", length * width, metSq);
    }
}

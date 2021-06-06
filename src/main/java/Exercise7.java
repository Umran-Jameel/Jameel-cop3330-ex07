import java.util.*;
public class Exercise7 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        String len = in.nextLine();
        int length = Integer.parseInt(len);

        System.out.print("What is the width of the room in feet? ");
        String wid = in.nextLine();
        int width = Integer.parseInt(wid);

        System.out.printf("You entered dimensions of %d feet by %d feet.\n", length, width);

        double conversion = 0.09290304;
        double metSq = (length * width) * conversion;
        System.out.printf("The area is \n%d square feet\n%.3f square meters", length * width, metSq);
    }
}

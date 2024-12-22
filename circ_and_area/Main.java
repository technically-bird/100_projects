import java.util.Scanner;

public class Main {
        //method to calc area
    public static void Area (double r) {
        double area = Math.pow(r, 2) * Math.PI;
        System.out.println("Area: " + area);
    }
        //method to calc circumference
    public static void Circ (double r) {
        double circ = 2 * Math.PI * r;
        System.out.println("Circumference: " + circ);
    }

        // main program begins
    public static void main (String[] args) {
            // creates the scanner and the variables needed for calculation selection.
        Scanner scanner = new Scanner(System.in);
        String user_choice = "";
        boolean t = false; // this is used as part of the while validation

            // while loop to test for valid input of area or circumference.
        while (!t) {

            System.out.println("Please choose: ");
            System.out.println("A: Area");
            System.out.println("C: Circumference");
            System.out.println("B: Both");
            user_choice = scanner.nextLine();

                // to adjust t to true when a valid selection is made.
                // probably more clunky than necessary, might circle back to refine.
            if (user_choice.equalsIgnoreCase("a")
                    || user_choice.equalsIgnoreCase("c")
                    || user_choice.equalsIgnoreCase("b")) {
                t = true;
            }
        }

            // gather radius from user
        System.out.println("Enter a radius: ");
        double r = scanner.nextDouble();

            // if checks for which calculations to make and calls the appropriate method
        if (user_choice.equalsIgnoreCase("a")) {
            Area(r);
        } else if (user_choice.equalsIgnoreCase("c")) {
            Circ(r);
        } else {
            Area(r);
            Circ(r);
        }
    }
}

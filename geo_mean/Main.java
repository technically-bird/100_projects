import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         // geometric mean of three numbers input by the user
        Scanner scanner = new Scanner(System.in);

        //sets up our nums array
        double[] nums = new double[3];
        int x = 0;

        //collects our numbers
        while (x < 3) {
            System.out.print("Enter a number: ");
            nums[x] = scanner.nextDouble();
            x++;
        }

        // need to multiply the array
        x = 0;
        double sum = 1;
        while (x < 3) {
            sum = sum * nums[x];
            x++;
        }

        // finally calculate the mean by putting it to the 1/3 power--which is the same as taking the cubed root.
        double geo = Math.pow(sum, 1.0/3.0);
        System.out.println("Geometric mean: " + geo);

        scanner.close();
    }
}

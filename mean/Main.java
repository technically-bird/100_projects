import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x; // for iteration
        System.out.println("How many numbers?");
        x = scanner.nextInt(); // allows the user to set the length of the array
        double[] nums = new double[x]; // sets up the array with variable length
        double sum = 0; // initalizes this for use during the sum loop below

        // this has the user populate the array nums
        while (x > 0) {
            System.out.println("Enter a number: ");
            nums[x-1] = scanner.nextDouble();
            x--;
        }

        // this sums the numbers in the array nums
        while (x < nums.length) {
            sum = sum + nums[x];
            x++;
        }

        double mean = sum / nums.length;

        System.out.println("The average is: " + mean);

        scanner.close();
    }
}
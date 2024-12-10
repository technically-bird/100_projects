import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // bmi formula: 703(weight/(height)^2)

        System.out.print("Height (inches): ");
        double height = scanner.nextDouble();
        System.out.print("Weight (pounds): ");
        double weight = scanner.nextDouble();

        double bmi = 703*(weight/Math.pow(height, 2));

        System.out.println("BMI: " + bmi);

        scanner.close();
    }
}

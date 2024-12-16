import java.util.Scanner;
import java.text.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat two = new DecimalFormat("#.##");

        System.out.println("Enter a radius: ");
        double radius = scanner.nextDouble();
        double perimeter = 2* Math.PI * radius;
        System.out.println("Perimeter is: " + two.format(perimeter));

        scanner.close();
    }
}

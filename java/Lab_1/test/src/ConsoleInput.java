import java.util.Scanner;

/**
 * @author Tsimoshchenko M.V
 * @version 1.0
 */

public class ConsoleInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();
        double length = 2 * 3.14159 * radius;
        System.out.println("The length for the circle of radius " + radius + " is " + length);
    }
}

import java.util.Scanner;

/**
 * @author Tsimoshchenko M.V
 * @version 1.0
 */

public class ConsoleInput_2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a side of triangle: ");
        double a = input.nextDouble();

        System.out.print("Enter b side of triangle: ");
        double b = input.nextDouble();
        double square = a * b * 0.5;

        System.out.println("The square of triangle: " + square);
    }
}
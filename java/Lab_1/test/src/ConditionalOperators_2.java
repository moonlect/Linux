import java.util.Scanner;

/**
 * @author Tsimoshchenko M.V
 * @version 1.0
 */

public class ConditionalOperators_2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter num1: ");
        double num1 = input.nextDouble();

        System.out.print("Enter num2: ");
        double num2 = input.nextDouble();

        double min = (num1 < num2) ? num1 : num2;
        System.out.println("Наименьшее из двух чисел равно " + min);
    }
}

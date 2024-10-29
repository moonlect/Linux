/**
 * @author Tsimoshchenko M.V
 * @version 1.0
 */

public class ConditionalOperators {
    public static void main(String args[]) {
        int x = 1;
        int y;

        if (x > 0)
            y = 1;
        else
            y = -1;

        System.out.println("Первый вариант " +  "x = " + x + " y = " + y);

        y = (x > 0) ? 1 : -1;
        System.out.println("Первый вариант " +  "x = " + x + " y = " + y);

        int number = 3;
        System.out.println(number % 2 == 0 ? "число четное" : "число нечетное");

        double num1 = 3.4;
        double num2 = 8.24;
        double max = (num1 > num2) ? num1 : num2;
        System.out.println("Наибольшее из двух чисел равно " + max);
    }
}

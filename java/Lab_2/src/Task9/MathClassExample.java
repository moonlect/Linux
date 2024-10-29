package Task9;

/**
 * Вычисление арифметических выражений
 * с использованием класса Math
 * пример выражения
 * y = a*a*sin(x) - b * exp(-a)
 *
 * @author Tsimoshchenko M.V
 * @version 1.0
 */
public class MathClassExample {
    public static void main(String[] args) {
        int a = 3;
        double b = 34.789;
        double x = 12.3;

        double y = Math.pow(a,2) * Math.sin(x) - b * Math.exp(-a);
        y = Math.sqrt(Math.abs(y));
        System.out.println("y = " + y);
    }
}

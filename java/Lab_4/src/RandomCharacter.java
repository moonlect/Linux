import java.util.Scanner;

/**
 * генерируем случайным образом числа
 * в интервале [0, 1)
 * а также символы в интервале от char1 до char2,
 * целых чисел в интервале от val1 до val2
 * с помощью соответствующих методов
 *
 * @author Tsimoshchenko M.V, Kudryavets D.E
 * @version 1.0
 */
public class RandomCharacter {
    public static void main(String[] args) {
        Scanner inputA = new Scanner(System.in);
        System.out.println("Введите нижнюю границу диапазона: ");
        String a = inputA.nextLine();
        Scanner inputB = new Scanner(System.in);
        System.out.println("Введите верхнюю границу диапазона: ");
        String b = inputB.nextLine();
        if (!a.matches("\\d+") && !b.matches("\\d+")) {
            getRandomCharacter(a.charAt(0), b.charAt(0));
        } else {
            int intA = Integer.parseInt(a);
            int intB = Integer.parseInt(b);
            getRandomCharacter(intA, intB);
        }
    }

    /**
     * генерируем случайным образом символы между ch1 и ch2
     */
    public static void getRandomCharacter(char ch1, char ch2) {
        System.out.print(( char )(ch1 + Math.random() * (ch2 - ch1 + 1)));
    }

    /**
     * генерируем случайные образом число между min и max
     */
    public static void getRandomCharacter(int a, int b) {
        {
            double f = Math.random() / Math.nextDown(1.0);
            double x = a * (1.0 - f) + b * f;
            System.out.printf("%,.2f", x);
        }
    }
}

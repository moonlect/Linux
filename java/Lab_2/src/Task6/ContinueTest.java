package Task6;

/**
 * оператор continue не прерывает цикл
 * исключаются только действия в цикле
 * при выполнении данного условия
 * Пример вычисления суммы чисел
 *
 * @author Tsimoshchenko M.V
 * @version 1.0
 */
public class ContinueTest {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        while (true) {
            number++;
            if(number == 8 || number == 9) break;
            sum += number;
            System.out.println("number = " + number + " sum = " + sum);
        }

        System.out.println("The sum is = " + sum);
    }


}

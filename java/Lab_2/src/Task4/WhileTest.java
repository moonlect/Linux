package Task4;

/**
 * while- оператор цикла
 * На примере вычисления суммы чисел от 0 до xMax
 *
 * @author Tsimoshchenko M.V
 * @version 1.0
 */
public class WhileTest {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int xMax = 10;
        while (i <= xMax) {
            sum += i;
            i++;
        }
        System.out.println("Сумма чисел sum = " + sum);
        System.out.println("Последнее число i = " + i);
    }
}

package Task5;

/**
 * break оператор
 * используется для вывода из цикла
 * в данном случае за пределы цикла!!!
 * Пример суммирования чисел по условию
 *
 * @author Tsimoshchenko M.V
 * @version 1.0
 */
public class BreakeTest {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        while(number < 20){
            number++;
            sum += number;
            //Выход из цикла при выполнении условия
            if(sum >= 100) break;
        }

        System.out.println("Значение переменной number = " + number);
        System.out.println("Значение переменной sum = " + sum);

        //выполнение программы с индивидуальными значениями
        int sum1 = 0;
        int number1 = 0;

        while(number < 50){
            number1++;
            sum1 += number1;
            //Выход из цикла при выполнении условия
            if(sum1 >= 150) break;
        }

        System.out.println("Значение переменной number1 = " + number1);
        System.out.println("Значение переменной sum1 = " + sum1);
    }
}

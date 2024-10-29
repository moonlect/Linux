package Task3;
import java.util.Scanner;

/**
 * Вычисление суммы чисел
 * do-while цикл.
 *
 * @author Tsimoshchenko M.V
 * @version 1.0
 */
public class DoWhileTest {
    public static void main(String[] args) {
        int data;
        int sum = 0;

        //Создаем обьект Scanner
        Scanner input = new Scanner(System.in);

        //Вводим данные пока не 0
        //Keep reading data until the input is 0
        do{
            //Read the next data
            System.out.print("Вводим целое значение (выход,если 0):  ");
            data = input.nextInt();
            sum += data;
        }while(data != 0);

        System.out.println("Sum: " + sum);

        int data1;
        int sum1 = 0;
        do{
            //Read the next data
            System.out.print("Вводим целое значение (выход,если 5):  ");
            data1 = input.nextInt();
            sum1 += data1;
        }while(data1 != 5);

        System.out.println("Sum1: " + sum1);
    }
}

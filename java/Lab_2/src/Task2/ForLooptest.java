package Task2;

/**
 * for - цикл на примерах
 * Example 2 - цикл контролируется по двум переменным!!!
 *
 * @author Tsimoshchenko M.V
 * @version 1.0
 */
public class ForLooptest {
    public static void main(String[] args) {

        //Example 1
        //Initialize sum
        float sum = 0;

        //Add 0.01, 0.02, ...,0.99, 1 to sum
        for (float x = 0.01f; x <= 1.0f; x = x + 0.01f)
            sum += x;

        //Display result
        System.out.println("The sum is " + sum);

        //Example 2
        //цикл контролируется по двум переменным!!!
        for(int i = 0,j = 3;(i + j < 10);i++,j++){
            System.out.println("\nТекущее значение i = " + i + " j = " + j);
            System.out.println("\tСумма i + j = " + (i + j));
        }

        //Example 1
        //Initialize sum
        //собственный пример

        float sum1 = 0;

        for (float x = 1.99f; x >= 1.0f; x = x - 0.01f)
            sum1 += x;

        //Display result
        System.out.println("The sum is " + sum1);

        //Example 2
        //цикл контролируется по двум переменным!!!
        //собственный пример
        for(int i = 10,j = 5;(i + j > 10);i--,j--){
            System.out.println("\nТекущее значение i = " + i + " j = " + j);
            System.out.println("\tСумма i + j = " + (i + j));
        }
    }

}

package Task2;

import java.util.Scanner;

/**
 * @author Tsimoshchenko M.V, Kudryavets D.E
 * @version 1.0
 */
public class MaxTest {
    /** Main method */
    public static void  main(String[] args) {
        Scanner inputNum1 = new Scanner(System.in);
        int num1 = inputNum1.nextInt();
        Scanner inputNum2 = new Scanner(System.in);
        int num2 = inputNum2.nextInt();

        //call method min
        min(num1, num2);
    }

    /** Output the min between two numbers in console */
    public static void min(int num1, int num2){
        int min = (num1 < num2) ? num1 : num2;
        System.out.println("Наименьшее из двух чисел: " + min);
    }
}

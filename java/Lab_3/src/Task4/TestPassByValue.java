package Task4;

import java.util.Scanner;

/**
 *  @author Tsimoshchenko M.V, Kudryavets D.E
 * @version 1.0
 */
public class TestPassByValue {
    /** Main method */
    public static void main(String[] args) {
        // Объявляем и инициализируем переменные
        int num1 = 1;
        int num2 = 2;
        boolean flag;
        Scanner inputFlag = new Scanner(System.in);
        int intFlag = inputFlag.nextInt();
        if (intFlag == 0)
            flag = false;
        else
            flag = true;
        System.out.println("Перед вызовом метода swap, num1 = " +  num1 + " и num2 = " + num2);
        int[] output = swap(num1, num2, flag);
        num1 = output[0];
        num2 = output[1];
        System.out.println("После вызова метода swap method, num1 = " +  num1 + " и num2 = " + num2);
    }
    /** Swap two variables */
    public static int[] swap(int n1, int n2, boolean flag) {
        if (!flag)
            System.out.println("Флаг false, операция не выполнена");
        else {
            System.out.println("\tВнутри метода swap");
            System.out.println("\t\tПеред перестановкой n1 = " + n1  + " n2 = " + n2);
            // Swap n1 with n2
            int temp = n1;
            n1 = n2;
            n2 = temp;
            System.out.println("\t\tПосле перестановки n1 = " + n1  + " n2 = " + n2);
        }
        int[] output = {n1, n2};
        return output;
    }
}
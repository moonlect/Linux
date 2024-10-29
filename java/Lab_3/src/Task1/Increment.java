package Task1;

import java.util.Scanner;

/**
 *  @author Tsimoshchenko M.V, Kudryavets D.E
 * @version 1.0
 */
public class Increment {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Before the call, x is "+ n);
        increment(n); // вызов метода increment
        System.out.println("After the call, x is " + n);
    }

    public static void increment(int n) { //объявление метода increment
        ++n;
        System.out.println("n inside the method is " + n);
    }
}

package Task5;

import java.util.Scanner;

/**
 *  @author Tsimoshchenko M.V, Kudryavets D.E
 * @version 1.0
 */
public class VoidMethodTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter grade score: ");
        double score = input.nextDouble();
        System.out.print("The grade is ");
        printGrade(score);

    }
    public static void printGrade(double score) {
        if (score >= 90) {
            System.out.print("A");
        } else if (score >= 80) {
            System.out.print("B");
        } else if (score >= 70) {
            System.out.print("C");
        } else if (score >= 60) {
            System.out.print("D");
        } else if (score >= 50) {
            System.out.print("E");
        } else {
            System.out.print("F");
        }
    }
}


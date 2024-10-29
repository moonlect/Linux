package Task9;

import java.util.Scanner;

public class QuadraticAquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number a: ");
        double a = input.nextDouble();
        System.out.print("Enter the second number b: ");
        double b = input.nextDouble();
        System.out.print("Enter the third number c: ");
        double c = input.nextDouble();

        double D = Math.pow(b,2) - 4*a*c;
        double x1 = 0,x2 = 0;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        if(D < 0){

            System.out.println("The quadratic aquation is too small");

        }else{
            x1 = (-b + Math.sqrt(D))/(2*a);
            x2 = (-b - Math.sqrt(D))/(2*a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }



    }
}

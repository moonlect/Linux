package Task4;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Введите день вашего рождения
        System.out.print("Enter your birth day number: ");
        int xMax = input.nextInt();

        //Введите месяц вашего рождения
        System.out.print("Enter your birth month number: ");
        int xMin = input.nextInt();

        int sum = 0;

        if(xMin == xMax){
            xMax = xMax * 10;
        }else if(xMin > xMax) {
            while (xMax < xMin) {
                if (xMax % 2 != 0) {
                    sum += xMax;
                }
                xMax++;
            }
        }else{
            while (xMin < xMax) {
                if (xMin % 2 != 0) {
                    sum += xMin;
                }
                xMin++;
            }
        }


        System.out.println(xMin);//вывод xMin
        System.out.println(xMax);//вывод xMax
        System.out.println("Sum of odd numbers: " + sum);

    }
}

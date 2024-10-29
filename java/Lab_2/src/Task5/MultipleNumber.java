package Task5;

import java.util.Scanner;

public class MultipleNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your birth day: ");
        int birthDay = input.nextInt();
        System.out.print("Enter your birth month: ");
        int birthMonth = input.nextInt();
        System.out.print("Enter your birth year: ");
        long birthYear = input.nextInt();

        //Сумма дня,месяца,года рождения
        long Nmax = birthMonth + birthDay + birthYear;
        long p = 1;

        for(int i = 14; i < Nmax; i++) {
            p *= i;

            if(p % 79 == 0){
                break;
            }
        }

        //Произведение целых чисел
        System.out.println("Multiple number is " + p + ".");

    }
}

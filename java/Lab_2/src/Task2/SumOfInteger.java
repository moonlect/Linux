package Task2;

import java.util.Scanner;

public class SumOfInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Введите цифрой номер месяца вашего дня рождения
        System.out.print("Enter your birth month as a number: ");
        int month = input.nextInt();

        //Введите цифрой день вашего рождения
        System.out.print("Enter your birth day as a number: ");
        int day = input.nextInt();

        int sum = 0;

        for(int i = 0, j = 200 ; i < 100 && j < 500 ; i++,j++){
            if (i % day == 0 && i % month == 0) {
                sum += i;
            }
            if (j % day == 0 && j % month == 0) {
                sum += j;
            }
        }

        //Вывод суммы целых чисел
        System.out.println(sum);
        input.close();
    }
}

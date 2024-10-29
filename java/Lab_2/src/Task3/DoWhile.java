package Task3;
import java.util.Scanner;



public class DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Введите день вашего рождения
        System.out.print("Enter your birth day number: ");
        int birthDay = input.nextInt();

        //Введите месяц вашего рождения
        System.out.print("Enter your birth month number: ");
        int birthMonth = input.nextInt();


        int sum  = 0;
        int number;

        do{
            //Read number
            System.out.print("Enter number: ");
            number = input.nextInt();
            sum += number;
        }while((number != birthDay) && (number !=birthMonth));

        System.out.println("The sum is: " + sum);
        input.close();
    }
}

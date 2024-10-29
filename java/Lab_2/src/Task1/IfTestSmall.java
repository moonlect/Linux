package Task1;
import java.util.Scanner;

/**
 *Ввод данных с консоли с использованием Scanner
 *Конструкции для
 *operator if
 *-one-way
 *-two-way
 *-nested
 *
 * @author Tsimoshchenko M.V
 * @version 1.0
 */
public class IfTestSmall{
    public static void main(String[] args) {


        //создаем экземпляр класса Scanner для ввода
        Scanner input = new Scanner(System.in);

        //&#x43F;&#x43E;&#x434;&#x441;&#x43A;&#x430;&#x437;&#x43A;&#x430; &#x432;&#x432;&#x43E;&#x434;&#x438;&#x442;&#x44C; &#x445;
        System.out.println("Enter the first number: ");
        int x = input.nextInt();

        //подсказка вводить у
        System.out.println("Enter the second number: ");
        int y = input.nextInt();

        //Вариант 1:one-way
        if(x > y)
            System.out.println("x > y");

        //Вариант 2:one-way
        if (x > y){



            System.out.println("x > y");
            System.out.println("Разность x - y = " + (x - y));
        }

        //Вариант 3:two-way
        if(x > y){
            System.out.println("x > y");
            System.out.println("Разность x - y = " + (x - y));
        }else{
            System.out.println("x <= y");
        }
    }
}


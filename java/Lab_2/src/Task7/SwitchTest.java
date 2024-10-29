package Task7;
import javax.swing.*;
import java.util.Scanner;

/**
 * оператор switch;
 * в операторе switch наличие break важно!
 * Ввод данных с использованием графического окна
 * библиотеки Swing
 *
 * Задание
 * создание диалогового окна с помощью
 * библиотеки swing
 * где пользователю необходимо выбрать
 * цифру от 1 до 3
 * в зависимости от выбранной цифры
 * с помощью оператора switch
 * выводится соответствующее сообщение
 * с текстом
 *
 * @author Tsimoshchenko M.V
 * @version 1.0
 */
public class SwitchTest {
    public static void main(String[] args) {
        //Для вывода данных используем графическое окно из библиотеки Swing
        //результат в переменной input типа String
        String answer = JOptionPane.showInputDialog(null,
                "Введите вариант ответа от 1 до 3",
                "Вариант ответа",JOptionPane.OK_CANCEL_OPTION);

        //конвертируем символьную переменную input
        //в целую variant
        int variant = Integer.parseInt(answer);

        //анализируем значение переменной variant
        switch (variant){
            case 1:
                System.out.println("Вы выбрали первый вариант");
                break;
            case 2:
                System.out.println("Вы выбрали второй вариант");
                break;
            case 3:
                System.out.println("Вы выбрали третий вариант");
                break;
            default:
                System.out.println("Ваш выбор не соответствует заданному");
        }
    }
}

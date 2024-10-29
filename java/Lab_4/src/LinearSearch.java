import java.util.Random;

/**
 * Класс для выполнения линейного поиска в массиве.
 * @author Tsimoshchenko M.V, Kudryavets D.E
 * @version 1.0
 */
public class LinearSearch {

    /**
     * Метод для выполнения линейного поиска заданного элемента в массиве.
     *
     * @param array массив, в котором выполняется поиск
     * @param target элемент, который необходимо найти
     * @return индекс элемента в массиве, если он найден, иначе -1
     */
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Создаем массив из 50 случайных целых чисел от 0 до 100
        int[] array = new int[50];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }

        // Выводим массив на экран
        System.out.println("Массив:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Тестируем метод линейного поиска
        int target = 42; // элемент, который будем искать
        int index = linearSearch(array, target);

        if (index != -1) {
            System.out.println("Элемент " + target + " найден на индексе " + index);
        } else {
            System.out.println("Элемент " + target + " не найден в массиве");
        }
    }
}

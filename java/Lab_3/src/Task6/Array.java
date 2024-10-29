package Task6;

import java.util.Scanner;

/**
 * @author Tsimoshchenko M.V, Kudryavets D.E
 * @version 1.0
 */
public class Array {

    private int[] array;

    /**
     * Конструктор для создания и инициализации массива.
     * @param size размер массива (от 10 до 30 элементов)
     */
    public Array(int size) {
        if (size < 10 || size > 30) {
            throw new IllegalArgumentException("Размер массива должен быть от 10 до 30 элементов.");
        }
        array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100); // Инициализация случайными значениями от 0 до 99
        }
    }

    /**
     * Метод для сортировки массива по возрастанию.
     */
    public void sortAscending() {
        java.util.Arrays.sort(array);
    }

    /**
     * Метод для сортировки массива по убыванию.
     */
    public void sortDescending() {
        java.util.Arrays.sort(array);
        reverseArray();
    }

    /**
     * Метод для вывода массива.
     */
    public void printArray() {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    /**
     * Вспомогательный метод для разворота массива.
     */
    private void reverseArray() {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        Array arr = new Array(size);
        System.out.println("Исходный массив:");
        arr.printArray();

        arr.sortAscending();
        System.out.println("Отсортированный по возрастанию массив:");
        arr.printArray();

        arr.sortDescending();
        System.out.println("Отсортированный по убыванию массив:");
        arr.printArray();
    }
}


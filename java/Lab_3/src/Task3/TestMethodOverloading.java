package Task3;
/**
 * перегрузка методов
 * имена методов одинаковые, различные сигнатуры
 * количество параметров и их типы отличаются
 * на примере нахождения максимума и минимума
 *  @author Tsimoshchenko M.V, Kudryavets D.E
 * @version 1.0
 */
public class TestMethodOverloading {
    /**
     * Main method
     */
    public static void main(String[] args) {
        // Вызов метода max метода с двумя int параметрами
        System.out.println("The maximum between 3 and 4 is "
                + max(3, 4));
        // Вызов метода max с двумя double параметрами
        System.out.println("The maximum between 3.0 and 5.4 is " +  + max(3.0, 5.4));
        // Вызов метода max с int и double параметрами
        System.out.println("The maximum between 3 and 5.4 is "  + max(3, 5.4));
        // Вызов метода max с double и int параметрами
        System.out.println("The maximum between 3.5 and 5 is "  + max(3.5, 5));
        // Вызов метода max с double и float параметрами
        System.out.println("The maximum between 3.5 and 5.23f is "  + max(3.5, 5.23f));
        // Вызов метода max с тремя! double параметрами
        System.out.println("The maximum between 3.0, 5.4, and 10.14 is "  + max(3.0, 5.4, 10.14));
        // Вызов метода max с float, int, double параметрами
        System.out.println("The maximum between 7.05f, 5, and 1.14 is "  + max(7.05f, 5, 1.14));
        System.out.println("Test "  + max(1, 5.2));

        // Вызов метода min с двумя double параметрами
        System.out.println("The minimum between 3.0 and 5.4 is " +  + min(3.0, 5.4));
        // Вызов метода min с int и double параметрами
        System.out.println("The minimum between 3 and 5.4 is "  + min(3, 5.4));
        // Вызов метода min с double и int параметрами
        System.out.println("The minimum between 3.5 and 5 is "  + min(3.5, 5));
        // Вызов метода min с double и float параметрами
        System.out.println("The minimum between 3.5 and 5.23f is "  + min(3.5, 5.23f));
        // Вызов метода min с тремя! double параметрами
        System.out.println("The minimum between 3.0, 5.4, and 10.14 is "  + min(3.0, 5.4, 10.14));
        // Вызов метода min с float, int, double параметрами
        System.out.println("The minimum between 7.05f, 5, and 1.14 is "  + min(7.05f, 5, 1.14));

    }
    /**
     * Возвращает max из двух int значений
     */
    public static int max(int num1, int num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    /**
     * Возвращает max из двух double значений
     */
    public static double max(double num1, double num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }
    /**
     * Возвращает max из трех double значений
     * используется обращение к методу с двумя параметрами
     */
    public static double max(double num1, double num2, double num3) {  return max(max(num1, num2), num3);
    }
    /**
     * Возвращает min из двух int значений
     */
    public static int min(int num1, int num2) {
        if (num1 < num2)
            return num1;
        else
            return num2;
    }
    /**
     * Возвращает min из двух double значений
     */
    public static double min(double num1, double num2) {
        if (num1 < num2)
            return num1;
        else
            return num2;
    }
    /**
     * Возвращает min из трех double значений
     * используется обращение к методу с двумя параметрами
     */
    public static double min(double num1, double num2, double num3) {  return min(min(num1, num2), num3);
    }
}




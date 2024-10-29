package Task3;

public class TestSqrt {
    /**
     * Main method
     */
    public static void main(String[] args) {
        // Вызов метода mySqrt метода с  int параметрами
        System.out.println("The sqrt 3 is " + mySqrt(3));
        // Вызов метода mySqrt с double параметрами
        System.out.println("The sqrt 5.4 is "  + mySqrt(5.4));
        // Вызов метода mySqrt с double и float параметрами
        System.out.println("The sqrt 5.23f is "  + mySqrt(5.23f));

    }
    /**
     * Возвращает mySqrt из int значения
     */
    public static double mySqrt(int num1) {
        return Math.pow(num1, 0.5);
    }
    /**
     * Возвращает mySqrt из double значения
     */
    public static double mySqrt(double num1) {
            return Math.pow(num1, 0.5);
    }
}

import java.util.Scanner;

/**
 * пример использования массивов для
 * передачи данных в метод и обратно
 * пример 2; решение квадратного уравнения
 *
 * @author Tsimoshchenko M.V, Kudryavets D.E
 * @version 1.0
 */
public class ArrayExampleSwap {
    public static void main(String[] args) {
        System.out.println("Введите параметр А:");
        Scanner inputA = new Scanner(System.in);
        double a = inputA.nextDouble();
        System.out.println("Введите параметр B");
        Scanner inputB = new Scanner(System.in);
        double b = inputB.nextDouble();
        System.out.println("Введите параметр С:");
        Scanner inputC = new Scanner(System.in);
        double c = inputC.nextDouble();
        System.out.println("Уравнение: "+a+"*x*x+("+b+"*x)+("+c+")");
        System.out.println("Рациональные корни(корень) уравнения:");
        double[] param = {a, b, c};
        for (double root : findRoots(param)) {
            System.out.println(root);
        }
    }
    private static double[] findRoots(double[] param) {
        double x1 = 0;
        double x2 = 0;
        double a = param[0];
        double b = param[1];
        double c = param[2];
        double discriminant = b*b-4*a*c;
        if (discriminant < 0)
            System.out.println("Рациональных корней нет");
        else if (discriminant == 0) {
            x1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            x2 = x1;
        }
        else {
            x1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            x2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
        }
        double[] roots = {x1, x2};
        return roots;
    }
}

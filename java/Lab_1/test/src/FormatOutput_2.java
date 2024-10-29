
/**
 * @author Tsimoshchenko M.V
 * @version 1.0
 */

public class FormatOutput_2 {
    public static void main(String[] args) {
        boolean ans = true;
        char letter = 'b';
        float sum = 45.47f;
        System.out.printf("\nЭто пример 1 \n ans =%8b", ans);
        System.out.printf("\nЭто пример 2 \n letter  =%4c", letter);
        System.out.printf("\nЭто пример 3 \n sum =%5.2f", sum);
        System.out.printf("\nЭто пример 4" + "\n ans =%8b \n letter =%4c \n sum =%5.2f", ans, letter, sum);
        double disc = 2343462.9067;
        String text = "this is not my text";
    }
}

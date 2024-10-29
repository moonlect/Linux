package Task8;

/**
 * применение label и continue.
 * Конструкции для label и continue
 *
 * @author Tsimoshchenko M.V
 * @version 1.0
 */
public class LabelTest {
    public static void main(String[] args) {
        int[] scores = {3, 9, 10, 0 , 8, 10,  7, 1, 9, 8};

        outer:
        for(int i = 0;i < 10;i++) {
            System.out.println("Score: " + scores[i]);
            if (scores[i] <= 0) break outer;
            if (scores[i] > 5) {
                inner:
                for (int j = 0; j < 3; j++) {
                    if (scores[i] == 10) {
                        System.out.println("Хороший результат!Ура!!!");
                        continue inner;
                    }
                    System.out.println("Неплохо!Ура!");
                    continue outer;
                }
            }
            if (scores[i] <= 5 && scores[i] >= 3) {
                System.out.println("Больше практики...");
            }
            if (scores[i] < 3) {
                System.out.println("Начни заново");
            }
        }
    }
}

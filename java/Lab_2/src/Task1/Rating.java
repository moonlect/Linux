package Task1;
import java.util.Scanner;

public class Rating {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the score from 0 to 100: ");
        int x = input.nextInt();

        if (x < 0 || x >100) {
            System.out.println("The score is out of range");
        }else if(x >= 90){
            System.out.println("Score - A");
        } else if ((x >= 80) && (x < 90)) {
            System.out.println("Score - B");
        }else if ((x >= 70) && (x < 80)) {
            System.out.println("Score - C");
        }else if ((x >= 60) && (x < 70)) {
            System.out.println("Score - D");
        }else{
            System.out.println("F");
        }
    }


}

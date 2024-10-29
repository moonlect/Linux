package Task7;
import java.util.Scanner;


public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter grade : ");
        int grade = input.nextInt();

        grade = grade / 10;

        switch(grade){
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
                break;
        }

        if(grade <0 || grade >100){
            System.out.println("Invalid grade");
        }
    }
}

/**
 * @author Tsimoshchenko M.V, Kudryavets D.E
 * @version 1.0
 */

public class BoxDemo {
    public static void main(String[] args){
        Box myBox=new Box();
        double area;

        myBox.length=15;
        myBox.width=10;
        area=myBox.length * myBox.width;
        System.out.println("Square = "+area);

        Box myBox2=new Box();
        myBox2.length=20;
        myBox2.width=15;
        myBox2.borderColor="Red";
        area=myBox2.length * myBox2.width;
        myBox2.Print();
        System.out.println("Square = "+area);
    }
}

class Box {
    double width;
    double length;
    String borderColor;

    public void Print(){
        System.out.println("Width = "+width);
        System.out.println("Length = "+length);
        System.out.println("Border's color = "+borderColor);
    }
}
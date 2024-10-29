/**
 * @author Tsimoshchenko M.V, Kudryavets D.E
 * @version 1.0
 */


public class CircleTest {
    public static void main(String[] args) {
        Circle circle1=new Circle();
        System.out.println("Circle 1 - Radius: "+circle1.getRadius()+", Color: "+circle1.getColor());
        System.out.println("Area: "+circle1.getArea());
        System.out.println("Length: "+circle1.getLength());

        Circle circle2=new Circle(2.0);
        System.out.println("Circle 2 - Radius: "+circle2.getRadius()+", Color: "+circle2.getColor());
        System.out.println("Area: "+circle2.getArea());
        System.out.println("Length: "+circle2.getLength());

        Circle circle3=new Circle(2.5, "Green");
        System.out.println("Circle 3 - Radius: "+circle3.getRadius()+", Color: "+circle3.getColor());
        System.out.println("Area: "+circle3.getArea());
        System.out.println("Length: "+circle3.getLength());

        Circle circle4=new Circle(2.5f, "Yellow");
        System.out.println("Circle 4 - Radius: "+circle4.getRadius()+", Color: "+circle4.getColor());
        System.out.println("Area: "+circle4.getArea());
        System.out.println("Length: "+circle4.getLength());

        circle1.SetRadius(2.5);
        circle1.SetColor("Red");
        System.out.println("Circle 1 after setting new values - Radius: "+circle1.GetRadius()+", Color: "+circle1.GetColor());
        System.out.println("Area: "+circle1.getArea());
        System.out.println("Length: "+circle1.getLength());
    }
}

class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius=3.0;
        color="Red";
    }

    public Circle(double r) {
        radius=r;
        color="Red";
    }

    public Circle(double r, String c) {
        radius=r;
        color=c;
    }

    public Circle(float r, String c) {
        radius=r;
        color=c;
    }

    // Public methods
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getLength() {
        return Math.PI * radius * 2;
    }

    //setters
    public void SetRadius(double radius) {
        this.radius=radius;
    }

    public void SetColor(String color) {
        this.color=color;
    }

    //getters
    public double GetRadius() {
        return this.radius;
    }

    public String GetColor() {
        return this.color;
    }
}




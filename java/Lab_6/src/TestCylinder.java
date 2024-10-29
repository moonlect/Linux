/**
 * Control program for the Cylinder class
 *
 * @author Tsimoshchenko M.V, Kudryavets D.E
 * @version 1.0
 */

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder(5.0, 2.1);
        cylinder1.setHeight(3.1);
        System.out.println(cylinder1.toString());
    }
}

/**
 * The Cylinder class is a subclass of the Circle class
 * The Circle class was used earlier
 */
class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * getRadius() * this.height + 2 * super.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder: radius = " + getRadius() + ", height = " + this.height;
    }
}

class Circle {
    // Private variables
    private double radius;
    private String color;

    // Constructors (overloaded)
    public Circle() {                   // 1st Constructor
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius) {      // 2nd Constructor
        this.radius = radius;
        this.color = "red";
    }

    public Circle(double radius, String color) { // 3rd Constructor
        this.radius = radius;
        this.color = color;
    }

    public Circle(float radius, String color) { // 4th Constructor
        this.radius = radius;
        this.color = color;
    }

    // Public methods
    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getLength() {
        return Math.PI * radius * 2;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

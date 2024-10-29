

public class TestCircle {
    public static void main(String[] args) {
        // Testing all constructors
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2.5);
        Circle circle3 = new Circle(3.0, "blue");
        Circle circle4 = new Circle(4.0f, "green");

        // Testing methods
        System.out.println(circle1.toString());
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Circumference: " + circle1.getLength());

        circle2.setRadius(5.0);
        circle2.setColor("yellow");
        System.out.println(circle2.toString());
        System.out.println("Area: " + circle2.getArea());
        System.out.println("Circumference: " + circle2.getLength());
    }
}
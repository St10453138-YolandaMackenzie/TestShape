package testshape;

public class TestShape {
    public static void main(String[] args) {
        // Create Circle instances
        Circle circle1 = new Circle(5.0, "Red");
        Circle circle2 = new Circle(3.2, "Blue");

        // Create Rectangle instances
        Rectangle rectangle1 = new Rectangle(4.0, 6.0, "Green");
        Rectangle rectangle2 = new Rectangle(2.5, 3.5, "Yellow");

        // Print details and area of each Circle
        System.out.println(circle1.toString());
        System.out.println("Area: " + circle1.calculateArea());
        System.out.println();

        System.out.println(circle2.toString());
        System.out.println("Area: " + circle2.calculateArea());
        System.out.println();

        // Print details and area of each Rectangle
        System.out.println(rectangle1.toString());
        System.out.println("Area: " + rectangle1.calculateArea());
        System.out.println();

        System.out.println(rectangle2.toString());
        System.out.println("Area: " + rectangle2.calculateArea());
        System.out.println();
    }
}

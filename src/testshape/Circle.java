package testshape;

// Circle class extends Shape
public class Circle extends Shape {
    private double radius; // Encapsulation

    // Constructor to set radius and color
    public Circle(double radius, String color) {
        super(color); // Call Shape constructor
        this.radius = radius;
        System.out.println("Circle constructor called");
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Override calculateArea for circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Override toString to show radius and color
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", " + super.toString() + "]";
    }
}

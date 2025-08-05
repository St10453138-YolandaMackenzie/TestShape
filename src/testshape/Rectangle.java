package testshape;

public class Rectangle extends Shape {
    private double width;  // Encapsulation
    private double height; // Encapsulation

    // Constructor to set width, height and color
    public Rectangle(double width, double height, String color) {
        super(color); // Calling Shape constructor
        this.width = width;
        this.height = height;
        System.out.println("Rectangle constructor called");
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Setter for width
    public void setWidth(double width) {
        this.width = width;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(double height) {
        this.height = height;
    }

    // Override calculateArea for rectangle
    @Override
    public double calculateArea() {
        return width * height;
    }

    // Override toString to show width, height and color
    @Override
    public String toString() {
        return "Rectangle[width=" + width + ", height=" + height + ", " 
               + super.toString() + "]";
    }
}

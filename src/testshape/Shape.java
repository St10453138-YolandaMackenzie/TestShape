package testshape;

// Parent Class Shape
public class Shape {
    private String color; // Encapsulation

    // Constructor to set the color
    public Shape(String color) {
        this.color = color; // Fixed: 'this colour' → 'this.color'
        System.out.println("Shape constructor called");
    }

    // Getter for color
    public String getColor() { // Fixed: method name spacing
        return color;
    }

    // Setter for color
    public void setColor(String color) { // Fixed: 'this color' → 'this.color'
        this.color = color;
    }

    // Method to calculate area
    public double calculateArea() {
        return 0;
    }

    // toString method to display color
    @Override
    public String toString() {
        return "color=" + color; // Fixed: missing semicolon
    }
}

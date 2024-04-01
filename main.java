// Import statements
import java.util.*;

// Interface for shapes
interface Shape {
    double calculateArea(); // Method to calculate area
}

// Abstract class for a geometric shape
abstract class GeometricShape implements Shape {
    // Common attributes for all geometric shapes
    protected double width;
    protected double height;

    // Constructor
    public GeometricShape(double width, double height) {
        this.width = width;
        this.height = height;
    }
}

// Rectangle class implementing the Shape interface and extending the GeometricShape abstract class
class Rectangle extends GeometricShape {
    // Constructor
    public Rectangle(double width, double height) {
        super(width, height); // Calls the constructor of the superclass GeometricShape
    }

    // Override the calculateArea method
    @Override
    public double calculateArea() {
        return width * height; // Area of rectangle
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a rectangle object
        Rectangle rectangle = new Rectangle(5, 10);

        // Calculating and printing the area
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}

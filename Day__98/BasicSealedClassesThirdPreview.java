// Sealed class representing different shapes
sealed class Shape permits Circle, Rectangle {
    // Abstract method to calculate area
    public abstract double calculateArea();
}

// Concrete sealed subclass representing a circle
final class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete sealed subclass representing a rectangle
final class Rectangle extends Shape {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class BasicSealedClassesThirdPreview {
    public static void main(String[] args) {
        // Creating instances of sealed classes
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        // Calculating and printing areas
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
    }
}

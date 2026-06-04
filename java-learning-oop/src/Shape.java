// Parent class for all shapes, with a method to calculate the area of any shape
public class Shape {
    public double calculateArea() {
        System.out.println("Unknown shape area.");
        return 0.0;
    }
}

// Child classes for Circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Override the calculateArea method to compute the area of a square
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Child classes for Square
class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    // Override the calculateArea method to compute the area of a square
    @Override
    public double calculateArea() {
        return side * side;
    }
}

// Child classes for Rectangle
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Override the calculateArea method to compute the area of a square
    @Override
    public double calculateArea() {
        return width * height;
    }
}
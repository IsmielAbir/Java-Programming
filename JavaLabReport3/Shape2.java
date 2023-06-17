/*
 14.	[Interface] Implement the following diagram, where Shape is an interface and Circle, Rectangle & Triangle are three subclasses of the Shape interface.
 */

package JavaLabReport3;

public interface Shape2 {
    double calculateArea();
    double calculateCircumference();
}

class Circle implements Shape2 {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle1 implements Shape2 {
    private double length;
    private double width;

    public Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculateCircumference() {
        return 2 * (length + width);
    }
}

class Triangle implements Shape2 {
    private double base;
    private double height;
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double base, double height, double sideA, double sideB, double sideC) {
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }

    public double calculateCircumference() {
        return sideA + sideB + sideC;
    }
}
class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Circumference: " + circle.calculateCircumference());

        Rectangle1 rectangle = new Rectangle1(4.0, 6.0);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Circumference: " + rectangle.calculateCircumference());

        Triangle triangle = new Triangle(3.0, 4.0, 5.0, 4.0, 3.0);
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Circumference: " + triangle.calculateCircumference());
    }
}

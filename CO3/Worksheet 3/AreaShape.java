// Write a java program for calculating the area of rectangle and circle using runtime polymorphism.
import java.util.Scanner;

class Shape {
    double calculateArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return 3.14 * radius * radius;
    }
}

public class AreaShape {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        double length = scan.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double width = scan.nextDouble();

        Shape rectangle = new Rectangle(length, width);

        System.out.print("Enter radius of circle: ");
        double radius = scan.nextDouble();

        Shape circle = new Circle(radius);

        System.out.println("Area of rectangle: " + rectangle.calculateArea());
        System.out.println("Area of circle: " + circle.calculateArea());

        scan.close();
    }
}
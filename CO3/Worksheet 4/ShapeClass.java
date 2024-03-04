//Write a Java program to create an abstract class Shape with abstract
// methods drawarea() and drawperimeter(). Create subclasses Circle and
// Triangle that extend the Shape class and implement the respective
// methods to calculate the area and perimeter of each shape. (hint: area
// of circle-2, perimeter of a triangle=a+b+c , ie., Add all three side values)
abstract class Shape {
    abstract void drawArea();
    abstract void drawPerimeter();
}
class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    void drawArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
    void drawPerimeter() {
        double perimeter = 2 * 3.14 * radius;
        System.out.println("Perimeter of Circle: " + perimeter);
    }
}
class Triangle extends Shape {
    double a, b, c;
    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    void drawArea() {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
        System.out.println("Area of Triangle: " + area);
    }
    void drawPerimeter() {
        double perimeter = a + b + c;
        System.out.println("Perimeter of Triangle: " + perimeter);
    }
}
public class ShapeClass {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.drawArea();
        c.drawPerimeter();
        Triangle t = new Triangle(3, 4, 5);
        t.drawArea();
        t.drawPerimeter();
    }
}
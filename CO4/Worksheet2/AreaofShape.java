//Create an abstract class shape with abstract method to calculate area of various
// shapes like rectangle, triangle, square and non-abstract method to get corresponding
// inputs for area calculation.
import java.util.Scanner;
abstract class Shape {
   abstract void calculateArea();
   void input() {
       System.out.println("No specific input needed for this shape.");
   }
}
class Rectangle extends Shape {
   double length;
   double width;
   void input() {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter length of Rectangle:");
       length = scanner.nextDouble();
       System.out.print("Enter width of Rectangle:");
       width = scanner.nextDouble();
       scanner.close();
   }
   void calculateArea() {
       double area = length * width;
       System.out.println("Area of Rectangle: " + area);
   }
}
class Triangle extends Shape {
   double base;
   double height;
   void input() {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter base of Triangle:");
       base = scanner.nextDouble();
       System.out.print("Enter height of Triangle:");
       height = scanner.nextDouble();
       scanner.close();
   }
   void calculateArea() {
       double area = 0.5 * base * height;
       System.out.println("Area of Triangle: " + area);
   }
}
class Square extends Shape {
   double side;
   void input() {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter side of Square:");
       side = scanner.nextDouble();
       scanner.close();
   }
   void calculateArea() {
       double area = side * side;
       System.out.println("Area of Square: " + area);
   }
}
public class AreaofShape {
   public static void main(String[] args) {
       Rectangle r = new Rectangle();
       r.input();
       r.calculateArea();
       Triangle t = new Triangle();
       t.input();
       t.calculateArea();
       Square s = new Square();
       s.input();
       s.calculateArea();
   }
}

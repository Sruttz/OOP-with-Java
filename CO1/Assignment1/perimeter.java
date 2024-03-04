// Write a java code to create to calculate perimeter of rectangle
import java.util.Scanner;
public class perimeter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the length:");
        double length = scan.nextDouble();
        System.out.print("Enter the width:");
        double width = scan.nextDouble();
        double perimeter = 2*(length+width);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        scan.close();
    }
}
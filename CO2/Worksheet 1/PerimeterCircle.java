//Find the perimeter of a circle using class, object and methods
import java.util.Scanner;

class perii{
    double rad,perimeter;
    void assign(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter radius:");
        rad=scan.nextInt();
        scan.close();
    }

    double peri(){
        double perimeter=2*Math.PI*rad;
        return perimeter;
    }
}

public class PerimeterCircle {
    public static void main(String args[])
    {
        perii obj1=new perii();
        obj1.assign();

        double result=obj1.peri();
        System.out.println("Perimeter of the circle: " + result);
    }
}
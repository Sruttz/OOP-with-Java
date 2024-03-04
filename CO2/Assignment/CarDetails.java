package Assignment;
//Write a Java program to create a class called Car with instance variables
// company_name, model_name, year, and mileage. Use method assign(….) for
// assigning the variable values and display() method for displaying all the values of
// instance variables. (hint: you can declare appropriate arguments for assign(…), use
// Scanner class)
import java.util.*;
class Car {
    String company_name,model_name;
    int year;
    double mileage;
    void assign(String company_name, String model_name, int year, double mileage) {
        this.company_name=company_name;
        this.model_name=model_name;
        this.year=year;
        this.mileage=mileage;
    }
    void display() {
        System.out.println("Car Details");
        System.out.println("Company Name : " + company_name);
        System.out.println("Model Name : " + model_name);
        System.out.println("Year of Purchase : " + year);
        System.out.println("Mileage : " + mileage);
    }
}
public class CarDetails {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter company Name: ");
        String company_name = scan.nextLine();
        System.out.print("Enter model name: ");
        String model_name = scan.nextLine();
        System.out.print("Enter year:");
        int year = scan.nextInt();
        System.out.print("Enter mileage: ");
        double mileage = scan.nextDouble();
        Car obj = new Car();
        obj.assign(company_name, model_name, year, mileage);
        obj.display();
        scan.close();
    }
}
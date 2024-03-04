// Write a Java program to create a class Employee with a method called Salary(). Create two subclasses headit and programmer. In each subclass, override the Salary() method to calculate and return the salary based on their specific roles.

import java.util.Scanner;

class Employee {
    void Salary() {
        System.out.println("Salary : 2000");
    }
}

class HeadIT extends Employee {
    double baseSalary=10000, yearsWorked, finalSalary;

    HeadIT(double yearsWorked) {
        this.yearsWorked = yearsWorked;
    }

    void Salary() {
        finalSalary = baseSalary + 1000*yearsWorked;
        System.out.println("Salary : " + finalSalary);
    }
}

class Programmer extends Employee {
    double baseSalary=5000, hoursWorked, finalSalary;

    Programmer(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    void Salary() {
        finalSalary = baseSalary + 10*hoursWorked;
        System.out.println("Salary : " + finalSalary);
    }
}

public class Employeesal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter years worked as HeadIT : ");
        double years = scan.nextDouble();
        HeadIT emp1 = new HeadIT(years);

        System.out.print("Enter hours worked as Programmer this month : ");
        double hours = scan.nextDouble();
        Programmer emp2 = new Programmer(hours);

        emp1.Salary();
        emp2.Salary();
        
        scan.close();
    }
}
package Assignment;
//Write a Java program to create a class called &quot;Employee&quot; with a name, jobtitle, and
// salaryattributes, and methods to calculate salary. Use constructor overloading and this
// keywords appropriately. (hint: Grosssalary=basic+hra+da, basic=Rs.50000, hra=12%,
// da=5%)
import java.util.*;
class Employee {
    String name, jobTitle;
    double basicSalary = 5000;
    double hra,da,grossSalary;
    public Employee(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }
    public Employee(String name, String jobTitle, double basicSalary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.basicSalary = basicSalary;
    }
    void salaryCalculator() {
        this.hra = this.basicSalary * 0.12;
        this.da = this.basicSalary * 0.05;
        this.grossSalary = this.basicSalary + this.hra + this.da;
    }
    void display() {
        System.out.println("Employee Details");
        System.out.println("Name:"+name);
        System.out.println("Job Title:"+jobTitle);
        System.out.println("Base salary:"+basicSalary);
        System.out.println("Gross salary:"+grossSalary);
    }
}
public class Employee {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Name 1:");
        String name1 = scan.nextLine();
        System.out.print("Enter job title 1:");
        String job_title1 = scan.nextLine();
        Employee emp1 = new Employee(name1,job_title1);
        emp1.salaryCalculator();
        emp1.display();
        System.out.print("Enter Name 2:");
        String name2 = scan.nextLine();
        System.out.print("Enter job title 2:");
        String job_title2 = scan.nextLine();
        System.out.print("Enter basic salary:");
        double basic_salary = scan.nextDouble();
        Employee emp2 = new Employee(name2,job_title2,basic_salary);
        emp2.salaryCalculator();
        emp2.display();
        scan.close();
    }
}
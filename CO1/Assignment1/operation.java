//Write a java program to perform arithmetic operation using switch case
import java.util.Scanner;
public class operation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scan.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scan.nextDouble();
        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice:");
        int choice = scan.nextInt();
        double result = 0;
        switch(choice){
            case 1:
                result = num1 + num2;
                System.out.println("Result: "+result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result: "+result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result: "+result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1/num2;
                    System.out.println("Result: "+result);
                } else {
                    System.out.println("Error");
                }
                break;
            default:
                System.out.println("Please enter a number between 1 to 4");
        }
        scan.close();
    }
}

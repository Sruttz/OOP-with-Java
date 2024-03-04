//Write a Java program that reads an integer between 0 and 1000 and adds all the digits in
// the integer.
// Test Data
// Input an integer between 0 and 1000: 565
// Expected Output :
// The sum of all digits in 565 is 16
import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Input an integer between 0 and 1000: ");
        int num = scan.nextInt();
        if (num<0||num>1000) {
            System.out.println("Invalid,enter an integer between 0 and 1000.");
        }
        int sum = 0;
        while (num>0) {
            sum+=num % 10;
            num/= 10;
        }
        System.out.println("The sum of all digits is: " + sum);
        scan.close();
    }
}

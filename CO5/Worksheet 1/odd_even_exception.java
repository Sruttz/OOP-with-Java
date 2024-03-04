///Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.
import java.util.Scanner;

public class odd_even_exception {

    public static void checkNumber(int num) {
        if(num % 2 != 0) {
            throw new IllegalArgumentException("Number is odd!");
        }
        System.out.println(num + " is even.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        try {
            checkNumber(num);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}
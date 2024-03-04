//1. Write a Java program to get a number from the user and print whether it is positive or negative.
import java.util.Scanner;
public class PosNeg{
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Number: ");
        int input = myObj.nextInt();
        myObj.close();
        if(input>0){
            System.out.println("Number is positive");
        }
        else if(input<0)
        {
            System.out.println("Number is negative");
        }
        else
        {
            System.out.println("Number is zero");
        }
    }
}
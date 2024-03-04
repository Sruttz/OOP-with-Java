//Write a program in Java to display the multiplication table of a given integer.
package Worksheet4;
import java.util.Scanner;
public class MultiplicationTable{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
	    System.out.print("Enter number:");        
	    int n=scan.nextInt();
        scan.close();
        for(int i=1; i <= 10; i++)
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}
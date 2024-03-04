//Write a java program to generate a following *'s triangle. 
// Input: 6 
// Expected Output :
// ******
// *****
// ****
// ***
// **
// *
import java.util.*;
public class w3q3 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows=sc.nextInt();
        sc.close();
        for(int i =1;i<=rows-1;i++)
        {
            for(int j=1;j<=i;j++) {
                System.out.print(" ");
            }
            for(int k=0;k<=rows-i-1;k++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
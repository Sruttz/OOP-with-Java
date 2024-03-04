//Java Programming Code to Find Largest Element in Array
package Worksheet4;
import java.util.Scanner;
public class LargestEle {
    public static void main(String[] args) 
    {
        int n,max;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size:");
        n = scan.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements of array:");
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        max=a[0];
        for(int i=0;i<n;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
        }
        scan.close();
        System.out.println("Maximum int is:"+max);
    }
}
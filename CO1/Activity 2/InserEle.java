//Java Programming Code to Insert Element in Array
import java.util.Scanner;
public class InserEle {
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter no. of elements:");
        int n = scan.nextInt();
        int a[] = new int[n+1];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        System.out.print("Enter the position:");
        int pos = scan.nextInt();
        System.out.print("Enter the element you want to insert:");
        int x = scan.nextInt();
        for(int i=(n-1);i>=(pos-1);i--)
        {
            a[i+1]=a[i];
        }
        a[pos-1]=x;
        System.out.print("After inserting:");
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.print(a[n]);
        scan.close();
    }
}

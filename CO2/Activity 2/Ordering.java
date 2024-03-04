// Order() - Set the value of status to 'Ordered'.
// Order(int orderId, String orderedFoods)- Initialize the instance variables appropriately with the values passed to the constructor. Set the value of status to 'Ordered'.
// Create an object of the Order class by using the parameterless constructor and display the value of the status instance variable in the main() method of the Tester class. 
// Create one more object of the Order class by using the parameterized constructor and display the value of orderId, orderFoods and status instance variables in the main() method of the Tester class.
import java.util.Scanner;
import java.util.Arrays;
class order
{
    String status;

    order()
    {
        this.status="ordered";

    }

    void Order(int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.println("Status of order "+(i+1)+":"+status);
        }
    }

    void Order(int orderID, String []orderedfoods)
    {
        System.out.println("\nThe ID of order for "+((orderedfoods.length))+" :"+orderID);
        System.out.println("\nThe ordered items: "+ Arrays.toString(orderedfoods));
    }
}
public class Ordering {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of foods you want to order: " );
        int n=sc.nextInt();
        String arr[]= new String[n];
        sc.nextLine();//
        System.out.println("Enter the items to be ordered: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLine();
        }
        sc.close();
        order ob=new order();
        ob.Order(n);
        ob.Order(1001,arr);

    }
}
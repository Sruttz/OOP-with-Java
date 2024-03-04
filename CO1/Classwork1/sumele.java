//Use scanner class and for loop 1. sum of array elements
package Classwork1;
import java.util.Scanner;
public class sumele {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter length of array : ");
        int size = myObj.nextInt();

        int myArray[] = new int[size];

        for(int i=0; i<size; i++) {
            System.out.print("Enter array element : ");
            int ele = myObj.nextInt();
            myArray[i] = ele;
        }

        myObj.close();
        int sum = 0;
        for(int j=0; j<size; j++){
            sum = sum + myArray[j];
        }

        System.out.println("Sum : " + sum);
    }
}

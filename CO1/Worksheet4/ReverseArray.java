//Java Programming Code to Reverse an Array
package Worksheet4;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Array:");
        int size=scan.nextInt();
        int array[]=new int [size];
        for(int i=0;i<size;i++) {
            array[i]=scan.nextInt();
        }
        int start=0;
        int end=size-1;
        while(start<end) {
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
        System.out.println("Reverse Array");
        for(int i=0;i<=size;i++) {
            System.out.println(array[i]);
        }
        scan.close();
    }
}
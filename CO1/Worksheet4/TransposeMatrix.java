//Java Programming Code to Transpose Matrix
package Worksheet4;
import java.util.Scanner;
public class TransposeMatrix {
    public static void main(String[] args) {
        int i,j;
        System.out.println("Enter rows and columns: ");
        Scanner scan=new Scanner(System.in);
        int row=scan.nextInt();
        int column=scan.nextInt();
        int array[][]=new int[row][column];
        System.out.println("Enter matrix:");
         for(i=0;i<row;i++)
          {
               for(j=0;j<column;j++) 
                 {
                array[i][j] = scan.nextInt();
                System.out.print(" ");
                }
          }
        System.out.println("The transpose is ");
          for(i=0;i<row;i++)
            {
                  for(j=0;j<column;j++)
                {
                  System.out.print(array[i][j]+" ");
                }
                System.out.println(" ");
            }
         System.out.println("The transpose is ");
          for(i=0;i<column;i++)
            {
                  for(j=0;j<row;j++)
                {
                    System.out.print(array[j][i]+" ");
                }
                System.out.println(" ");
            }
        }
}

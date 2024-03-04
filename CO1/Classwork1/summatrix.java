//Use scanner class and for loop for Addition of 2 matrices
package Classwork1;
import java.util.Scanner;
public class summatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the rows size:");
        int row = scan.nextInt();
        System.out.print("Enter the column size:");
        int col = scan.nextInt();
        int[][] matrix1 = new int[row][col];
        int[][] matrix2 = new int[row][col];
        int[][] result  = new int[row][col];
        scan.close();
        System.out.print("Enter the matrix1 elements:");
        for (int i = 0; i <row;i++){
            for(int j = 0;j <col;j++)
                matrix1[i][j] = scan.nextInt();
        }

        System.out.print("Enter the matrix2 elements:");
        for (int i = 0; i <row;i++){
            for(int j = 0;j <col;j++)
                matrix2[i][j] = scan.nextInt();
        }

        System.out.println("The result matrix is:");
        for (int i = 0; i <row;i++){
            for(int j = 0;j <col;j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}

//Write a program in Java to make such a pattern like right angle triangle with a number
    // which will repeat a number in a row. The pattern is as follows
    // 1
    // 22
    // 333
    // 4444
import java.util.Scanner;
public class Righttriangle {
    public static void main(String[] args)
    {
        int i,j,n;
        System.out.print("Input number of n : ");
        Scanner myobj1 = new Scanner(System.in);
		n = myobj1.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}
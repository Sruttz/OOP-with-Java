//Write a Java program to check whether you are eligible for vote or not? by taking user input as age.
import java.util.Scanner;
public class w3q1 {
    public static void main(String[] args){
        Scanner myObj2 = new Scanner(System.in);
        System.out.println("Age: ");
        int age = myObj2.nextInt();
        myObj2.close();
        if(age<18){
            System.out.println("Not eligible to vote");
        }
        else
        {
            System.out.println("Eligible to vote");
        }
    }
}

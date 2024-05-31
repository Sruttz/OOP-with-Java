//Program to print random numbers in a given range.
import java.util.Random;
public class RandomNumbers {
   public static void main(String[] args) {
       int min = 1;
       int max = 100;
       Random random = new Random();
       System.out.println("Random numbers between " + min + " and " + max + ":");
       for (int i = 0; i < 10; i++) {
           int num = random.nextInt(max - min + 1) + min;
           System.out.println(num);
       }
   }
}

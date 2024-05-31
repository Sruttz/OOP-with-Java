// Write a Java program which first generates a set of random numbers and
// then determines negative, positive even, positive odd numbers
// concurrently.
import java.util.Random;
import static java.lang.Thread.sleep;
class thread_t
{
public void determine_negative (int [] arr)
{
    System.out.println("negative");
    for(int i=0 ; i<arr.length ;i++)
    {
    if(arr[i] < 0)
    {
    System.out.println(i);
    }
    try
    {
    sleep(1000);
    }
    catch (Exception e)
    {
    System.out.println(e);
    }
    }
    }
    public void positive_even (int [] arr)
    {
    System.out.println("positive even");
    for(int i=0 ; i<arr.length;i++)
    {
    if(i>0 && i%2 ==0)
    {
    System.out.println(i);
    }
    }
    }
    public void positive_odd (int [] arr)
    {
    System.out.println("positive odd");
    for(int i=0 ; i<=arr.length;i++)
    {
    if(i>0 && i%2 !=0)
    {
    System.out.println(i);
    }
    }
}
}
public class RandomNum {
public static void main (String args [])
{
// int max =100;
// int min =-100;
    Random r = new Random();
    int [] arr = new int[10];
    for(int i=0 ; i<10;i++)
    {
    // numbers[i] = random.nextInt(max - min + 1) + min;
    arr[i] = r.nextInt(100);
    }
    for (int i=0 ;i< arr.length;i++)
    {
    System.out.println(i);
    }
    thread_t t = new thread_t();
    new Thread()
    {
    public void run ()
    {
    t.determine_negative(arr);
    }
    }.start();
    try
    {
    sleep(200);
    }
    catch (InterruptedException e)
    {
    }
    new Thread()
    {
    public void run ()
    {
    t.positive_even(arr);
    }
    }.start();
    new Thread()
    {
    public void run ()
    {
    t.positive_odd(arr);
    }
    }.start();
    }
}